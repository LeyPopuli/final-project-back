package com.charactergeneratorgroup.charactergenerator.model.classes;

import com.charactergeneratorgroup.charactergenerator.model.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import java.io.File;
import java.io.IOException;

public class PdfGenerator {
    private static final String FORM_TEMPLATE_PATH = "character-generator/src/main/resources/templates/hero-sheet-template.pdf";
    private static final String OUTPUT_FOLDER = "character-generator/src/main/resources/static/";


    public String generateHeroSheet(Hero hero) throws IOException {

        PDDocument pdfDocument = PDDocument.load(new File(FORM_TEMPLATE_PATH));
        PDAcroForm acroForm = pdfDocument.getDocumentCatalog().getAcroForm();

        if (acroForm != null) {
            setFieldValue(acroForm, "USER", hero.getUser().getUserName());
            setFieldValue(acroForm, "NAME", hero.getName());
            setFieldValue(acroForm, "CONCEPT", hero.getConcept());
            setFieldValue(acroForm, "NATION", hero.getNation().getName());
            setFieldValue(acroForm, "RELIGION", hero.getReligion().getName());

            setLanguagesFieldValue(acroForm, "LANGUAGES", hero.getLanguages());
            setFieldValue(acroForm, "REPUTATION", hero.getReputation());
            setFieldValue(acroForm, "RICHNESS", hero.getRichness().toString());
            setArcanaFieldValue(acroForm, "ARCANA", hero.getVirtue(), hero.getHybris());
            setCheckboxesForCharacteristics(acroForm, hero.getCharacteristics());
            setCheckboxesForSkills(acroForm, hero.getSkills());
            setBackgrounds(acroForm, "BACKGROUNDS", hero.getBackgrounds());
            setAdvantages(acroForm, "ADVANTAGES", hero.getAdvantages());
        }

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String fileName = "7thHero_" + hero.getName().replace(" ", "") + "_" + timestamp + ".pdf";
        String outputPath = OUTPUT_FOLDER + fileName;

        pdfDocument.save(outputPath);
        pdfDocument.close();

        return fileName;
    }

    private void setFieldValue(PDAcroForm acroForm, String fieldName, String value) throws IOException {
        PDField field = acroForm.getField(fieldName);
        if (field != null) {
            field.setValue(value);
        }
    }

    private void setBackgrounds(PDAcroForm acroForm, String fieldName, List<Background> backgrounds) throws IOException {
        PDField field = acroForm.getField(fieldName);
        if (field != null) {
            StringBuilder backgroundsString = new StringBuilder();
            for (Background background : backgrounds) {
                String name = background.getName().toUpperCase();
                String peculiarity = background.getPeculiarity();
                backgroundsString.append(name).append("\n").append(peculiarity).append("\n").append("\n");
            }
            field.setValue(backgroundsString.toString());
        }
    }

    private void setAdvantages(PDAcroForm acroForm, String fieldName, List<Advantage> advantages) throws IOException {
        PDField field = acroForm.getField(fieldName);
        if (field != null) {
            StringBuilder advantageString = new StringBuilder();
            for (Advantage advantage : advantages) {
                String name = advantage.getName().toUpperCase();
                String peculiarity = advantage.getDescription();
                advantageString.append(name).append("\n").append(peculiarity).append("\n").append("\n");
            }
            field.setValue(advantageString.toString());
        }
    }

    private void setLanguagesFieldValue(PDAcroForm acroForm, String fieldName, List<Language> languages) throws IOException {
        PDField field = acroForm.getField(fieldName);
        if (field != null) {
            StringBuilder fieldValue = new StringBuilder();
            for (Language language : languages) {
                fieldValue.append(language.getName()).append("\n");
            }
            field.setValue(fieldValue.toString());
        }
    }

    private void setArcanaFieldValue(PDAcroForm acroForm, String fieldName, Virtue virtue, Hybris hybris) throws IOException {
        PDField field = acroForm.getField(fieldName);
        if (field != null) {
            String arcanaString = virtue.getName().toUpperCase() + "\n" +
                    virtue.getDescription() + "\n\n" +
                    hybris.getName().toUpperCase() + "\n" +
                    hybris.getDescription() + "\n";
            field.setValue(arcanaString);
        }
    }

    private void setCheckboxesForCharacteristics(PDAcroForm acroForm, List<HeroCharacteristic> characteristics) throws IOException {
        for (HeroCharacteristic heroCharacteristic : characteristics) {
            String characteristicId = heroCharacteristic.getCharacteristic().getId();
            Integer level = heroCharacteristic.getLevel();
            for (int i = 1; i <= level; i++) {
                String fieldName = characteristicId + "-" + i;
                setFieldValue(acroForm, fieldName, "Yes");
            }
        }
    }

    private void setCheckboxesForSkills(PDAcroForm acroForm, List<HeroSkill> skills) throws IOException {
        for (HeroSkill heroSkill : skills) {
            String skillId = heroSkill.getSkill().getId();
            Integer level = heroSkill.getLevel();
            for (int i = 1; i <= level; i++) {
                String fieldName = skillId + "-" + i;
                setFieldValue(acroForm, fieldName, "Yes");
            }
        }
    }

}