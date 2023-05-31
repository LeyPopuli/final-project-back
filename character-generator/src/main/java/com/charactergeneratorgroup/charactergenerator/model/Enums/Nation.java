package com.charactergeneratorgroup.charactergenerator.model.Enums;

public enum Nation {
    AVALON("Ávalon", Religion.LAIGLESIADEAVALON),
    CASTILLA("Castilla",Religion.LAIGLESIADELOSPROFETAS),
    EISEN("Eisen", Religion.LAIGLESIADELOSPROFETAS),
    INISMORE("Inismore", Religion.PAGANISMO),
    MANCOMUNIDADSARMATA("Mancomunidad Sármata",Religion.POLITEISMO),
    LASMARCASALTAS("Las Marcas Altas",Religion.OBJECIONISTAS),
    MONTAIGNE("Montaigne",Religion.LAIGLESIADELOSPROFETAS),
    USSURA("Ussura",Religion.ORTODOXOS),
    VESTENMENNAVENJAR("Vestenmennavenjar",Religion.MITOLOGIAVIVA),
    VODACCE("Vodacce",Religion.LAIGLESIADELOSPROFETAS),
    NINGUNA("Ninguna", Religion.LOSINSTRUMENTOSDELALEGION);

    private Religion religion;

    private String nationName;

    Nation(String nationName, Religion religion) {
        this.nationName = nationName;
        this.religion = religion;
    }

    public Religion getReligion() {
        return religion;
    }

    public String getNationName() {
        return nationName;
    }
}
