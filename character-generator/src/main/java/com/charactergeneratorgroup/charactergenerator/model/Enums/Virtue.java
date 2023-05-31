package com.charactergeneratorgroup.charactergenerator.model.Enums;

public enum Virtue {
    ASTUTO("Astuto", "Activa tu Virtud para escapar del peligro en la escena actual. Solo te puedes salvar a ti mismo."),
    AMIGABLE("Amigable", "Activa tu Virtud cuando te encuentres con un personaje (incluso un villano) por primera vez. Te tratará como a un amigo durante una escena."),
    DECIDIDO("Decidido", "Activa tu Virtud y apunta a un villano. Hasta el final de esta escena, no puedes gastar puntos de héroe y el villano no puede gastar puntos de peligro."),
    APASIONADO("Apasionado", "Activa tu Virtud para evitar que otro héroe sufra Heridas, pero tú sufrirás 1 Herida Dramática en su lugar."),
    AFORTUNADO("Afortunado", "Activa tu Virtud para retrasar en una acción una Oportunidad o una Consecuencia."),
    AGUDO("Agudo", "Activa tu Virtud después de que un villano gaste Aumentos en una acción. Esa acción falla y el villano pierde los Aumentos que gastó."),
    HUMILDE("Humilde", "Activa tu Virtud para conseguir 2 puntos de héroe, en lugar 1, cuando actives tu Hibris o una Peculiaridad."),
    SAGAZ("Sagaz", "Activa tu Virtud para saber la especialidad de la banda de matones a la que te enfrentas o para descubrir el nivel y las ventajas de un villano."),
    INTUITIVO("Intuitivo", "Activa tu Virtud para hacerle al DJ una pregunta sobre un PNJ que pueda responderse con un «sí» o «no». Si hay algún matiz en la respuesta, el DJ debería ser generoso y responder con más detalle."),
    VICTORIOSO("Victorioso", "Activa tu Virtud la primera vez que inflijas Heridas a un villano durante una pelea para obligarle a que reciba 1 Herida Dramática, además de las Heridas que normalmente infligirías."),
    ALTRUISTA("Altruista", "Activa tu Virtud para sufrir las Consecuencias de un Riesgo en lugar de otro héroe."),
    FLEXIBLE("Flexible", "Activa tu Virtud para realizar tu primera acción antes que todos los demás en una ronda."),
    CONFORTADOR("Confortador", "Activa tu Virtud para cancelar los efectos del Miedo sobre tus amigos y tú."),
    SUTIL("Sutil", "Activa tu Virtud cuando actúes entre bambalinas, desde las sombras o a través de un representante. Para el siguiente Riesgo, cuando determines los Aumentos, cada dado cuenta como 1 Aumento."),
    GLORIOSO("Glorioso", "Activa tu Virtud cuando seas el centro de atención. Para el siguiente Riesgo, cuando determines tus Aumentos, cada dado cuenta como 1 Aumento."),
    ILUMINADO("Iluminado", "Activa tu Virtud para saber, hasta el final de la escena, cuándo te está mintiendo cualquier otro personaje."),
    EJEMPLAR("Ejemplar", "Activa tu Virtud y elige otro héroe que se encuentre en la misma escena para sumar vuestra reserva de Aumentos durante toda la ronda. Para realizar acciones gastáis Aumentos de esta reserva compartida."),
    VALENTE("Valiente", "Activa tu Virtud para añadir tantos dados adicionales a tu Riesgo como el valor de Miedo de tu objetivo."),
    FRUGAL("Frugal", "Activa tu Virtud para evitar que te afecte cualquier efecto mágico (hechicería, artefactos, monstruos, etcétera)."),
    IMPONENTE("Imponente", "Activa tu Virtud y el DJ le dará 1 punto de héroe al resto de héroes que se encuentren en esta escena.");


    private String virtueName;
    private String virtueDescripcion;

    Virtue(String virtueName, String virtueDescripcion) {
        this.virtueName = virtueName;
        this.virtueDescripcion = virtueDescripcion;
    }

    public String getVirtueDescripcion() {
        return virtueDescripcion;
    }

    public String getVirtueName() {
        return virtueName;
    }
}
