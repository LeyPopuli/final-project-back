package com.charactergeneratorgroup.charactergenerator.service.impl;

import com.charactergeneratorgroup.charactergenerator.controller.handler.CustomException;
import com.charactergeneratorgroup.charactergenerator.model.*;
import com.charactergeneratorgroup.charactergenerator.classes.PdfGenerator;
import com.charactergeneratorgroup.charactergenerator.repository.*;
import com.charactergeneratorgroup.charactergenerator.service.interfaces.HeroServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


@Service
public class HeroService implements HeroServiceInterface {

    @Autowired
    ConceptRepository conceptRepository;

    @Autowired
    NationRepository nationRepository;

    @Autowired
    NameRepository nameRepository;

    @Autowired
    CharacteristicRepository characteristicRepository;

    @Autowired
    SkillRepository skillRepository;

    @Autowired
    BackgroundRepository backgroundRepository;

    @Autowired
    AdvantageRepository advantageRepository;

    @Autowired
    HybrisRepository hybrisRepository;

    @Autowired
    VirtueRepository virtueRepository;

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    LanguageRepository languageRepository;

    @Autowired
    UserRepository userRepository;

    public Hero createRandomHero(String userName) {

        Hero newHero = new Hero();

//      Taking all the records from the database.
        List<Concept> allConcepts = conceptRepository.findAll();
        List<Nation> allNations = nationRepository.findAll();
        List<Name> allNames = nameRepository.findAll();
        List<Characteristic> allCharacteristics = characteristicRepository.findAll();
        List<Skill> allSkills = skillRepository.findAll();
        List<Background> allBackgrounds = backgroundRepository.findAll();
        List<Advantage> allAdvantages = advantageRepository.findAll();
        List<Hybris> allHybris = hybrisRepository.findAll();
        List<Virtue> allVirtues = virtueRepository.findAll();
        List<Language> allLanguages = languageRepository.findAll();

//      Initializing attributes
        newHero.characteristicInitialization(allCharacteristics);
        newHero.skillsInitialization(allSkills);

//      Obtaining random values for each attribute
        newHero.addRandomConcept(allConcepts);
        newHero.addRandomNation(allNations);
        newHero.addRandomName(allNames);
        newHero.initialPointsAssignationByNationRandom();
        newHero.addRestRandomCharacteristic(allCharacteristics);
        newHero.initializeLanguages(allLanguages);
        newHero.addRandomBackgrounds(allBackgrounds, allAdvantages);
        newHero.addARandomVirtue(allVirtues);
        newHero.addARandomHybris(allHybris);
        newHero.addRandomReligion();
        newHero.addARandomsLanguages(allLanguages);

        return newHero;

    }

    public void saveHero(String userName, Hero hero) {
        for (HeroCharacteristic heroCharacteristic : hero.getCharacteristics()) {
            heroCharacteristic.setHero(hero);
        }
        for (HeroSkill heroskill : hero.getSkills()) {
            heroskill.setHero(hero);
        }

        Optional<User> userOptional = userRepository.findByUserName(userName);
        User user = userOptional.orElseThrow(() -> new CustomException("User not found."));

        hero.setUser(user);

        heroRepository.save(hero);
    }

    public Hero getHeroByUserAndId(String userName, Long id) {

        Optional<Hero> heroOptional = heroRepository.findByUser_UserNameAndId(userName, id);

        return heroOptional.orElseThrow(() -> new CustomException("Hero not found."));
    }

    public byte[] downloadPdf(String username, Long id) throws IOException {
        Hero hero = heroRepository.findByUser_UserNameAndId(username, id).orElseThrow(() -> new CustomException("Hero not found"));

        PdfGenerator pdfGenerator = new PdfGenerator();

        return pdfGenerator.generateHeroSheet(hero);
    }

    public void deleteById(String userName, Long id) {
        Optional<Hero> heroOptional = heroRepository.findByUser_UserNameAndId(userName, id);
        Hero hero = heroOptional.orElseThrow(() -> new CustomException("Hero not found."));
        heroRepository.delete(hero);
    }
}
