package com.charactergeneratorgroup.charactergenerator.model;

import com.charactergeneratorgroup.charactergenerator.controller.handler.CustomException;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import java.util.*;

@Data
@Entity
@DynamicUpdate
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

//    @NotEmpty(message = "You must supply a name for the character.")
    @Size(max = 30, message = "The name cannot exceed 30 characters.")
    private String name;

//    @NotEmpty(message = "You must supply a concept for the character.")
    @Size(max = 40, message = "The concept cannot exceed 40 characters.")
    private String concept;

    //Optional
    @ManyToOne
    private Nation nation;

    //Optional
    @ManyToOne
    private Religion religion;

    //Optional
    @Size(max = 30, message = "The reputation cannot exceed 30 characters.")
    private String reputation = "";

    //Optional
    @Size(max = 30, message = "The richness cannot exceed 30 characters.")
    private Integer richness = 0;

    //Optional
    @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL)
    private List<HeroCharacteristic> characteristics  = new ArrayList<>();

    //Optional
    @ManyToMany
    private List<Background> backgrounds = new ArrayList<>();

    //Optional
    @ManyToMany
    private List<Advantage> advantages = new ArrayList<>();

    //Optional
    @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL)
    private List<HeroSkill> skills  = new ArrayList<>();

    //Optional
    @ManyToOne
    private Virtue virtue;

    //Optional
    @ManyToOne
    private Hybris hybris;

    //Optional
    @Column(length = 1000)
    private String imageUrl;

    @ManyToMany
    private List<Language> languages = new ArrayList<>();

    private Integer maximumBackgrounds = 2;

    private Integer remainingBackgrounds = 2;


    private Integer remainingCharacteristicPoints = 2;

    private Integer maximumCharacteristicLevel = 5;


    private Integer maximumSkillLevel = 3;

    private Integer remainingSkillPoints = 10;


    private Integer remainingAdvantagePoints = 5;

    private Integer maximumAdvantagePoints = 5;

    private Integer remainingAdditionalLanguages = 0;

    private String error;


//    NoArgsConstructor
    public Hero() {
    }

    public void characteristicInitialization(List<Characteristic> allCharacteristics){

        for (Characteristic characteristic : allCharacteristics) {
            HeroCharacteristic heroCharacteristic = new HeroCharacteristic();
            heroCharacteristic.setCharacteristic(characteristic);
            heroCharacteristic.setLevel(2);
            characteristics.add(heroCharacteristic);
        }

    }

    private void incrementCharacteristicWithoutCost(Characteristic characteristic, Integer points) {

        for (HeroCharacteristic heroCharacteristic : characteristics) {
            if (heroCharacteristic.getCharacteristic().equals(characteristic)) {
                int currentValue = heroCharacteristic.getLevel();
                int updatedValue = currentValue + points;
                heroCharacteristic.setLevel(updatedValue);
                break;
            }
        }
    }

    private void incrementCharacteristic(Characteristic characteristic, Integer points) throws CustomException {

        if (this.remainingCharacteristicPoints >= points) {
            for (HeroCharacteristic heroCharacteristic : characteristics) {
                if (heroCharacteristic.getCharacteristic().equals(characteristic)) {
                    int currentValue = heroCharacteristic.getLevel();
                    int updatedValue = currentValue + points;
                    heroCharacteristic.setLevel(updatedValue);
                    break;
                }
            }
            this.remainingCharacteristicPoints -= points;
        } else {
            throw new CustomException("Insufficient points");
        }
    }

    private void decrementCharacteristic(Characteristic characteristic, Integer points) throws CustomException {
        boolean foundCharacteristic = false;
        for (HeroCharacteristic heroCharacteristic : characteristics) {
            if (heroCharacteristic.getCharacteristic().equals(characteristic)) {
                foundCharacteristic = true;
                int currentValue = heroCharacteristic.getLevel();
                if (currentValue - points >= 0) {
                    int updatedValue = currentValue - points;
                    heroCharacteristic.setLevel(updatedValue);
                    this.remainingAdvantagePoints += points;
                } else {
                    throw new CustomException("Insufficient points in the characteristic.");
                }
                break;
            }
        }

        if (!foundCharacteristic) {
            throw new CustomException("Characteristic not found in this hero.");
        }
    }

    private Characteristic getCharacteristicById(String id) throws CustomException {
        for (HeroCharacteristic heroCharacteristic : characteristics) {
            if (heroCharacteristic.getCharacteristic().getId().equals(id)) {
                return heroCharacteristic.getCharacteristic();
            }
        }
        throw new CustomException("Characteristic not found with ID: " + id);
    }

    public void removeBackground(Background background) throws CustomException {
        if (this.backgrounds.contains(background)) {
            this.backgrounds.remove(background);
            List<Advantage> newAdvantages = background.getAdvantages();
            this.advantages.removeAll(newAdvantages);
            List<Skill> newSkills = background.getSkills();
            for (Skill skill : newSkills) {
                this.removeSkillLevel(skill, 1);
            }
            this.remainingBackgrounds += 1;
        } else {
            System.out.println("Background doesn't exist in this character.");
            throw new CustomException("Background doesn't exist in this character.");
        }
    }

    public void addBackground(Background background) throws CustomException {
        if (this.backgrounds.contains(background)) {
            System.out.println("Background already exists in this character.");
            throw new CustomException("Background already exists in this character.");
        } else if (this.backgrounds.size() >= maximumBackgrounds) {
            System.out.println("Maximum number of backgrounds reached for this character, remove one before adding a new one.");
            throw new CustomException("Maximum number of backgrounds reached for this character, remove one before adding a new one.");
        } else {
            this.backgrounds.add(background);
            List<Advantage> newAdvantages = background.getAdvantages();
            this.advantages.addAll(newAdvantages);
            List<Skill> newSkills = background.getSkills();
            for (Skill skill : newSkills) {
                this.addSkillLevel(skill, 1);
            }
            this.remainingBackgrounds -= 1;
        }
    }

    public void skillsInitialization(List<Skill> allSkills) {

        for (Skill skill : allSkills) {
            HeroSkill heroSkill = new HeroSkill();
            heroSkill.setSkill(skill);
            heroSkill.setLevel(0);
            skills.add(heroSkill);
        }
    }

    public void addSkillLevel(Skill skill, Integer points) throws CustomException {
        for (HeroSkill heroskill : skills) {
            if (heroskill.getSkill().equals(skill)) {
                if (heroskill.getLevel() + points <= maximumSkillLevel && this.remainingSkillPoints >= points) {
                    int value = heroskill.getLevel();
                    heroskill.setLevel(value + points);
                    this.remainingSkillPoints -= points;
                } else {
                    System.out.println("The level of a skill cannot exceed level 5 and you need to have enough points.");
                    throw new CustomException("The level of a skill cannot exceed level 5 and you need to have enough points.");
                }
            }
        }

    }

    public void removeSkillLevel(Skill skill, Integer points) throws CustomException {

        for (HeroSkill heroSkill : skills) {
            if (heroSkill.getSkill().equals(skill)) {
                if (heroSkill.getLevel() - points >= 0) {
                    int value = heroSkill.getLevel();
                    heroSkill.setLevel(value - points);
                    this.remainingSkillPoints += points;
                } else {
                    System.out.println("The level of a skill cannot be lower than level 0. ");
                    throw new CustomException("The level of a skill cannot be lower than level 0. ");
                }
            }
        }
    }

    public List<Advantage> checkDuplicateAdvantages(){
        List<Advantage> duplicates = new ArrayList<>();
        for (Advantage advantage : this.advantages) {
            if (!duplicates.contains(advantage) && Collections.frequency(this.advantages, advantage) > 1) {
                duplicates.add(advantage);
            }
        }
        return duplicates;
    }

    private void addAdvantage(Advantage advantage) throws CustomException{

        if (this.remainingAdvantagePoints - advantage.getPoints() >= 0 && !this.advantages.contains(advantage)) {
            this.advantages.add(advantage);
            this.remainingAdvantagePoints -= advantage.getPoints();
        } else {
            System.out.println("It is not possible to add this advantage. Check that you do not already have this advantage or that the points are enough.");
            throw new CustomException("It is not possible to add this advantage. Check that you do not already have this advantage or that the points are enough.");
        }
    }

    private void removeAdvantage(Advantage advantage) throws CustomException{

        if (this.advantages.contains(advantage)) {
            this.advantages.remove(advantage);
            this.remainingAdvantagePoints += advantage.getPoints();
        } else {
            System.out.println("It is not possible to remove this advantage. Check if you have it before deleting it.");
            throw new CustomException("It is not possible to remove this advantage. Check if you have it before deleting it.");
        }
    }

    public void addVirtue(Virtue virtue) throws CustomException {
        if (this.virtue != null) {
            System.out.println("This hero already has a virtue. Remove it first.");
            throw new CustomException("This hero already has a virtue. Remove it first.");
        } else {
            this.virtue = virtue;
        }
    }

    public void removeVirtue() throws CustomException {
        if (this.virtue != null) {
            this.virtue = null;
        } else {
            System.out.println("This hero has no virtue to be eliminated.");
            throw new CustomException("This hero has no virtue to be eliminated.");
        }
    }

    public void addHybris(Hybris hybris) throws CustomException {
        if (this.hybris != null) {
            System.out.println("This hero already has a hibris. Remove it first.");
            throw new CustomException("This hero already has a hibris. Remove it first.");
        } else {
            this.hybris = hybris;
        }
    }


    public void removeHybris() throws CustomException {
        if (this.hybris != null) {
            this.hybris = null;
        } else {
            System.out.println("This hero has no hibris to be eliminated.");
            throw new CustomException("This hero has no hibris to be eliminated.");
        }
    }

    public void addRandomName(List<Name> allNames){
        Random random = new Random();
        List<Name> filteredNames = new ArrayList<>();

        for (Name name : allNames) {
            if (name.getNation().equals(this.nation)) {
                filteredNames.add(name);
            }
        }

        if (!filteredNames.isEmpty()) {
            int randomIndex = random.nextInt(filteredNames.size());
            Name randomName = filteredNames.get(randomIndex);

            this.name = randomName.getName();
        }
    }

    public void addRandomReligion(){
        this.religion = this.nation.getReligion();
    }

    public void addRandomConcept(List<Concept> allConcepts){
        Random random = new Random();

        int randomIndex = random.nextInt(allConcepts.size());
        Concept randomConcept = allConcepts.get(randomIndex);

        this.concept = randomConcept.getName();

    }

    public void addRandomNation(List<Nation> allNations){
        Random random = new Random();

        int randomIndex = random.nextInt(allNations.size());

        this.nation = allNations.get(randomIndex);

    }

    public void initialPointsAssignationByNationRandom() throws CustomException {
        Random random = new Random();
        int randomNumber = random.nextInt(2);

        switch (this.nation.getId()) {
            case "AVALON" -> {
                Characteristic characteristic;
                if (randomNumber == 0) {
                    characteristic = this.getCharacteristicById("DONAIRE");
                } else {
                    characteristic = this.getCharacteristicById("BRIO");
                }
                this.incrementCharacteristicWithoutCost(characteristic, 1);
            }
            case "CASTILLA" -> {
                Characteristic characteristic;
                if (randomNumber == 0) {
                    characteristic = this.getCharacteristicById("MANA");
                } else {
                    characteristic = this.getCharacteristicById("INGENIO");
                }
                this.incrementCharacteristicWithoutCost(characteristic, 1);
            }
            case "EISEN" -> {
                Characteristic characteristic;
                if (randomNumber == 0) {
                    characteristic = this.getCharacteristicById("MUSCULO");
                } else {
                    characteristic = this.getCharacteristicById("BRIO");
                }
                this.incrementCharacteristicWithoutCost(characteristic, 1);
            }
            case "INISMORE" -> {
                Characteristic characteristic;
                if (randomNumber == 0) {
                    characteristic = this.getCharacteristicById("DONAIRE");
                } else {
                    characteristic = this.getCharacteristicById("INGENIO");
                }
                this.incrementCharacteristicWithoutCost(characteristic, 1);
            }
            case "LASMARCASALTAS" -> {
                Characteristic characteristic;
                if (randomNumber == 0) {
                    characteristic = this.getCharacteristicById("MUSCULO");
                } else {
                    characteristic = this.getCharacteristicById("MANA");
                }
                this.incrementCharacteristicWithoutCost(characteristic, 1);
            }
            case "MONTAIGNE" -> {
                Characteristic characteristic;
                if (randomNumber == 0) {
                    characteristic = this.getCharacteristicById("MANA");
                } else {
                    characteristic = this.getCharacteristicById("DONAIRE");
                }
                this.incrementCharacteristicWithoutCost(characteristic, 1);
            }
            case "MANCOMUNIDADSARMATA" -> {
                Characteristic characteristic;
                if (randomNumber == 0) {
                    characteristic = this.getCharacteristicById("MUSCULO");
                } else {
                    characteristic = this.getCharacteristicById("DONAIRE");
                }
                this.incrementCharacteristicWithoutCost(characteristic, 1);
            }
            case "USSURA" -> {
                Characteristic characteristic;
                if (randomNumber == 0) {
                    characteristic = this.getCharacteristicById("BRIO");
                } else {
                    characteristic = this.getCharacteristicById("INGENIO");
                }
                this.incrementCharacteristicWithoutCost(characteristic, 1);
            }
            case "VESTENMENNAVENJAR" -> {
                Characteristic characteristic;
                if (randomNumber == 0) {
                    characteristic = this.getCharacteristicById("MUSCULO");
                } else {
                    characteristic = this.getCharacteristicById("INGENIO");
                }
                this.incrementCharacteristicWithoutCost(characteristic, 1);
            }
            case "VODACCE" -> {
                Characteristic characteristic;
                if (randomNumber == 0) {
                    characteristic = this.getCharacteristicById("MANA");
                } else {
                    characteristic = this.getCharacteristicById("BRIO");
                }
                this.incrementCharacteristicWithoutCost(characteristic, 1);
            }
        }
    }

    public void addRestRandomCharacteristic(List<Characteristic> allCharacteristics){

        Random random = new Random();
        List<HeroCharacteristic> availableCharacteristics = new ArrayList<>();

        for (HeroCharacteristic heroCharacteristic : characteristics) {
            if (heroCharacteristic.getLevel() < this.maximumCharacteristicLevel) {
                availableCharacteristics.add(heroCharacteristic);
            }
        }

        while (this.remainingCharacteristicPoints > 0 && !availableCharacteristics.isEmpty()) {
            HeroCharacteristic randomCharacteristic = availableCharacteristics.get(random.nextInt(availableCharacteristics.size()));
            int currentLevel = randomCharacteristic.getLevel();
            randomCharacteristic.setLevel(currentLevel + 1);
            this.remainingCharacteristicPoints--;

            if (randomCharacteristic.getLevel() >= this.maximumCharacteristicLevel) {
                availableCharacteristics.remove(randomCharacteristic);
            }
        }
    }


    public void addRandomBackgrounds(List<Background> allBackgrounds, List<Advantage> allAdvantages) throws CustomException {

        Random random = new Random();
        int index1 = random.nextInt(allBackgrounds.size());
        int index2 = random.nextInt(allBackgrounds.size());

        while (index2 == index1) {
            index2 = random.nextInt(allBackgrounds.size());
        }

        Background background1 = allBackgrounds.get(index1);
        Background background2 = allBackgrounds.get(index2);

        this.addBackground(background1);
        this.addBackground(background2);
        this.remainingSkillPoints = 10;
        this.addRandomAdvantagesForDuplicates(allAdvantages);
        this.remainingAdvantagePoints = 5;
        this.addRestRandomAdvantages(allAdvantages);
        this.addRandomSkillLevels();
    }

    public void addRandomSkillLevels() {
        Random random = new Random();

        List<HeroSkill> eligibleSkills = new ArrayList<>();

        for (HeroSkill heroSkill : this.skills) {
            if (heroSkill.getLevel() < 3) {
                eligibleSkills.add(heroSkill);
            }
        }

        while (this.remainingSkillPoints > 0 && !eligibleSkills.isEmpty()) {
            HeroSkill randomSkill = eligibleSkills.get(random.nextInt(eligibleSkills.size()));
            int newSkillPoints = randomSkill.getLevel();
            int maxPointsToAdd = Math.min(this.remainingSkillPoints, this.maximumSkillLevel - newSkillPoints);
            int pointsToAdd = random.nextInt(maxPointsToAdd) + 1;

            randomSkill.setLevel(randomSkill.getLevel() + pointsToAdd);
            this.remainingSkillPoints -= pointsToAdd;

            eligibleSkills.remove(randomSkill);
        }
    }

    public void addRandomAdvantagesForDuplicates(List<Advantage> allAdvantages){
        List<Advantage> duplicatesDetected = this.checkDuplicateAdvantages();
        if (duplicatesDetected.size() > 0) {
            for (Advantage duplicate : duplicatesDetected) {
                int duplicatePoints = duplicate.getPoints();
                Advantage randomAdvantage = this.getRandomAdvantageWithSamePoints(allAdvantages, duplicatePoints);

                while (this.advantages.contains(randomAdvantage)) {
                    randomAdvantage = this.getRandomAdvantageWithSamePoints(allAdvantages, duplicatePoints);
                }

                this.advantages.add(randomAdvantage);
            }
        }
    }

    private Advantage getRandomAdvantageWithSamePoints(List<Advantage> allAdvantages, int points) {
        List<Advantage> eligibleAdvantages = new ArrayList<>();

        for (Advantage advantage : allAdvantages) {
            if (advantage.getPoints() == points) {
                eligibleAdvantages.add(advantage);
            }
        }

        return eligibleAdvantages.get(new Random().nextInt(eligibleAdvantages.size()));
    }

    private void addRestRandomAdvantages(List<Advantage> allAdvantages){

        if (this.remainingAdvantagePoints <= this.maximumAdvantagePoints) {
            List<Advantage> availableAdvantages = new ArrayList<>(allAdvantages);
            availableAdvantages.removeAll(this.advantages);

            Random random = new Random();

            while (this.remainingAdvantagePoints > 0 && !availableAdvantages.isEmpty()) {
                Advantage randomAdvantage = availableAdvantages.get(random.nextInt(availableAdvantages.size()));
                int advantagePoints = randomAdvantage.getPoints();

                if (advantagePoints <= this.remainingAdvantagePoints) {
                    advantages.add(randomAdvantage);
                    this.remainingAdvantagePoints -= advantagePoints;
                }

                availableAdvantages.remove(randomAdvantage);
            }
        }
    }

    public void addARandomHybris(List<Hybris> allHybris) throws CustomException {

        Random random = new Random();
        int index = random.nextInt(allHybris.size());

        Hybris hybris = allHybris.get(index);

        this.addHybris(hybris);
    }

    public void addARandomVirtue(List<Virtue> allVirtues) throws CustomException {
        Random random = new Random();
        int index = random.nextInt(allVirtues.size());

        Virtue virtue = allVirtues.get(index);

        this.addVirtue(virtue);
    }

    public void initializeLanguages(List<Language> allLanguages) {
        for (Language language : allLanguages) {
            if (language.getId().equals("THEANOANTIGUO") || language.getId().equals(this.getNation().getLanguage().getId())) {
                this.languages.add(language);
            }
        }
        this.howManyAdditionalLanguages();
    }

    public void howManyAdditionalLanguages() {
        for (HeroCharacteristic heroCharacteristic : this.getCharacteristics()) {
            if (heroCharacteristic.getCharacteristic().getId().equals("INGENIO") && heroCharacteristic.getLevel() > 2) {
                this.remainingAdditionalLanguages = heroCharacteristic.getLevel() - 2;
            }
        }
    }

    public void addLanguage(Language language) {
        if (this.remainingAdditionalLanguages > 0 && !this.languages.contains(language)) {
            this.languages.add(language);
            this.remainingAdditionalLanguages--;
        }
    }

    public void removeLanguage(Language language) {
        if (this.languages.contains(language)) {
            this.languages.remove(language);
            this.remainingAdditionalLanguages++;
        }
    }


    public void addARandomsLanguages(List<Language> allLanguages) throws CustomException {
        List<Language> availableLanguages = new ArrayList<>();
        if (this.remainingAdditionalLanguages > 0) {
            for (Language language : allLanguages) {
                if (!this.languages.contains(language)){
                    availableLanguages.add(language);
                }
            }

            if (availableLanguages.isEmpty()) {
                throw new CustomException("No more available languages.");
            }

            Random random = new Random();

            for (int i = 0; i < this.remainingAdditionalLanguages; i++) {
                int randomIndex = random.nextInt(availableLanguages.size());
                Language randomLanguage = availableLanguages.get(randomIndex);
                this.addLanguage(randomLanguage);
                availableLanguages.remove(randomIndex);
            }
        }
    }

}

