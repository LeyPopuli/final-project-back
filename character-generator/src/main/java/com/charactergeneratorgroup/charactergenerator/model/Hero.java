package com.charactergeneratorgroup.charactergenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.*;


@Data
@Entity
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //String for the moment
    @NotEmpty(message = "User can't be an empty value.")
    private String user;

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
    private String reputation;

    //Optional
    @Size(max = 30, message = "The richness cannot exceed 30 characters.")
    private String richness;

    //Optional
    @ElementCollection
    @CollectionTable(name = "hero_characteristic", joinColumns = @JoinColumn(name = "hero_id"))
    @Column(name = "characteristic_level")
    @MapKeyColumn(name = "characteristic_id")
    private Map<Characteristic, Integer> characteristics  = new HashMap<>();

    //Optional
    @ManyToMany
    private List<Background> backgrounds = new ArrayList<>();

    //Optional
    @ManyToMany
    private List<Advantage> advantages = new ArrayList<>();

    //Optional
    @ElementCollection
    @CollectionTable(name = "hero_skill", joinColumns = @JoinColumn(name = "hero_id") )
    @Column(name="skill_level")
    @MapKeyColumn(name = "skill_id")
    private Map<Skill, Integer> skills = new HashMap<>();

    //Optional
    @ManyToOne
    private Virtue virtue;

    //Optional
    @ManyToOne
    private Hybris hybris;

    //Optional
    @Column(length = 1000)
    private String history;

    //Optional
    private String imageUrl;

    private Integer maximumBackgrounds = 2;

    private Integer remainingBackgrounds = 2;


    private Integer remainingCharacteristicPoints = 2;


    private Integer maximumSkillLevel = 3;

    private Integer remainingSkillPoints = 10;


    private Integer remainingAdvantagePoints = 5;

    private Integer maximumAdvantagePoints = 5;

    private String error;


//    NoArgsConstructor
    public Hero() {
    }

    public void characteristicInitialization(List<Characteristic> allCharacteristics){

        for (Characteristic characteristic : allCharacteristics) {
            this.characteristics.put(characteristic, 2);
        }

    }

    private void incrementCharacteristicWithoutCost(Characteristic characteristic, Integer points) {
        int currentValue = this.characteristics.get(characteristic);
        int updatedValue = currentValue + points;
        this.characteristics.put(characteristic, updatedValue);
    }

    private void incrementCharacteristic(Characteristic characteristic, Integer points) throws Exception {
        if (this.remainingCharacteristicPoints >= points) {
            int currentValue = this.characteristics.get(characteristic);
            int updatedValue = currentValue + points;
            this.characteristics.put(characteristic, updatedValue);
            this.remainingAdvantagePoints -= points;
        } else {
            throw new Exception("Insufficient points");
        }
    }

    private void decrementCharacteristic(Characteristic characteristic, Integer points) throws Exception {
        if (this.characteristics.get(characteristic) - points >= 0) {
            int currentValue = this.characteristics.get(characteristic);
            int updatedValue = currentValue - points;
            this.characteristics.put(characteristic, updatedValue);
            this.remainingAdvantagePoints += points;
        } else {
            throw new Exception("Insufficient points");
        }
    }

    private Characteristic getCharacteristicById(String id) throws Exception {
        for (Map.Entry<Characteristic, Integer> entry : characteristics.entrySet()) {
            Characteristic characteristic = entry.getKey();
            if (characteristic.getId().equals(id)) {
                return characteristic;
            }
        }
        throw new Exception("Characteristic not found with ID: " + id);
    }

    public void removeBackground(Background background) throws Exception {
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
            throw new Exception("Background doesn't exist in this character.");
        }
    }

    public void addBackground(Background background) throws Exception {
        if (this.backgrounds.contains(background)) {
            System.out.println("Background already exists in this character.");
            throw new Exception("Background already exists in this character.");
        } else if (this.backgrounds.size() >= maximumBackgrounds) {
            System.out.println("Maximum number of backgrounds reached for this character, remove one before adding a new one.");
            throw new Exception("Maximum number of backgrounds reached for this character, remove one before adding a new one.");
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
            this.skills.put(skill, 0);
        }
    }

    public void addSkillLevel(Skill skill, Integer points) throws Exception {
        if (this.skills.get(skill) + points <= maximumSkillLevel && this.remainingSkillPoints >= points) {
            int value = this.skills.get(skill);
            this.skills.put(skill, value + points);
            this.remainingSkillPoints -= points;
        } else {
            System.out.println("The level of a skill cannot exceed level 5 and you need to have enough points.");
            throw new Exception("The level of a skill cannot exceed level 5 and you need to have enough points.");
        }
    }

    public void removeSkillLevel(Skill skill, Integer points) throws Exception {
        if (this.skills.get(skill) - points >= 0) {
            int value = this.skills.get(skill);
            this.skills.put(skill, value - points);
            this.remainingSkillPoints += points;
        } else {
            System.out.println("The level of a skill cannot be lower than level 0. ");
            throw new Exception("The level of a skill cannot be lower than level 0. ");
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

    private void addAdvantage(Advantage advantage) throws Exception{

        if (this.remainingAdvantagePoints - advantage.getPoints() >= 0 && !this.advantages.contains(advantage)) {
            this.advantages.add(advantage);
            this.remainingAdvantagePoints -= advantage.getPoints();
        } else {
            System.out.println("It is not possible to add this advantage. Check that you do not already have this advantage or that the points are enough.");
            throw new Exception("It is not possible to add this advantage. Check that you do not already have this advantage or that the points are enough.");
        }
    }

    private void removeAdvantage(Advantage advantage) throws Exception{

        if (this.advantages.contains(advantage)) {
            this.advantages.remove(advantage);
            this.remainingAdvantagePoints += advantage.getPoints();
        } else {
            System.out.println("It is not possible to remove this advantage. Check if you have it before deleting it.");
            throw new Exception("It is not possible to remove this advantage. Check if you have it before deleting it.");
        }
    }

    public void addVirtue(Virtue virtue) throws Exception {
        if (this.virtue != null) {
            System.out.println("This hero already has a virtue. Remove it first.");
            throw new Exception("This hero already has a virtue. Remove it first.");
        } else {
            this.virtue = virtue;
        }
    }

    public void removeVirtue() throws Exception {
        if (this.virtue != null) {
            this.virtue = null;
        } else {
            System.out.println("This hero has no virtue to be eliminated.");
            throw new Exception("This hero has no virtue to be eliminated.");
        }
    }

    public void addHybris(Hybris hybris) throws Exception {
        if (this.hybris != null) {
            System.out.println("This hero already has a hibris. Remove it first.");
            throw new Exception("This hero already has a hibris. Remove it first.");
        } else {
            this.hybris = hybris;
        }
    }


    public void removeHybris() throws Exception {
        if (this.hybris != null) {
            this.hybris = null;
        } else {
            System.out.println("This hero has no hibris to be eliminated.");
            throw new Exception("This hero has no hibris to be eliminated.");
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

    public void initialPointsAssignationByNationRandom() throws Exception {
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
        List<Characteristic> availableCharacteristics = new ArrayList<>(this.characteristics.keySet());

        while (this.remainingCharacteristicPoints > 0) {
            Characteristic randomCharacteristic = availableCharacteristics.get(random.nextInt(availableCharacteristics.size()));
            int currentLevel = this.characteristics.get(randomCharacteristic);
            this.characteristics.put(randomCharacteristic, currentLevel + 1);
            this.remainingCharacteristicPoints--;
        }
    }


    public void addRandomBackgrounds(List<Background> allBackgrounds, List<Advantage> allAdvantages) throws Exception {

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

        List<Skill> eligibleSkills = new ArrayList<>();

        for (Skill skill : this.skills.keySet()) {
            if (this.skills.get(skill) < 3) {
                eligibleSkills.add(skill);
            }
        }

        while (this.remainingSkillPoints > 0 && !eligibleSkills.isEmpty()) {
            Skill randomSkill = eligibleSkills.get(random.nextInt(eligibleSkills.size()));
            int newSkillPoints = this.skills.get(randomSkill);
            int maxPointsToAdd = Math.min(this.remainingSkillPoints, this.maximumSkillLevel - newSkillPoints);
            int pointsToAdd = random.nextInt(maxPointsToAdd) + 1;

            skills.put(randomSkill, this.skills.get(randomSkill) + pointsToAdd);
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

    public void addARandomHybris(List<Hybris> allHybris) throws Exception {

        Random random = new Random();
        int index = random.nextInt(allHybris.size());

        Hybris hybris = allHybris.get(index);

        this.addHybris(hybris);
    }

    public void addARandomVirtue(List<Virtue> allVirtues) throws Exception {
        Random random = new Random();
        int index = random.nextInt(allVirtues.size());

        Virtue virtue = allVirtues.get(index);

        this.addVirtue(virtue);
    }

}

