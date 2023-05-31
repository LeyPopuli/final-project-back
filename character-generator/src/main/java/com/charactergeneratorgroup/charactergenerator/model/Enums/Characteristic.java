package com.charactergeneratorgroup.charactergenerator.model.Enums;

public enum Characteristic {
    MUSCULO("Músculo"),
    MANA("Maña"),
    BRIO("Brío"),
    INGENIO("Ingenio"),
    DONAIRE("Donaire");

    private String characteristicName;

    private Characteristic(String characteristicName) {
        this.characteristicName = characteristicName;
    }

    public String getCharacteristicName() {
        return characteristicName;
    }
}
