package com.charactergeneratorgroup.charactergenerator.model.Enums;

public enum Religion {
    LAIGLESIADELOSPROFETAS("La Iglesia de los Profetas"),
    OBJECIONISTAS("Objecionistas"),
    ORTODOXOS("Ortodoxos"),
    LAIGLESIADEAVALON("La Iglesia de Ávalon"),
    PAGANISMO("Paganismo"),
    POLITEISMO("Politeísmo"),
    LOSDRUIDAS("Los Druidas"),
    MITOLOGIAVIVA("Mitología Viva"),
    LAINQUISICION("La Inquisición"),
    LOSINSTRUMENTOSDELALEGION("Los Instrumentos de Legión");

    private String religionName;

    Religion(String religionName) {
        this.religionName = religionName;
    }

    public String getReligionName() {
        return religionName;
    }
}
