package com.charactergeneratorgroup.charactergenerator.service.impl;

import com.charactergeneratorgroup.charactergenerator.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    AdvantageRepository advantageRepository;

    @Autowired
    BackgroundRepository backgroundRepository;

    @Autowired
    CharacteristicRepository characteristicRepository;

    @Autowired
    ConceptRepository conceptRepository;

    @Autowired
    HybrisRepository hybrisRepository;

    @Autowired
    NameRepository nameRepository;

    @Autowired
    NationRepository nationRepository;

    @Autowired
    SkillRepository skillRepository;

    @Autowired
    VirtueRepository virtueRepository;

    @Autowired
    VirtueRepository languageRepository;


}
