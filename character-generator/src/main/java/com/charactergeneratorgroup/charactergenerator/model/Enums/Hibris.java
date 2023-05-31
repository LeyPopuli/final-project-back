package com.charactergeneratorgroup.charactergenerator.model.Enums;

public enum Hibris {
    CURIOSO("Curioso", "Recibe 1 punto de héroe cuando investigues algo inusual, especialmente si parece peligroso."),
    INSEGURO("Inseguro", "Recibe 1 punto de héroe cuando tu héroe decida que no puede realizar una acción sin la ayuda de otro héroe. Por ejemplo, puedes insistir para que otro héroe gaste 1 punto de héroe y te dé dados adicionales o pedirle que use una de sus ventajas para ayudarte."),
    AMBICIOSO("Ambicioso", "Recibe 1 punto de héroe cuando busques poder y el trato que persigas sea peligroso o cause problemas."),
    MALHADADO("Malhadado", "Recibe 1 punto de héroe cuando tu héroe se enamore de alguien de quien realmente no debería enamorarse."),
    DESAFORTUNADO("Desafortunado", "Recibe 2 puntos de héroe cuando decidas fallar un Riesgo importante antes de tirar los dados."),
    CÁNDIDO("Cándido", "Recibe 1 punto de héroe cuando aceptes las mentiras de alguien o un trato injusto."),
    ARROGANTE("Arrogante", "Recibe 1 punto de héroe cuando tu héroe demuestre desdén o desprecio o subestime a un villano o a alguien que podría dañar a tus amigos."),
    ENVIDIOSO("Envidioso", "Recibe 1 punto de héroe cuando tu héroe codicie algo y haga algo imprudente para conseguirlo."),
    MANIPULADOR("Manipulador", "Recibe 1 punto de héroe cuando intentes hacer que otra persona haga el trabajo sucio por ti y te salga el tiro por la culata."),
    LEAL("Leal", "Recibe 1 punto de héroe cuando tu héroe vuelva atrás a por un compañero caído o se niegue a dejar a un aliado herido."),
    INDECISO("Indeciso", "Recibe 1 punto de héroe cuando tu héroe gaste una acción para detenerse vacilando, dudando o inseguro antes de realizar un movimiento."),
    FIRME("Firme", "Recibe 1 punto de héroe cuando te metas en problemas si te niegas a irte o cuando te retiras en un momento en el que tengas ventaja."),
    TESTARUDO("Testarudo", "Recibe 1 punto de héroe cuando tu héroe sea testarudo y se niegue a cambiar de opinión ante la evidencia."),
    CONFUSO("Confuso", "Recibe 1 punto de héroe cuando tu héroe no consiga entender un elemento importante de la trama y el malentendido conduzca además a un peligro, para sí mismo o para otros."),
    ORGULLOSO("Orgulloso", "Recibe 1 punto de héroe cuando tu héroe se niegue a aceptar la ayuda que se le ofrece. Por ejemplo, cuando un héroe quiera gastar 1 punto de héroe para darte 1 dado adicional y tú lo rechaces."),
    PREPOTENTE("Prepotente", "Recibe 1 punto de héroe cuando tu héroe defienda firmemente una de sus opiniones en un momento o lugar inadecuados."),
    RENCOROSO("Rencoroso", "Recibe 1 punto de héroe cuando saques antiguos rencores o malos sentimientos y eso haga que te metas en problemas."),
    IMPRUDENTE("Imprudente", "Recibe 1 punto de héroe cuando tus acciones atrevidas, arrogantes o temerarias te provoquen problemas a ti y a otro héroe."),
    SUPERSTICIOSO("Supersticioso", "Recibe 1 punto de héroe cuando te niegues a resolver un problema usando Hechicería, un artefacto o cualquier otro efecto místico en el que no confías."),
    TEMPERAMENTAL("Temperamental", "Recibe 1 punto de héroe cuando tu héroe pierda los estribos y se enfurezca y eso cause problemas.");

    private String hibrisName;
    private String hibrisDescripcion;

    Hibris( String hibrisName, String hibrisDescripcion) {
        this.hibrisName = hibrisName;
        this.hibrisDescripcion = hibrisDescripcion;
    }

    public String getHibrisDescripcion() {
        return hibrisDescripcion;
    }

    public String getHibrisName() {
        return hibrisName;
    }
}
