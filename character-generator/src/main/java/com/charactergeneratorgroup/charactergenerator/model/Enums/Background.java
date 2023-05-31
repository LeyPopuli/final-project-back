package com.charactergeneratorgroup.charactergenerator.model.Enums;

import java.util.Arrays;
import java.util.List;

public enum Background {
    ARISTOCRATA("Aristócrata", "Naciste en el seno de la nobleza de tu país natal y asistes con regularidad a las cortes.", "Ganas 1 punto de héroe cuando demuestres que la nobleza es algo más que ropa cara y estar en la corte", Arrays.asList(Advantage.RICO, Advantage.SONRISAENCANTADORA), Arrays.asList(Skill.APUNTAR, Skill.CONOCIMIENTO, Skill.CONVENCER, Skill.EMPATIA, Skill.EQUITACION)),
    ARQUEOLOGO("Arqueólogo", "Estudias las ruinas syrneth y exploras los lugares perdidos de Terra.",
            "Ganas 1 punto de héroe cuando lleves un artefacto de valor a una universidad, un museo o un lugar donde se expondrá públicamente.",
            Arrays.asList(Advantage.OBJETODISTINTIVO, Advantage.VISTADELINCE),
            Arrays.asList(Skill.ATLETISMO, Skill.CONOCIMIENTO, Skill.CONVENCER, Skill.PERCEPCION, Skill.ROBAR)),
    ARTESANO("Artesano", "Trabajas sin descanso para crear objetos útiles.",
            "Ganas 1 punto de héroe cuando uses tus habilidades artesanas diarias para resolver un problema aparentemente demasiado complejo como para tener una solución tan simple.",
            Arrays.asList(Advantage.MAESTROARTESANO, Advantage.MANOSO),
            Arrays.asList(Skill.ATLETISMO, Skill.CONOCIMIENTO, Skill.CONVENCER, Skill.INTERPRETAR, Skill.PERCEPCION)),
    ARTISTA("Artista", "Trabajas sin descanso para crear objetos de gran belleza.",
            "Ganas 1 punto de héroe cuando te sacrifiques para hacer de Théah un lugar más hermoso.",
            Arrays.asList(Advantage.FASCINAR, Advantage.MECENAS),
            Arrays.asList(Skill.CONVENCER, Skill.EMPATIA, Skill.EQUITACION, Skill.INTERPRETAR, Skill.TENTAR)),
    ASESINO("Asesino", "Acechas en la sombra como un espectro de la muerte silenciosa a cambio de una moneda ensangrentada, pero no más.",
            "Ganas 1 punto de héroe cuando te desvíes del camino marcado para evitar así la muerte de un adversario o evitar hacer algo que podría resultar en la muerte de otra persona.",
            Arrays.asList(Advantage.ESGRIMISTA, Advantage.CHISTPORAQUI),
            Arrays.asList(Skill.ARMAS, Skill.ATLETISMO, Skill.EMPATIA, Skill.ESCONDER, Skill.INTIMIDAR)),
    CABALLERO("Caballero", "Eres un guerrero a caballo y formas parte de la estimada caballería de tu nación.",
            "Ganas 1 punto de héroe cuando apliques tus habilidades montando a caballo en una situación poco común.",
            Arrays.asList(Advantage.GORILA, Advantage.VOLUNTADINDOMITA),
            Arrays.asList(Skill.ARMAS, Skill.EQUITACION, Skill.INTIMIDAR, Skill.PERCEPCION, Skill.TACTICASDEGUERRA)),
    CAPITAN_DE_BARCO("Capitán de Barco", "Das órdenes a una tripulación y surcas los mares por cualquier bandera que hondees.",
            "Ganas 1 punto de héroe cuando seas el último de tu tripulación en ponerse a salvo.",
            Arrays.asList(Advantage.CASADOCONELMAR, Advantage.LIDERAZGO, Advantage.UNOCONELBARCO),
            Arrays.asList(Skill.APUNTAR, Skill.CONVENCER, Skill.NAVEGACION, Skill.PERCEPCION, Skill.TACTICASDEGUERRA)),
    GRANJERO("Granjero", "Te criaste en una granja pequeña, trabajando para sobrevivir, y nunca has conocido la vida de aventura.",
            "Ganas 1 punto de héroe cuando resuelvas un problema complejo de una forma sencilla que ya conoces de tu vida en la granja.",
            Arrays.asList(Advantage.CARACTERISTICALEGENDARIA, Advantage.SUPERVIVIENTE),
            Arrays.asList(Skill.ATLETISMO, Skill.CONVENCER, Skill.EMPATIA, Skill.EQUITACION, Skill.INTERPRETAR)),
    CRIMINAL("Criminal", "Rompes las leyes injustas para conseguir lo que crees que es un bien mayor.",
            "Ganas 1 punto de héroe cuando rompas la ley para perseguir una empresa noble.",
            Arrays.asList(Advantage.CALLEJERO, Advantage.CAMARADERIA),
            Arrays.asList(Skill.ATLETISMO, Skill.EMPATIA, Skill.ESCONDER, Skill.INTIMIDAR, Skill.ROBAR)),
    ERUDITO("Erudito", "Te dedicas a aprender y a documentar todas las maravillas de Terra.",
            "Ganas 1 punto de héroe cuando te pongas en peligro por ir tras el conocimiento.",
            Arrays.asList(Advantage.LINGUISTA, Advantage.UNIVERSIDAD),
            Arrays.asList(Skill.CONOCIMIENTO, Skill.CONVENCER, Skill.EMPATIA, Skill.INTERPRETAR, Skill.PERCEPCION)),
    CAZADOR("Cazador", "Duermes bajo las estrellas y cazas tu comida con tus propias manos.",
            "Ganas 1 punto de héroe cuando uses tu perspicacia de cazador para salvar a alguien del peligro.",
            Arrays.asList(Advantage.FRANCOTIRADOR, Advantage.LOTENGO),
            Arrays.asList(Skill.APUNTAR, Skill.EQUITACION, Skill.ESCONDER, Skill.INTIMIDAR, Skill.PERCEPCION)),
    CORTESANO("Cortesano", "Asistes con regularidad a las cortes de tu nación natal y actúas como diplomático en las cortes extranjeras.",
            "Ganas 1 punto de héroe cuando consigas aplacar una situación violenta con tu encanto y talento.",
            Arrays.asList(Advantage.AMIGOSENLACORTE, Advantage.UNINOCENTEMALENTENDIDO),
            Arrays.asList(Skill.ARMAS, Skill.EMPATIA, Skill.EQUITACION, Skill.INTERPRETAR, Skill.TENTAR)),
    ESPADACHIN("Espadachín", "Has dedicado tu vida a dominar la espada.",
            "Ganas 1 punto de héroe cuando recurras al filo de tu espada para defender un ideal noble.",
            Arrays.asList(Advantage.ACADEMIADEESGRIMA),
            Arrays.asList(Skill.ARMAS, Skill.ATLETISMO, Skill.EMPATIA, Skill.INTIMIDAR, Skill.INTERPRETAR)),
    ESPIA("Espía", "Sirves a tu nación infiltrándote entre sus enemigos y consiguiendo sus secretos.",
            "Ganas 1 punto de héroe cuando corras un gran riesgo para descubrir un secreto.",
            Arrays.asList(Advantage.INMUNIDADALVENENO, Advantage.OPORTUNISTA),
            Arrays.asList(Skill.EMPATIA, Skill.ESCONDER, Skill.PERCEPCION, Skill.ROBAR, Skill.TENTAR)),
    EXPLORADOR("Explorador", "Vives para ver los lugares más lejanos que Terra tiene para ofrecer.",
            "Ganas 1 punto de héroe cuando pongas la mirada sobre un paisaje que pocos théanos, o ninguno, han visto antes.",
            Arrays.asList(Advantage.ALLANAMIENTODEMORADA, Advantage.REFLEJOSRAPIDOS),
            Arrays.asList(Skill.ATLETISMO, Skill.CONVENCER, Skill.EMPATIA, Skill.EQUITACION, Skill.NAVEGACION)),
    HUERFANO("Huérfano", "Perdiste a tus padres a una edad temprana y te has visto obligado a cuidar de ti mismo.",
            "Ganas 1 punto de héroe cuando te pongas en peligro para asegurarte de que otra persona no tenga que estar sola.",
            Arrays.asList(Advantage.DERROTATEMERARIA, Advantage.HURTO),
            Arrays.asList(Skill.ATLETISMO, Skill.EMPATIA, Skill.ESCONDER, Skill.INTIMIDAR, Skill.PELEAR)),
    INGENIERO("Ingeniero", "Estás interesado en aplicar el conocimiento científico, las matemáticas y el ingenio para desarrollar soluciones a los problemas técnicos, sociales y comerciales.",
            "Ganas 1 punto de héroe cuando utilices tu destreza tecnológica para resolver un problema.",
            Arrays.asList(Advantage.MAESTROARTESANO, Advantage.NOCIONDELTIEMPO, Advantage.SENTIDODELAORIENTACION),
            Arrays.asList(Skill.APUNTAR, Skill.TACTICASDEGUERRA, Skill.CONOCIMIENTO, Skill.CONVENCER, Skill.EQUITACION)),
    INTENDENTE("Intendente", "Sirves en un barco y te haces cargo de todas las cosas que ignoran los marineros.",
            "Ganas 1 punto de héroe cuando resuelvas un problema para tu tripulación.",
            Arrays.asList(Advantage.LOTENGO, Advantage.MANOSO, Advantage.UNOCONELBARCO),
            Arrays.asList(Skill.APUNTAR, Skill.ESCONDER, Skill.NAVEGACION, Skill.PELEAR, Skill.TACTICASDEGUERRA)),
    INTERPRETE("Intérprete", "Trabajas sin descanso para crear una experiencia de belleza.",
            "Ganas 1 punto de héroe cuando uses tus habilidades de complacer al público por algo más que conseguir unas cuantas monedas.",
            Arrays.asList(Advantage.INSPIRARGENEROSIDAD, Advantage.VIRTUOSO),
            Arrays.asList(Skill.ATLETISMO, Skill.EMPATIA, Skill.INTERPRETAR, Skill.ROBAR, Skill.TENTAR)),
    JENNY("Jenny", "Seduces a otros para divertirte y sacar beneficio.",
            "Ganas 1 punto de héroe cuando resuelvas un conflicto con la seducción o con artimañas.",
            Arrays.asList(Advantage.ENFOQUEDINAMICO, Advantage.VENAQUI),
            Arrays.asList(Skill.APUNTAR, Skill.ATLETISMO, Skill.EMPATIA, Skill.INTERPRETAR, Skill.TENTAR)),
    MARINERO("Marinero", "No sirves a ningún país ni dueño, pero el barco y tu tripulación son toda la familia que necesitas.",
            "Ganas 1 punto de héroe cuando pongas a un lado tus deseos personales para asegurar la seguridad y la comodidad de tus aliados.",
            Arrays.asList(Advantage.PELEADEBAR, Advantage.VISTADELINCE),
            Arrays.asList(Skill.ARMAS, Skill.NAVEGACION, Skill.PELEAR, Skill.PERCEPCION, Skill.TENTAR)),
    MEDICO("Médico", "Trabajas para curar a los enfermos y asistir a los heridos.",
            "Ganas 1 punto de héroe cuando cures las heridas de un villano o de inocentes heridos por un villano.",
            Arrays.asList(Advantage.NOCIONDELTIEMPO, Advantage.TOQUEMILAGROSO),
            Arrays.asList(Skill.CONOCIMIENTO, Skill.CONVENCER, Skill.EMPATIA, Skill.EQUITACION, Skill.PERCEPCION)),
    MERCADER("Mercader", "Viajas por la campiña para vender tus mercancías en mercados o puertos.",
            "Ganas 1 punto de héroe cuando vendas un objeto por mucho menos de lo que vale a alguien que lo necesita desesperadamente.",
            Arrays.asList(Advantage.LICEO, Advantage.NOCIONDELTIEMPO),
            Arrays.asList(Skill.CONVENCER, Skill.EMPATIA, Skill.EQUITACION, Skill.INTIMIDAR, Skill.TENTAR)),
    MERCENARIO("Mercenario", "Vendes tus habilidades en batalla al mejor postor.",
            "Ganas 1 punto de héroe cuando elijas llevar a cabo tu trabajo por una razón que para ti vale más que el dinero.",
            Arrays.asList(Advantage.DURODEMATAR, Advantage.ESTOMAGODEHIERRO),
            Arrays.asList(Skill.ARMAS, Skill.ATLETISMO, Skill.INTIMIDAR, Skill.PELEAR, Skill.PERCEPCION)),
    OFICIALDELAMARINA("Oficial de la Marina", "Te enrolaste en la marina y te abriste paso en la tripulación de un barco.",
            "Ganas 1 punto de héroe cuando pongas las necesidades de la tripulación por encima de las de la misión.",
            Arrays.asList(Advantage.EQUILIBRIOPERFECTO, Advantage.REGATEAR, Advantage.UNOCONELBARCO),
            Arrays.asList(Skill.ARMAS, Skill.INTIMIDAR, Skill.NAVEGACION, Skill.PERCEPCION, Skill.TACTICASDEGUERRA)),
    OFICIALDELEJERCITO("Oficial del Ejército", "Te enrolaste en el ejército y pronto te encontraste en una posición de mando.",
            "Ganas 1 punto de héroe cuando tomes el mando durante un momento de intensa violencia o de extremo peligro.",
            Arrays.asList(Advantage.ACADEMIA, Advantage.SENTIDODELAORIENTACION),
            Arrays.asList(Skill.APUNTAR, Skill.ATLETISMO, Skill.EQUITACION, Skill.INTIMIDAR, Skill.TACTICASDEGUERRA)),
    PIRATA("Pirata", "Surcas los mares tomando lo que necesitas y otorgando verdadera libertad a todos los que acepten la llamada.",
            "Ganas 1 punto de héroe cuando hagas un sacrificio personal para asegurar la libertad de otro.",
            Arrays.asList(Advantage.DONDEPONGOELOJO, Advantage.VOLUNTADINDOMITA),
            Arrays.asList(Skill.APUNTAR, Skill.INTIMIDAR, Skill.NAVEGACION, Skill.PERCEPCION, Skill.ROBAR)),
    PROFESOR("Profesor", "Enseñas a otros en una prestigiosa institución de enseñanza.",
            "Ganas 1 punto de héroe cuando uses conocimientos sacados de un texto enrevesado para resolver un problema complejo.",
            Arrays.asList(Advantage.NUMERARIO, Advantage.TRABAJOENEQUIPO),
            Arrays.asList(Skill.CONOCIMIENTO, Skill.CONVENCER, Skill.EMPATIA, Skill.INTERPRETAR, Skill.TENTAR)),
    PUGILISTA("Pugilista", "Confías en tus manos y en tus pies para resolver todos los problemas violentos de tu vida.",
            "Ganas 1 punto de héroe cuando tires lo que estés sujetando para luchar con los puños, independientemente del arma de tu oponente.",
            Arrays.asList(Advantage.BOXEADOR, Advantage.MIRARFIJAMENTE),
            Arrays.asList(Skill.ATLETISMO, Skill.CONVENCER, Skill.EMPATIA, Skill.INTERPRETAR, Skill.PELEAR)),
    SACERDOTE("Sacerdote", "Sirves a una causa mayor con cada aliento que respiras.",
            "Ganas 1 punto de héroe cuando dejes a un lado la retórica y pongas en práctica las virtudes que predicas.",
            Arrays.asList(Advantage.INSPIRARGENEROSIDAD, Advantage.MIEMBRODELAORDEN),
            Arrays.asList(Skill.CONOCIMIENTO, Skill.EMPATIA, Skill.EQUITACION, Skill.INTERPRETAR, Skill.TENTAR)),
    SIRVIENTE("Sirviente", "Trabajas para otro haciendo lo que tu amo te dice que hagas.",
            "Ganas 1 punto de héroe cuando te pongas en peligro para ayudar a otro personaje en una tarea difícil.",
            Arrays.asList(Advantage.JACKMALTIEMPO, Advantage.TRABAJOENEQUIPO),
            Arrays.asList(Skill.EQUITACION, Skill.ESCONDER, Skill.PERCEPCION, Skill.ROBAR, Skill.TENTAR)),
    SOLDADO("Soldado", "Sabes cómo luchar y cómo matar, y te has ganado la vida haciéndolo bajo estandartes y para otros señores.",
            "Ganas 1 punto de héroe cuando te ciñas al plan independientemente del peligro que te suponga.",
            Arrays.asList(Advantage.BUENBEBEDOR, Advantage.CAMORRISTA),
            Arrays.asList(Skill.APUNTAR, Skill.ARMAS, Skill.INTIMIDAR, Skill.PERCEPCION, Skill.TACTICASDEGUERRA));


    private String backgroundName;
    private String backgroundDescription;
    private String backgroundPeculiarity;
    private List<Advantage> backgroundAdvantages;
    private List<Skill> backgroundSkills;

    Background(String backgroundName, String backgroundDescription, String backgroundPeculiarity, List<Advantage> backgroundAdvantages, List<Skill> backgroundSkills) {
        this.backgroundName = backgroundName;
        this.backgroundDescription = backgroundDescription;
        this.backgroundPeculiarity = backgroundPeculiarity;
        this.backgroundAdvantages = backgroundAdvantages;
        this.backgroundSkills = backgroundSkills;
    }

    public String getBackgroundName() {
        return backgroundName;
    }

    public String getBackgroundDescription() {
        return backgroundDescription;
    }

    public String getBackgroundPeculiarity() {
        return backgroundPeculiarity;
    }

    public List<Advantage> getBackgroundAdvantages() {
        return backgroundAdvantages;
    }

    public List<Skill> getBackgroundSkills() {
        return backgroundSkills;
    }
}
