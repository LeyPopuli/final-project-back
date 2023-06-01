package com.charactergeneratorgroup.charactergenerator.service.impl;

import com.charactergeneratorgroup.charactergenerator.model.*;
import com.charactergeneratorgroup.charactergenerator.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HeroService {

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

    public Hero createRandomHero(String user) {

        try {
            Hero newHero = new Hero();

            newHero.setUser(user);

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

//      Initializing attributes
            newHero.characteristicInitialization(allCharacteristics);
            newHero.skillsInitialization(allSkills);

//      Obtaining random values for each attribute
            newHero.addRandomConcept(allConcepts);
            newHero.addRandomNation(allNations);
            newHero.addRandomName(allNames);
            newHero.initialPointsAssignationByNationRandom();
            newHero.addRestRandomCharacteristic(allCharacteristics);
            newHero.addRandomBackgrounds(allBackgrounds, allAdvantages);
            newHero.addARandomVirtue(allVirtues);
            newHero.addARandomHybris(allHybris);
            newHero.addRandomReligion();

            return newHero;

        } catch (Exception e) {
            String errorMessage = "Error creating random hero: " + e.getMessage();
            Hero errorHero = new Hero();
            errorHero.setError(errorMessage);

            return errorHero;
        }
    }
}
