package com.charactergeneratorgroup.charactergenerator.model;

import com.charactergeneratorgroup.charactergenerator.model.Enums.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import java.util.*;

@Data
@Entity
@DynamicUpdate
public class Character {
    @Id
    private Long id;

    //String for the moment
    @NotEmpty(message = "User can't be an empty value.")
    private String user;

    @NotEmpty(message = "You must supply a name for the character.")
    @Size(max = 30, message = "The name cannot exceed 30 characters.")
    private String name;

    @NotEmpty(message = "You must supply a concept for the character.")
    @Size(max = 40, message = "The concept cannot exceed 40 characters.")
    private String concept;

    //Optional
    @Enumerated(EnumType.STRING)
    private Nation nation;

    //Optional
    @Enumerated(EnumType.STRING)
    private Religion religion;

    //Optional
    @Size(max = 30, message = "The reputation cannot exceed 30 characters.")
    private String reputation;

    //Optional
    @Size(max = 30, message = "The richness cannot exceed 30 characters.")
    private String richness;

    //Optional
    private Map<Characteristic, Integer> characteristics;

    //Optional
    private List<Background> backgrounds;

    //Optional
    private List<Advantage> advantages;

    //Optional
    private Map<Skill, Integer> skills;

    //Optional
    @Enumerated(EnumType.STRING)
    private Virtue virtue;

    //Optional
    @Enumerated(EnumType.STRING)
    private Hibris hibris;

    //Optional
    private String history;

    //Optional
    private String imageUrl;


//    NoArgsConstructor
    public Character() {
        this.backgrounds = new ArrayList<>();
        this.advantages = new ArrayList<>();
        skillsInitialization();
        characteristicInitialization();
    }

    //    ConstructorWithoutOptionals
    public Character(String user, String name, String concept, Nation nation) {
        this.user = user;
        this.name = name;
        this.concept = concept;
        this.nation = nation;

        this.backgrounds = new ArrayList<>();
        this.advantages = new ArrayList<>();
        skillsInitialization();
        characteristicInitialization();

    }

    public void characteristicInitialization(){
        this.characteristics = new HashMap<>();
        for (Characteristic characteristic : Characteristic.values()) {
            this.characteristics.put(characteristic, 2);
        }
    }

    public void initialPointsAssignationByNationRandom(Nation nation) {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        switch (nation) {
            case AVALON -> {
                if (randomNumber == 0) {
                    incrementCharacteristic(Characteristic.DONAIRE, 1);
                } else {
                    incrementCharacteristic(Characteristic.BRIO, 1);
                }
            }
            case CASTILLA -> {
                if (randomNumber == 0) {
                    incrementCharacteristic(Characteristic.MANA, 1);
                } else {
                    incrementCharacteristic(Characteristic.INGENIO, 1);
                }
            }
            case EISEN -> {
                if (randomNumber == 0) {
                    incrementCharacteristic(Characteristic.MUSCULO, 1);
                } else {
                    incrementCharacteristic(Characteristic.BRIO, 1);
                }
            }
            case INISMORE -> {
                if (randomNumber == 0) {
                    incrementCharacteristic(Characteristic.DONAIRE, 1);
                } else {
                    incrementCharacteristic(Characteristic.INGENIO, 1);
                }
            }
            case LASMARCASALTAS -> {
                if (randomNumber == 0) {
                    incrementCharacteristic(Characteristic.MUSCULO, 1);
                } else {
                    incrementCharacteristic(Characteristic.MANA, 1);
                }
            }
            case MONTAIGNE -> {
                if (randomNumber == 0) {
                    incrementCharacteristic(Characteristic.MANA, 1);
                } else {
                    incrementCharacteristic(Characteristic.DONAIRE, 1);
                }
            }
            case MANCOMUNIDADSARMATA -> {
                if (randomNumber == 0) {
                    incrementCharacteristic(Characteristic.MUSCULO, 1);
                } else {
                    incrementCharacteristic(Characteristic.DONAIRE, 1);
                }
            }
            case USSURA -> {
                if (randomNumber == 0) {
                    incrementCharacteristic(Characteristic.BRIO, 1);
                } else {
                    incrementCharacteristic(Characteristic.INGENIO,  1);
                }
            }
            case VESTENMENNAVENJAR -> {
                if (randomNumber == 0) {
                    incrementCharacteristic(Characteristic.MUSCULO, 1);
                } else {
                    incrementCharacteristic(Characteristic.INGENIO, 1);
                }
            }
            case VODACCE -> {
                if (randomNumber == 0) {
                    incrementCharacteristic(Characteristic.MANA, 1);
                } else {
                    incrementCharacteristic(Characteristic.BRIO, 1);
                }
            }
        }
    }

    private void incrementCharacteristic(Characteristic characteristic, Integer points) {
        int currentValue = this.characteristics.get(characteristic);
        int updatedValue = currentValue + points;
        this.characteristics.put(characteristic, updatedValue);
    }


    public void assignAdditionalRandomPoints() {
        Random random = new Random();
        List<Characteristic> characteristicKeys = new ArrayList<>(characteristics.keySet());

        for (int i = 0; i < 2; i++) {
            int randomIndex = random.nextInt(characteristicKeys.size());
            Characteristic selectedCharacteristic = characteristicKeys.get(randomIndex);
            incrementCharacteristic(selectedCharacteristic, 1);
        }
    }

    public void addBackground(Background background) throws Exception {
        if (this.backgrounds.contains(background)) {
            System.out.println("Background already exists in this character.");
            throw new Exception("Background already exists in this character.");
        } else if (this.backgrounds.size() >= 2) {
            System.out.println("Maximum number of backgrounds reached for this character, remove one before adding a new one.");
            throw new Exception("Maximum number of backgrounds reached for this character, remove one before adding a new one.");
        } else {
            this.backgrounds.add(background);
            List<Advantage> newAdvantages = background.getBackgroundAdvantages();
            this.advantages.addAll(newAdvantages);
            List<Skill> newSkills = background.getBackgroundSkills();
            for (Skill skill : newSkills) {
                addSkillLevel(skill, 1);
            }
        }
    }

    public void removeBackground(Background background) throws Exception {
        if (this.backgrounds.contains(background)) {
            this.backgrounds.remove(background);
            List<Advantage> newAdvantages = background.getBackgroundAdvantages();
            this.advantages.removeAll(newAdvantages);
            List<Skill> newSkills = background.getBackgroundSkills();
            for (Skill skill : newSkills) {
                removeSkillLevel(skill, 1);
            }
        } else {
            System.out.println("Background doesn't exist in this character.");
            throw new Exception("Background doesn't exist in this character.");
        }
    }

    public void addRandomBackgrounds() throws Exception {
        List<Background> availableBackgrounds = Arrays.asList(Background.values());

        Random random = new Random();
        int index1 = random.nextInt(availableBackgrounds.size());
        int index2 = random.nextInt(availableBackgrounds.size());

        while (index2 == index1) {
            index2 = random.nextInt(availableBackgrounds.size());
        }

        Background background1 = availableBackgrounds.get(index1);
        Background background2 = availableBackgrounds.get(index2);

        addBackground(background1);
        addBackground(background2);
        addRandomAdvantagesForDuplicates();
        addRestRandomAdvantages();
        addRandomSkillLevels();
    }

    public void skillsInitialization(){
        this.skills = new HashMap<>();
        for (Skill skill : Skill.values()) {
            this.skills.put(skill, 0);
        }
    }

    public void addSkillLevel(Skill skill, Integer points) throws Exception {
        if (skills.get(skill) + points <= 3) {
            int value = skills.get(skill);
            skills.put(skill, value + points);
        } else {
            System.out.println("The level of a skill cannot exceed level 5.");
            throw new Exception("The level of a skill cannot exceed level 5.");
        }
    }

    public void removeSkillLevel(Skill skill, Integer points) throws Exception {
        if (skills.get(skill)  - points > 0) {
            int value = skills.get(skill);
            skills.put(skill, value - points);
        } else {
            System.out.println("The level of a skill cannot be lower than level 0. ");
            throw new Exception("The level of a skill cannot be lower than level 0. ");
        }
    }

    public void addRandomSkillLevels(){
        Random random = new Random();
        int remainingPoints = 10;

        List<Skill> eligibleSkills = new ArrayList<>();

        for (Skill skill : this.skills.keySet()) {
            if (this.skills.get(skill) < 3) {
                eligibleSkills.add(skill);
            }
        }

        while (remainingPoints > 0 && !eligibleSkills.isEmpty()) {
            Skill randomSkill = eligibleSkills.get(random.nextInt(eligibleSkills.size()));
            int currentPoints = skills.get(randomSkill);
            int maxPointsToAdd =  3 - currentPoints;
            int pointsToAdd = random.nextInt(maxPointsToAdd) + 1;

            skills.put(randomSkill, currentPoints + pointsToAdd);
            remainingPoints -= pointsToAdd;

            eligibleSkills.remove(randomSkill);
        }
    }

    public List<Advantage> checkDuplicateAdvantages(){
        List<Advantage> duplicates = new ArrayList<Advantage>();
        for (Advantage advantage : this.advantages) {
            if (!duplicates.contains(advantage) && Collections.frequency(this.advantages, advantage) > 1) {
                duplicates.add(advantage);
            }
        }
        return duplicates;
    }

    public void addRandomAdvantagesForDuplicates(){
        List<Advantage> duplicatesDetected = checkDuplicateAdvantages();
        if (duplicatesDetected.size() > 0) {
            for (Advantage duplicate : duplicatesDetected) {
                int duplicatePoints = duplicate.getAdvantagePoints();
                Advantage randomAdvantage = getRandomAdvantageWithSamePoints(duplicatePoints);

                while (this.advantages.contains(randomAdvantage)) {
                    randomAdvantage = getRandomAdvantageWithSamePoints(duplicatePoints);
                }

                this.advantages.add(randomAdvantage);
            }
        }
    }

    private Advantage getRandomAdvantageWithSamePoints(int points) {
        Advantage[] allAdvantages = Advantage.values();
        List<Advantage> eligibleAdvantages = new ArrayList<>();

        for (Advantage advantage : allAdvantages) {
            if (advantage.getAdvantagePoints() == points) {
                eligibleAdvantages.add(advantage);
            }
        }

        return eligibleAdvantages.get(new Random().nextInt(eligibleAdvantages.size()));
    }

    private void addRestRandomAdvantages(){
        Integer currentUsedPoints = 0;
        for (Advantage advantage : this.advantages) {
            currentUsedPoints += advantage.getAdvantagePoints();
        }

        if (currentUsedPoints < 10) {
            Integer pointsAvailable = 10 - currentUsedPoints;
            List<Advantage> availableAdvantages = new ArrayList<>(Arrays.asList(Advantage.values()));
            availableAdvantages.removeAll(advantages);

            Random random = new Random();

            while (pointsAvailable > 0 && !availableAdvantages.isEmpty()) {
                Advantage randomAdvantage = availableAdvantages.get(random.nextInt(availableAdvantages.size()));
                int advantagePoints = randomAdvantage.getAdvantagePoints();

                if (advantagePoints <= pointsAvailable) {
                    advantages.add(randomAdvantage);
                    pointsAvailable -= advantagePoints;
                }

                availableAdvantages.remove(randomAdvantage);
            }
        }
    }

    private void addAdvantage(Advantage advantage) throws Exception{
        Integer currentUsedPoints = 0;
        int advantagePoints = advantage.getAdvantagePoints();

        for (Advantage eachAdvantage : this.advantages) {
            currentUsedPoints += advantage.getAdvantagePoints();
        }

        if (currentUsedPoints + advantagePoints <= 10 && !this.advantages.contains(advantage)) {
            this.advantages.add(advantage);
        } else {
            System.out.println("It is not possible to add this advantage. Check that you do not already have this advantage or that the points are enough.");
            throw new Exception("It is not possible to add this advantage. Check that you do not already have this advantage or that the points are enough.");
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

    public void addARandomVirtue() throws Exception {
        List<Virtue> availableVirtues = Arrays.asList(Virtue.values());

        Random random = new Random();
        int index = random.nextInt(availableVirtues.size());

        Virtue virtue = availableVirtues.get(index);

        addVirtue(virtue);
    }

    public void removeVirtue() throws Exception {
        if (this.virtue != null) {
            this.virtue = null;
        } else {
            System.out.println("This hero has no virtue to be eliminated.");
            throw new Exception("This hero has no virtue to be eliminated.");
        }
    }

    public void addHibris(Hibris hibris) throws Exception {
        if (this.hibris != null) {
            System.out.println("This hero already has a hibris. Remove it first.");
            throw new Exception("This hero already has a hibris. Remove it first.");
        } else {
            this.hibris = hibris;
        }
    }

    public void addARandomHibris() throws Exception {
        List<Hibris> availableHibris = Arrays.asList(Hibris.values());

        Random random = new Random();
        int index = random.nextInt(availableHibris.size());

        Hibris hibris = availableHibris.get(index);

        addHibris(hibris);
    }

    public void removeHibris() throws Exception {
        if (this.hibris != null) {
            this.hibris = null;
        } else {
            System.out.println("This hero has no hibris to be eliminated.");
            throw new Exception("This hero has no hibris to be eliminated.");
        }
    }


}

