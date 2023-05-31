package com.charactergeneratorgroup.charactergenerator.model.Enums;

public enum Skill {

    APUNTAR("Apuntar","Usa Apuntar cuando apuntes con una pistola a alguien y aprietes el gatillo. Usa Apuntar cuando lances un cuchillo en  una habitación abarrotada con mucha precisión, independientemente de que el objetivo sea una persona o un objeto."),
    ARMAS("Armas","Usa Armas cuando ataques a alguien mientras empuñes una espada, un hacha, un martillo o un cuchillo."),
    ATLETISMO("Atletismo","Usa Atletismo cuando recorras una habitación colgado de una lámpara, saltes de tejado en tejado o realices cualquier otra proeza física peligrosa."),
    CONOCIMIENTO("Conocimiento","Usa Conocimiento cuando hables con entusiasmo sobre un tema determinado, ya sea por experiencia personal o por haberlo estudiado. Usa Conocimiento cuando eches mano de tu bagaje para completar los detalles de un tema determinado. Usa Conocimiento cuando recurras a tu aprendizaje como médico para asistir a un herido."),
    CONVENCER("Convencer","Usa Convencer cuando apeles a la parte buena de otro personaje. Usa Convencer cuando le asegures a alguien que eres completamente honesto con él y que debería confiar en ti."),
    EMPATIA("Empatía", "Usa Empatía cuando quieras saber si alguien está siendo sincero. Usa Empatía cuando determines el estado mental general de alguien (tiene miedo, está nervioso o está enfadado)."),
    EQUITACION("Equitación", "Usa Equitación cuando te enzarces en una persecución de carruajes a toda velocidad. Usa Equitación cuando montes un caballo al galope a través del bosque."),
    ESCONDER("Esconder", "Usa Esconder cuando te cueles en una habitación oscura sin que la guardia te vea. Usa Esconder cuando te escondas un objeto y para evitar que lo encuentren si te cachean. Usa Esconder para atacar a una víctima desprevenida con un arma o con los puños. Usa Esconder para disfrazarte o camuflarte en un lugar."),
    INTERPRETAR("Interpretar", "Usa Interpretar cuando intentes cautivar a una audiencia con tus dotes teatrales. Usa Interpretar para transmitirle un mensaje a tu audiencia o para provocarle una emoción determinada a través de tu actuación (para hacerle reír con tu comedia o llorar con tu tragedia, exaltar al público con un discurso motivacional, etcétera)."),
    INTIMIDAR("Intimidar", "Usa Intimidar cuando quieras que alguien haga algo y le amenaces con realizar alguna acción, ya sea física o no."),
    NAVEGACION("Navegación", "Usa Navegación cuando te abras camino a través del cordaje de un barco. Usa Navegación cuando intentes dirigir un barco durante una batalla naval en el mar o a través de un canal estrecho y peligroso."),
    PELEAR("Pelear", "Usa Pelear cuando le des un puñetazo o una patada a alguien en la cara. Usa Pelear cuando agarres a alguien y lo arrastres por un callejón."),
    PERCEPCION("Percepción", "Usa Percepción cuando investigues una escena de un crimen o busques pistas en el estudio de un villano. Usa Percepción cuando quieras identificar detalles precisos de un vistazo."),
    ROBAR("Robar", "Usa Robar cuando cojas algo del bolsillo de alguien sin que se dé cuenta. Usa Robar cuando abras una cerradura, una caja fuerte o algo similar."),
    TACTICASDEGUERRA("Tácticas de Guerra", "Usa Tácticas de Guerra cuando necesites experiencia táctica, como cuando rompes las defensas de un castillo. Usa Tácticas de Guerra cuando lideres a un ejército en batalla."),
    TENTAR("Tentar", "Usa Tentar cuando sobornes a alguien para que haga por ti algo que realmente no debería hacer. Usa Tentar cuando convenzas a alguien de que te dé algo de 'tiempo a solas'.");

    private String skillName;
    private String skillDescription;

    Skill(String skillName, String skillDescription) {
        this.skillName = skillName;
        this.skillDescription = skillDescription;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getSkillDescription() {
        return skillDescription;
    }
}
