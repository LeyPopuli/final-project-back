package com.charactergeneratorgroup.charactergenerator.classes;

import com.charactergeneratorgroup.charactergenerator.model.*;
import org.apache.pdfbox.cos.COSArray;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import java.io.File;
import java.io.IOException;

public class PdfGenerator {
    private static final String FORM_TEMPLATE_PATH = "character-generator/src/main/resources/templates/hero-sheet-template.pdf";

    public byte[] generateHeroSheet(Hero hero) throws IOException {

        PDDocument pdfDocument = PDDocument.load(new File(FORM_TEMPLATE_PATH));
        PDAcroForm acroForm = pdfDocument.getDocumentCatalog().getAcroForm();

        if (acroForm != null) {
                setFieldValue(acroForm, "USER", hero.getUser().getUserName());

            if (hero.getName() != null && !hero.getName().isEmpty()) {
                setFieldValue(acroForm, "NAME", hero.getName());
            }
            if (hero.getConcept() != null && !hero.getConcept().isEmpty()) {
                setFieldValue(acroForm, "CONCEPT", hero.getConcept());
            }
                setFieldValue(acroForm, "NATION", hero.getNation().getName());
                setFieldValue(acroForm, "RELIGION", hero.getReligion().getName());

                setLanguagesFieldValue(acroForm, "LANGUAGES", hero.getLanguages());
            if (hero.getReputation() != null && !hero.getReputation().isEmpty()) {
                setFieldValue(acroForm, "REPUTATION", hero.getReputation());
            }

            if (hero.getRichness() != null) {
                setFieldValue(acroForm, "RICHNESS", hero.getRichness().toString());
            }
                setArcanaFieldValue(acroForm, "ARCANA", hero.getVirtue(), hero.getHybris());
                setCheckboxesForCharacteristics(acroForm, hero.getCharacteristics());
                setCheckboxesForSkills(acroForm, hero.getSkills());
                setBackgrounds(acroForm, "BACKGROUNDS", hero.getBackgrounds());
                setAdvantages(acroForm, "ADVANTAGES", hero.getAdvantages());
            }


        PDPage page = pdfDocument.getPage(0);

        if (hero.getImageUrl() != null && !hero.getImageUrl().isEmpty()) {
            URL url = new URL(hero.getImageUrl());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                pdfDocument.save(byteArrayOutputStream);
                pdfDocument.close();
                return byteArrayOutputStream.toByteArray();
            }

            BufferedImage img = ImageIO.read(url);
            int originalWidth = img.getWidth();
            int originalHeight = img.getHeight();

            int cropWidth = Math.min(originalWidth, originalHeight);
            int cropHeight = Math.min(originalWidth, originalHeight);
            int cropX = (originalWidth - cropWidth) / 2;
            int cropY = (originalHeight - cropHeight) / 2;

            BufferedImage croppedImg = img.getSubimage(cropX, cropY, cropWidth, cropHeight);

            PDImageXObject pdImage = LosslessFactory.createFromImage(pdfDocument, croppedImg);

            PDPageContentStream contentStream = new PDPageContentStream(pdfDocument, page, PDPageContentStream.AppendMode.APPEND, true, true);

            float x = 65;
            float y = 0;
            float width = 275;
            float height = 275;

            contentStream.drawImage(pdImage, x, y, width, height);

            contentStream.close();
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pdfDocument.save(byteArrayOutputStream);
        pdfDocument.close();

        return byteArrayOutputStream.toByteArray();
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
                advantageString.append(name).append(":").append(peculiarity).append("\n");
            }
            field.setValue(advantageString.toString());
        }
    }

    private void setLanguagesFieldValue(PDAcroForm acroForm, String fieldName, List<Language> languages) throws IOException {
        PDField field = acroForm.getField(fieldName);
        if (field != null) {
            StringBuilder fieldValue = new StringBuilder();
            for (int i = 0; i < languages.size(); i++) {
                Language language = languages.get(i);
                if (i > 0) {
                    fieldValue.append(", ");
                }
                if (i > 0 && language.getName().length() > 0) {
                    fieldValue.append(Character.toLowerCase(language.getName().charAt(0)));
                    if (language.getName().length() > 1) {
                        fieldValue.append(language.getName().substring(1));
                    }
                } else {
                    fieldValue.append(language.getName());
                }
            }
            fieldValue.append(".");
            field.setValue(fieldValue.toString());
        }
    }

    private void setArcanaFieldValue(PDAcroForm acroForm, String fieldName, Virtue virtue, Hybris hybris) throws IOException {
        PDField field = acroForm.getField(fieldName);
        if (field != null) {
            String arcanaString = virtue.getName().toUpperCase() + ":" +
                    virtue.getDescription() + "\n" +
                    hybris.getName().toUpperCase() + ":" +
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

    public void setImage(PDDocument document, String name, PDImageXObject image)
            throws IOException {

        PDAcroForm acroForm = document.getDocumentCatalog().getAcroForm();
        PDField field = acroForm.getField(name);
        if (field != null) {
            PDRectangle rectangle = getFieldArea(field);
            float size = rectangle.getHeight();
            float x = rectangle.getLowerLeftX();
            float y = rectangle.getLowerLeftY();

            try (PDPageContentStream contentStream = new PDPageContentStream(document,
                    document.getPage(0), PDPageContentStream.AppendMode.APPEND, true)) {
                contentStream.drawImage(image, x, y, size, size);
            }
        }
    }

    private PDRectangle getFieldArea(PDField field) {
        COSDictionary fieldDict = field.getCOSObject();
        COSArray fieldAreaArray = (COSArray) fieldDict.getDictionaryObject(COSName.RECT);
        return new PDRectangle(fieldAreaArray);
    }

}