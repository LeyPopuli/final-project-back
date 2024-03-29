use hero_generator;

INSERT INTO characteristic (id, name)
VALUES
  ('MUSCULO', 'Músculo'),
  ('MANA', 'Maña'),
  ('BRIO', 'Brío'),
  ('INGENIO', 'Ingenio'),
  ('DONAIRE', 'Donaire');
  
INSERT INTO language (id, name)
VALUES
    ('AVALONES', 'Avalonés'),
    ('EISENO', 'Eiseno'),
    ('CASTELLANO', 'Castellano'),
    ('SARMATA', 'Sármata'),
    ('MONTAIGNES', 'Montaignés'),
    ('USSURO', 'Ussuro'),
    ('VESTENIO', 'Vestenio'),
    ('VODACCIO', 'Vodaccio'),
    ('THEANOANTIGUO','Théano antiguo');   
  
INSERT INTO hybris (id, name, description)
VALUES
  ('CURIOSO', 'Curioso', 'Recibe 1 punto de héroe cuando investigues algo inusual, especialmente si parece peligroso.'),
  ('INSEGURO', 'Inseguro', 'Recibe 1 punto de héroe cuando tu héroe decida que no puede realizar una acción sin la ayuda de otro héroe. Por ejemplo, puedes insistir para que otro héroe gaste 1 punto de héroe y te dé dados adicionales o pedirle que use una de sus ventajas para ayudarte.'),
  ('AMBICIOSO', 'Ambicioso', 'Recibe 1 punto de héroe cuando busques poder y el trato que persigas sea peligroso o cause problemas.'),
  ('MALHADADO', 'Malhadado', 'Recibe 1 punto de héroe cuando tu héroe se enamore de alguien de quien realmente no debería enamorarse.'),
  ('DESAFORTUNADO', 'Desafortunado', 'Recibe 2 puntos de héroe cuando decidas fallar un Riesgo importante antes de tirar los dados.'),
  ('CANDIDO', 'Cándido', 'Recibe 1 punto de héroe cuando aceptes las mentiras de alguien o un trato injusto.'),
  ('ARROGANTE', 'Arrogante', 'Recibe 1 punto de héroe cuando tu héroe demuestre desdén o desprecio o subestime a un villano o a alguien que podría dañar a tus amigos.'),
  ('ENVIDIOSO', 'Envidioso', 'Recibe 1 punto de héroe cuando tu héroe codicie algo y haga algo imprudente para conseguirlo.'),
  ('MANIPULADOR', 'Manipulador', 'Recibe 1 punto de héroe cuando intentes hacer que otra persona haga el trabajo sucio por ti y te salga el tiro por la culata.'),
  ('LEAL', 'Leal', 'Recibe 1 punto de héroe cuando tu héroe vuelva atrás a por un compañero caído o se niegue a dejar a un aliado herido.'),
  ('INDECISO', 'Indeciso', 'Recibe 1 punto de héroe cuando tu héroe gaste una acción para detenerse vacilando, dudando o inseguro antes de realizar un movimiento.'),
  ('FIRME', 'Firme', 'Recibe 1 punto de héroe cuando te metas en problemas si te niegas a irte o cuando te retiras en un momento en el que tengas ventaja.'),
  ('TESTARUDO', 'Testarudo', 'Recibe 1 punto de héroe cuando tu héroe sea testarudo y se niegue a cambiar de opinión ante la evidencia.'),
  ('CONFUSO', 'Confuso', 'Recibe 1 punto de héroe cuando tu héroe no consiga entender un elemento importante de la trama y el malentendido conduzca además a un peligro, para sí mismo o para otros.'),
  ('ORGULLOSO', 'Orgulloso', 'Recibe 1 punto de héroe cuando tu héroe se niegue a aceptar la ayuda que se le ofrece. Por ejemplo, cuando un héroe quiera gastar 1 punto de héroe para darte 1 dado adicional y tú lo rechaces.'),
  ('PREPOTENTE', 'Prepotente', 'Recibe 1 punto de héroe cuando tu héroe defienda firmemente una de sus opiniones en un momento o lugar inadecuados.'),
  ('RENCOROSO', 'Rencoroso', 'Recibe 1 punto de héroe cuando saques antiguos rencores o malos sentimientos y eso haga que te metas en problemas.'),
  ('IMPRUDENTE', 'Imprudente', 'Recibe 1 punto de héroe cuando tus acciones atrevidas, arrogantes o temerarias te provoquen problemas a ti y a otro héroe.'),
  ('SUPERSTICIOSO', 'Supersticioso', 'Recibe 1 punto de héroe cuando te niegues a resolver un problema usando Hechicería, un artefacto o cualquier otro efecto místico en el que no confías.'),
  ('TEMPERAMENTAL', 'Temperamental', 'Recibe 1 punto de héroe cuando tu héroe pierda los estribos y se enfurezca y eso cause problemas.');
  
INSERT INTO religion (id, name) VALUES
    ('LAIGLESIADELOSPROFETAS', 'La Iglesia de los Profetas'),
    ('OBJECIONISTAS', 'Objecionistas'),
    ('ORTODOXOS', 'Ortodoxos'),
    ('LAIGLESIADEAVALON', 'La Iglesia de Ávalon'),
    ('PAGANISMO', 'Paganismo'),
    ('POLITEISMO', 'Politeísmo'),
    ('LOSDRUIDAS', 'Los Druidas'),
    ('MITOLOGIAVIVA', 'Mitología Viva'),
    ('LAINQUISICION', 'La Inquisición'),
    ('LOSINSTRUMENTOSDELALEGION', 'Los Instrumentos de Legión');
    
INSERT INTO skill (id, name, description) VALUES
    ('APUNTAR', 'Apuntar', 'Usa Apuntar cuando apuntes con una pistola a alguien y aprietes el gatillo. Usa Apuntar cuando lances un cuchillo en una habitación abarrotada con mucha precisión, independientemente de que el objetivo sea una persona o un objeto.'),
    ('ARMAS', 'Armas', 'Usa Armas cuando ataques a alguien mientras empuñes una espada, un hacha, un martillo o un cuchillo.'),
    ('ATLETISMO', 'Atletismo', 'Usa Atletismo cuando recorras una habitación colgado de una lámpara, saltes de tejado en tejado o realices cualquier otra proeza física peligrosa.'),
    ('CONOCIMIENTO', 'Conocimiento', 'Usa Conocimiento cuando hables con entusiasmo sobre un tema determinado, ya sea por experiencia personal o por haberlo estudiado. Usa Conocimiento cuando eches mano de tu bagaje para completar los detalles de un tema determinado. Usa Conocimiento cuando recurras a tu aprendizaje como médico para asistir a un herido.'),
    ('CONVENCER', 'Convencer', 'Usa Convencer cuando apeles a la parte buena de otro personaje. Usa Convencer cuando le asegures a alguien que eres completamente honesto con él y que debería confiar en ti.'),
    ('EMPATIA', 'Empatía', 'Usa Empatía cuando quieras saber si alguien está siendo sincero. Usa Empatía cuando determines el estado mental general de alguien (tiene miedo, está nervioso o está enfadado).'),
    ('EQUITACION', 'Equitación', 'Usa Equitación cuando te enzarces en una persecución de carruajes a toda velocidad. Usa Equitación cuando montes un caballo al galope a través del bosque.'),
    ('ESCONDER', 'Esconder', 'Usa Esconder cuando te cueles en una habitación oscura sin que la guardia te vea. Usa Esconder cuando te escondas un objeto y para evitar que lo encuentren si te cachean. Usa Esconder para atacar a una víctima desprevenida con un arma o con los puños. Usa Esconder para disfrazarte o camuflarte en un lugar.'),
    ('INTERPRETAR', 'Interpretar', 'Usa Interpretar cuando intentes cautivar a una audiencia con tus dotes teatrales. Usa Interpretar para transmitirle un mensaje a tu audiencia o para provocarle una emoción determinada a través de tu actuación (para hacerle reír con tu comedia o llorar con tu tragedia, exaltar al público con un discurso motivacional, etcétera).'),
    ('INTIMIDAR', 'Intimidar', 'Usa Intimidar cuando quieras que alguien haga algo y le amenaces con realizar alguna acción, ya sea física o no.'),
    ('NAVEGACION', 'Navegación', 'Usa Navegación cuando te abras camino a través del cordaje de un barco. Usa Navegación cuando intentes dirigir un barco durante una batalla naval en el mar o a través de un canal estrecho y peligroso.'),
    ('PELEAR', 'Pelear', 'Usa Pelear cuando le des un puñetazo o una patada a alguien en la cara. Usa Pelear cuando agarres a alguien y lo arrastres por un callejón.'),
    ('PERCEPCION', 'Percepción', 'Usa Percepción cuando investigues una escena de un crimen o busques pistas en el estudio de un villano. Usa Percepción cuando quieras identificar detalles precisos de un vistazo.'),
    ('ROBAR', 'Robar', 'Usa Robar cuando cojas algo del bolsillo de alguien sin que se dé cuenta. Usa Robar cuando abras una cerradura, una caja fuerte o algo similar.'),
    ('TACTICASDEGUERRA', 'Tácticas de Guerra', 'Usa Tácticas de Guerra cuando necesites experiencia táctica, como cuando rompes las defensas de un castillo. Usa Tácticas de Guerra cuando lideres a un ejército en batalla.'),
    ('TENTAR', 'Tentar', 'Usa Tentar cuando sobornes a alguien para que haga por ti algo que realmente no debería hacer. Usa Tentar cuando convenzas a alguien de que te dé algo de "tiempo a solas".');    

INSERT INTO virtue (id, name, description) VALUES
    ('ASTUTO', 'Astuto', 'Activa tu Virtud para escapar del peligro en la escena actual. Solo te puedes salvar a ti mismo.'),
    ('AMIGABLE', 'Amigable', 'Activa tu Virtud cuando te encuentres con un personaje (incluso un villano) por primera vez. Te tratará como a un amigo durante una escena.'),
    ('DECIDIDO', 'Decidido', 'Activa tu Virtud y apunta a un villano. Hasta el final de esta escena, no puedes gastar puntos de héroe y el villano no puede gastar puntos de peligro.'),
    ('APASIONADO', 'Apasionado', 'Activa tu Virtud para evitar que otro héroe sufra Heridas, pero tú sufrirás 1 Herida Dramática en su lugar.'),
    ('AFORTUNADO', 'Afortunado', 'Activa tu Virtud para retrasar en una acción una Oportunidad o una Consecuencia.'),
    ('AGUDO', 'Agudo', 'Activa tu Virtud después de que un villano gaste Aumentos en una acción. Esa acción falla y el villano pierde los Aumentos que gastó.'),
    ('HUMILDE', 'Humilde', 'Activa tu Virtud para conseguir 2 puntos de héroe, en lugar 1, cuando actives tu Hibris o una Peculiaridad.'),
    ('SAGAZ', 'Sagaz', 'Activa tu Virtud para saber la especialidad de la banda de matones a la que te enfrentas o para descubrir el nivel y las ventajas de un villano.'),
    ('INTUITIVO', 'Intuitivo', 'Activa tu Virtud para hacerle al DJ una pregunta sobre un PNJ que pueda responderse con un "sí" o "no". Si hay algún matiz en la respuesta, el DJ debería ser generoso y responder con más detalle.'),
    ('VICTORIOSO', 'Victorioso', 'Activa tu Virtud la primera vez que inflijas Heridas a un villano durante una pelea para obligarle a que reciba 1 Herida Dramática, además de las Heridas que normalmente infligirías.'),
    ('ALTRUISTA', 'Altruista', 'Activa tu Virtud para sufrir las Consecuencias de un Riesgo en lugar de otro héroe.'),
    ('FLEXIBLE', 'Flexible', 'Activa tu Virtud para realizar tu primera acción antes que todos los demás en una ronda.'),
    ('CONFORTADOR', 'Confortador', 'Activa tu Virtud para cancelar los efectos del Miedo sobre tus amigos y tú.'),
    ('SUTIL', 'Sutil', 'Activa tu Virtud cuando actúes entre bambalinas, desde las sombras o a través de un representante. Para el siguiente Riesgo, cuando determines los Aumentos, cada dado cuenta como 1 Aumento.'),
    ('GLORIOSO', 'Glorioso', 'Activa tu Virtud cuando seas el centro de atención. Para el siguiente Riesgo, cuando determines tus Aumentos, cada dado cuenta como 1 Aumento.'),
    ('ILUMINADO', 'Iluminado', 'Activa tu Virtud para saber, hasta el final de la escena, cuándo te está mintiendo cualquier otro personaje.'),
    ('EJEMPLAR', 'Ejemplar', 'Activa tu Virtud y elige otro héroe que se encuentre en la misma escena para sumar vuestra reserva de Aumentos durante toda la ronda. Para realizar acciones gastáis Aumentos de esta reserva compartida.'),
    ('VALENTE', 'Valiente', 'Activa tu Virtud para añadir tantos dados adicionales a tu Riesgo como el valor de Miedo de tu objetivo.'),
    ('FRUGAL', 'Frugal', 'Activa tu Virtud para evitar que te afecte cualquier efecto mágico (hechicería, artefactos, monstruos, etcétera).'),
    ('IMPONENTE', 'Imponente', 'Activa tu Virtud y el DJ le dará 1 punto de héroe al resto de héroes que se encuentren en esta escena.');

INSERT INTO nation (id, name, language_id, religion_id) VALUES
    ('AVALON', 'Ávalon', 'AVALONES', 'LAIGLESIADEAVALON'),
    ('CASTILLA', 'Castilla', 'CASTELLANO', 'LAIGLESIADELOSPROFETAS'),
    ('EISEN', 'Eisen', 'EISENO', 'LAIGLESIADELOSPROFETAS'),
    ('INISMORE', 'Inismore', 'AVALONES', 'PAGANISMO'),
    ('MANCOMUNIDADSARMATA', 'Mancomunidad Sármata', 'SARMATA', 'POLITEISMO'),
    ('LASMARCASALTAS', 'Las Marcas Altas', 'AVALONES', 'OBJECIONISTAS'),
    ('MONTAIGNE', 'Montaigne', 'MONTAIGNES', 'LAIGLESIADELOSPROFETAS'),
    ('USSURA', 'Ussura', 'USSURO', 'ORTODOXOS'),
    ('VESTENMENNAVENJAR', 'Vestenmennavenjar', 'VESTENIO', 'MITOLOGIAVIVA'),
    ('VODACCE', 'Vodacce', 'VODACCIO', 'LAIGLESIADELOSPROFETAS');
    
INSERT INTO advantage(id, name, points, description) VALUES
('BUENBEBEDOR', 'Buen bebedor', 1, 'El alcohol nunca te afecta negativamente, no importa cuánto bebas.'),
('ESTOMAGODEHIERRO', 'Estómago de hierro', 1, 'La comida estropeada o cruda nunca te afecta negativamente y sigues consiguiendo el sustento necesario de ella.'),
('EXTRANJERO', 'Extranjero', 1, 'Elige una nación de Théah que no sea tu tierra natal; ahí será donde te criaste. Por ejemplo, si tus padres eran castellanos pero te criaste en Vodacce, podrías ser Extranjero (Vodacce). Cualquier Riesgo que realices que se beneficiaría de una herencia doble (como usar Convencer para negociar entre dos mercaderes originarios de tus dos culturas o usar Tentar para saber qué decir para sobornar a una patrulla fronteriza y que te deje pasar sin inspeccionarte) consigue 1 dado adicional.'),
('GRANDE', 'Grande', 1, 'No puedes adquirir la ventaja "Pequeño". Consigues 1 dado adicional en cualquier Riesgo que se vea beneficiado debido a tu tamaño, como por ejemplo, usar Atletismo para correr a toda velocidad mientras llevas a cuestas a otro héroe o acercarte a alguien para achantarlo con Intimidar.'),
('LINGUISTA', 'Lingüista', 1, 'Hablas, lees y escribes todas las lenguas de Théah, incluso las muertas.'),
('NOCIONDELTIEMPO', 'Noción del tiempo', 1, 'Siempre sabes qué hora es. Sabes cuánto falta hasta el siguiente amanecer o puesta de sol con menos de un minuto de margen de error.'),
('PEQUENO', 'Pequeño', 1, 'No puedes adquirir la ventaja "Grande". Eres más pequeño que el resto de théanos medios. Mucho más pequeño. Consigues 1 dado adicional si tu tamaño hace que un Riesgo sea más fácil (como usar Esconder para escabullirte en un espacio pequeño y escapar de una patulla de guardias o usar Atletismo para deslizarte entre los barrotes de una celda).'),
('SENTIDODELAORIENTACION', 'Sentido de la orientación', 1, 'Nunca te pierdes mientras tengas un punto de referencia, aunque eso no es lo mismo que saber exactamente dónde estás. Si te dejan inconsciente y te despiertas en una mazmorra, no tienes por qué saber en qué ciudad estás, pero si consigues escapar de la celda nunca te desviarás en los serpenteantes túneles de la mazmorra.'),
('SUPERVIVIENTE', 'Superviviente', 1, 'Si te encuentras en la naturaleza, puedes forrajear o cazar y encontrar comida suficiente para ti y otras cinco personas. Bajo circunstancias extremas (perdido en medio de un desierto o abandonado en la tundra ussura, por ejemplo), encuentras comida suficiente para ti y otras dos personas.'),
('UNOCONELBARCO', 'Uno con el barco', 1, 'Nunca pierdes el equilibrio mientras te encuentres a bordo de un barco. Además, consigues 1 dado adicional en cualquier Riesgo físico mientras estés a bordo de un barco en el mar (como enzarzarte en una lucha con espadas en la cubierta de un barco inclinado o escalar por el cordaje durante una tormenta).'),
('ALLANAMIENTODEMORADA', 'Allanamiento de morada', 2, 'Puedes gastar 1 punto de héroe para localizar un modo de entrar en un edificio o en un área restringida. Puedes llevar contigo hasta un personaje, pero el resto tiene que encontrar su propio modo de entrar o esperar hasta que les abras un camino.'),
('AMIGOSENLACORTE', 'Amigos en la corte', 2, 'Cuando estés en un baile, un banquete o un acto similar de la alta sociedad, gasta 1 punto de héroe para revelar que tienes un amigo cercano que también está presente.'),
('CALLEJERO', 'Callejero', 2, 'Puedes gastar 1 punto de héroe para localizar a alguien que te arregle un asunto, un soplón, un contrabandista o una figura similar de los bajos fondos.'),
('CASADOCONELMAR', 'Casado con el mar', 2, 'Tienes acceso a un barco. Si tus aliados y tú ya tenéis acceso a un barco, entonces este gana un Trasfondo adicional.'),
('CHISTPORAQUI', 'Chist, por aquí', 2, 'Mientras no te detecten, puedes gastar 1 punto de héroe para atraer a un solo personaje hasta tu posición y noquearlo. Otros personajes que se encuentren en la misma área no se dan cuenta de tu presencia.'),
('CONTACTOS', 'Contactos', 2, 'Tienes contactos que pueden darte información o ayudarte cuando lo necesites. Elije un tipo de contacto, como "Bajos fondos de Freiburg", "Guardia de la ciudad de Cinco Velas" o "Cortesanos de la clase alta de Vodacce", por ejemplo.'),
('DERROTATEMERARIA', 'Derrota temeraria', 2, 'Gasta 1 punto de héroe para derrotar de manera inmediata a una sola banda de matones, independientemente de su Fuerza, pero recibes 1 Herida Dramática.'),
('EQUILIBRIOPERFECTO', 'Equilibrio perfecto', 2, 'Gasta 1 punto de héroe para moverte por una viga estrecha, saltar de un lugar a otro o realizar cualquier otra hazaña de perfecta agilidad y equilibrio.'),
('ESPIRITUVALIENTE', 'Espíritu valiente', 2, 'Empiezas cada partida con 2 puntos de héroe, en lugar de 1.'),
('FASCINAR', 'Fascinar', 2, 'Gasta 1 punto de héroe para llamar la atención de otro personaje, que solo estará atento a ti hasta el final de la escena o hasta que dejes de hablarle o prestarle atención, lo que suceda primero.'),
('HECHICERIA', 'Hechicería', 2, 'Consigues la Hechicería de la línea sanguínea de tu nación. Si adquieres esta ventaja después de crear el héroe, solo puedes hacerlo con una historia de héroe.'),
('INMUNIDADALVENENO', 'Inmunidad al veneno', 2, 'El veneno nunca te afecta, aparte de un ligero malestar. Si normalmente el veneno te mataría, solo te hará vomitar, pero no tiene otros efectos secundarios.'),
('INSPIRARGENEROSIDAD', 'Inspirar generosidad', 2, 'Gasta 1 punto de héroe para convencer a otro personaje de que te dé un objeto que quieres sin ningún coste. Podría darte algo que ya tiene o intentar conseguírtelo por todos los medios, legales o ilegales, sea cual sea la forma más fácil para él de echarle el guante a lo que quieres.'),
('LIBERARSE', 'Liberarse', 2, 'Gasta 1 punto de héroe para liberar tus manos de unas esposas, desatarte la cuerda que te ata a una silla o liberarte a ti mismo de cualquier otra forma similar.'),
('LIDERAZGO', 'Liderazgo', 2, 'Gasta 1 punto de héroe para inspirar a un grupo a que actúe. El grupo debe poder oírte, pero si pueden hacerlo y son neutrales o tienen una buena disposición, harán lo que les mandes mientras sea algo razonable.'),
('LOTENGO', '¡Lo tengo!', 2, 'Gasta 1 punto de héroe para abrir una cerradura, abrir una caja fuerte o desactivar una trampa de manera inmediata.'),
('MANOSO', 'Mañoso', 2, 'Gasta 1 punto de héroe para reparar un objeto roto, apañar una pistola estropeada, parchear un barco que tiene una fuga o realizar milagros similares que hagan que el objeto funcione con normalidad durante el resto de la escena.'),
('MIRARFIJAMENTE', 'Mirar fijamente', 2, 'Gasta 1 punto de héroe para intimidar a un personaje y que retire una amenaza, te deje entrar donde no deberías o que se quite de tu camino de cualquier otro modo.'),
('PARIENTESLEJANOS', 'Parientes lejanos', 2, 'Gasta 1 punto de héroe para revelar que tienes un primo lejano que vive cerca y que puede ayudarte con materiales, información o refugio.'),
('REGATEAR', 'Regatear', 2, 'Gasta 1 punto de héroe para convencer a alguien de que haga un trato contigo, que te haga un descuento razonable o que le asegure a alguien que te conoce que "eres bueno en algo".'),
('REPUTACION', 'Reputación', 2, 'Determina cuál es tu reputación con un solo adjetivo ("Honorable", "Vicioso", etcétera). Cuando uses tu reputación para sacar ventaja en los Riesgos sociales, consigues 1 dado adicional.'),
('SONRISAENCANTADORA', 'Sonrisa encantadora', 2, 'Gasta 1 punto de héroe para evitar que otro personaje saque un arma, empiece una pelea o recurra a la violencia.'),
('TRABAJOENEQUIPO', 'Trabajo en equipo', 2, 'Puedes gastar 2 Aumentos para crear una Oportunidad y activar la Oportunidad en beneficio de otro héroe voluntario, que no necesita gastar su propio Aumento.'),
('VENAQUI', 'Ven aquí', 2, 'Gasta 1 punto de héroe para atraer a otro personaje a una habitación privada y marcharte después de dicha habitación sin él, con lo que lo sacas de la escena.'),
('VISTADELINCE', 'Vista de lince', 2, 'Puedes ver perfectamente hasta una distancia de un kilómetro y medio mientras tengas una línea de visión despejada. Si usas un catalejo incluso puedes distinguir detalles, como la inscripción de un anillo. Si realizas un Riesgo que se base principalmente en tu visión, consigues 1 dado adicional.'),
('VOLUNTADINDOMITA', 'Voluntad indómita', 2, 'Gasta 1 punto de héroe para resistirte automáticamente después de que otro personaje intente intimidarte, seducirte o provocarte.'),
('BOXEADOR', 'Boxeador', 3, 'Ganas 1 dado adicional cuando realices un Riesgo de Pelear para dar un puñetazo, una patada, un cabezazo o para herir de cualquier otro modo a un personaje usando únicamente tu cuerpo.'),
('CAMARADERIA', 'Camaradería', 3, 'Cuando gastes 1 punto de héroe para ayudar a un aliado, este gana 4 dados en lugar de 3.'),
('DONDEPONGOELOJO', 'Donde pongo el ojo', 3, 'Consigues 1 dado adicional cuando realizas un Riesgo de Apuntar usando una pistola, un trabuco o un arma arrojadiza como un cuchillo o un hacha.'),
('ENFOQUEDINAMICO', 'Enfoque dinámico', 3, 'Gasta 1 punto de héroe para cambiar tu Enfoque durante una secuencia de acción o una secuencia dramática.'),
('ESGRIMISTA', 'Esgrimista', 3, 'Consigues 1 dado adicional cuando realizas un Riesgo de Armas usando un florete, una daga, un alfanje u otra arma similar.'),
('FRANCOTIRADOR', 'Francotirador', 3, 'Ganas 1 dado adicional cuando realices un Riesgo de Apuntar usando un mosquete de cañón largo, un arco largo o una ballesta.'),
('GORILA', 'Gorila', 3, 'Ganas 1 dado adicional cuando realices un Riesgo de Armas usando un claymore, zweihander, hacha de batalla, alabarda o cualquier otra arma similar de dos manos.'),
('HURTO', 'Hurto', 3, 'Gasta 1 punto de héroe para hurtar algo de un bolsillo, robar un anillo que otro personaje lleva puesto o colocar un pequeño objeto en la mano de otro personaje sin que se dé cuenta.'),
('JACKMALTIEMPO', 'Jack Mal Tiempo', 3, 'Tu héroe consigue una segunda historia; créala del mismo modo que el resto de historias de héroe y su progreso y recompensas se determinan de manera independiente. Puede escribir otra nueva cuando esta historia se complete.'),
('MAESTROARTESANO', 'Maestro Artesano', 3, 'Elige un tipo de objeto (armas, armaduras, pinturas, etcétera). Cuando creas un objeto de este tipo, puedes aumentar el tiempo de creación para hacer un objeto de mayor calidad. Si usas materiales típicos y normales, esto no tiene ningún efecto adicional, aparte del cosmético: se nota que el objeto es mejor que los objetos similares e incluso puede llevar tu marca, con lo que consigues notoriedad por un buen trabajo, obtienes un mayor precio si lo vendes, etcétera. Pero si usas materiales exóticos (como forjar una espada usando metal de una estrella caída, por ejemplo), puedes crear un Objeto distintivo para ti o para otro héroe. El tiempo necesario para crear un Objeto distintivo, y si un material es o no lo suficientemente «especial» para reunir las condiciones, siempre queda a discreción del DJ.'),
('MECENAS', 'Mecenas', 3, 'Tienes un mecenas, ya sea un individuo o una organización, que aprecia tu trabajo y te proporciona un trabajo fijo. Empiezas cada sesión con Riqueza 1. Puedes gastar 1 punto de héroe para pedirle un favor a tu mecenas. Este favor suele ser político o mercantil de algún modo: tu mecenas podría darte una carta de presentación, mover hilos para colarte en una fiesta exclusiva, etcétera. Tu mecenas te puede pedir favores o tener otras expectativas para ti, como que produzcas bienes o arte en su beneficio si eres un artista o que ayudes al populacho en su nombre si eres un caballero.'),
('MIEMBRODELAORDEN', 'Miembro de la Orden', 3, 'Puedes esperar refugio, un lugar donde quedarte y comida caliente en cualquier iglesia. También tienes acceso a muchas de las bibliotecas de la Iglesia, pero no a todas. Finalmente, también consigues 2 dados para cualquier Riesgo social contra personajes que sean adeptos de tu fe.'),
('NUMERARIO', 'Numerario', 3, 'Puedes esperar refugio, un lugar donde quedarte y comida caliente en cualquier universidad. También tienes acceso a muchas de las bibliotecas de la universidad simplemente con pedirlo. Finalmente, también consigues 2 dados para cualquier Riesgo social contra personajes que sean miembros de una institución de enseñanza superior o que respete tal nivel de educación.'),
('OBJETODISTINTIVO', 'Objeto Distintivo', 3, 'Elige un objeto específico que sea importante para ti. Descríbelo, decide por qué es importante y puedes incluso darle un nombre. Siempre puedes gastar 1 punto de héroe para: (Opción 1) Hacer que tu Objeto distintivo aparezca en la siguiente escena si lo has perdido o te lo han robado.(Opción 2) Conseguir 2 dados adicionales en un Riesgo cuando uses tu Objeto distintivo.(Opción 3) Si usas tu Objeto distintivo para atacar a un enemigo puedes infligirle tantas Heridas como Aumentos gastes más tu mayor característica.(Opción 4) Evitar tantas Heridas como Aumentos gastes, más tu mayor característica, cuando uses el Objeto distintivo. (Para todas las opciones) Siempre debes describir cómo te ayuda tu Objeto distintivo y tiene que tener sentido que el objeto te dé bonificaciones de este modo, a discreción del DJ.'),
('OPORTUNISTA', 'Oportunista', 3, 'Cuando otro héroe gaste un Aumento para crear una Oportunidad puedes gastar 1 punto de héroe para activarla inmediatamente para ti.'),
('PELEADEBAR', 'Pelea de Bar', 3, 'Ganas 1 dado adicional cuando realices un Riesgo con Pelear para luchar usando una mesa al revés, un taburete, un tablón de madera o cualquier otra arma improvisada.'),
('REFLEJOSRAPIDOS', 'Reflejos Rápidos', 3, 'Elige una habilidad. Siempre realizas las acciones como si tuvieras un Aumento adicional para gastar cuando uses esa habilidad. Por ejemplo, si un héroe tiene Reflejos Rápidos con Armas y saca 3 Aumentos, realiza su primera acción a los 4 Aumentos. Si gasta 1 Aumento para realizar una acción (y le quedan 2 Aumentos), su siguiente acción se realiza a los 3 Aumentos. Un héroe puede adquirir esta ventaja más de una vez; elige una habilidad diferente cada vez.'),
('RICO', 'Rico', 3, 'Empiezas cada sesión con Riqueza 3.'),
('UNINOCENTEMALENTENDIDO', 'Un Inocente Malentendido', 3, 'Gasta 1 punto de héroe para corregir, eliminar o cambiar algo que tú u otro héroe acabáis de decir y «reinterpretar» las palabras en un cumplido amable.'),
('VIRTUOSO', 'Virtuoso', 3, 'Elige un tipo de interpretación específica, como cantar, tocar un instrumento concreto o bailar. Consigues 1 dado adicional cuando realizas un Riesgo de Interpretar usando dicho arte.'),
('ACADEMIA', 'Academia', 4, 'Estudiaste estrategia, equitación y cómo ser un soldado en una de las muchas academias militares de Théah. Cuando realices un Riesgo usando Atletismo, Tácticas de Guerra o Equitación, todos tus dados consiguen un +1 a su valor.'),
('ALQUIMISTA', 'Alquimista', 4, 'Gasta 1 punto de héroe para fabricar un elixir o una poción que proporcione un efecto inmediato. Usar el brebaje alquímico requiere 1 Aumento durante una secuencia de acción o una secuencia dramática. Aquí tienes algunos ejemplos de usos de brebajes alquímicos, pero puede haber otros. Si quieres crear el tuyo propio, consúltalo con tu DJ. Explosión: El preparado provoca una explosión de humo asfixiante y fuego, lo que crea una Oportunidad que tú y otros podéis usar para huir de la escena. Mejora: Ganas 1 nivel en 1 característica durante 1 ronda. Aceite resbaladizo: Cualquier cosa que se cubra con este preparado se vuelve muy escurridiza y casi imposible de sostener. Si se vierte sobre el suelo, cualquiera que camine o corra sobre la superficie se resbalará y caerá. Si se vierte sobre un muro, cualquiera que intente escalarlo también se resbalará y caerá.'),
('CAMORRISTA', 'Camorrista', 4, 'Estás acostumbrado a que tus oponentes vengan en bandadas. Resta tu Brío a las Heridas recibidas cuando te enfrentes a una banda de matones; el resultado son las Heridas que recibes, hasta un mínimo de 1.'),
('CARACTERISTICALEGENDARIA', 'Característica Legendaria', 4, 'Elige una característica. Cuando hagas una tirada en un Riesgo usando esa característica, aparta un dado de tu reserva antes de tirar. Ese dado siempre se considera como un 10. Si tus 10 explotan, tu dado por la Característica legendaria también explota.'),
('COMPANERODECONFIANZA', 'Compañero de Confianza', 4, 'Tienes un pequeño grupo de individuos que te son fieles o un único aliado de confianza que caminaría sobre fuego por ti (un guardaespaldas, un caballo, etcétera). Si tus aliados te ayudan directamente en un Riesgo, consigues 1 dado adicional si describes específicamente cómo te ayudan. Si les envías a cumplir alguna misión y necesitan realizar un Riesgo (a discreción del DJ), tiran 5 dados. Estos compañeros pueden recibir 5 Heridas antes de quedar Indefensos y es más que probable que requieran tu ayuda para que los rescates.'),
('DURODEMATAR', 'Duro de Matar', 4, 'Ya no te quedas Indefenso cuando tienes 4 Heridas Dramáticas. En cambio, cuando eso suceda, cualquier villano que realice un Riesgo contra ti consigue 3 dados adicionales (en lugar de 2). Además, consigues una hilera adicional de Heridas. Cuando recibas tu quinta Herida Dramática, te quedas Indefenso.'),
('ESPECIALISTA', 'Especialista', 4, 'Cuando adquieras esta ventaja, elige una habilidad en la que tengas al menos nivel 3 para que se convierta en tu habilidad de especialista. Cuando realices un Riesgo usando cualquier otra habilidad durante una secuencia de acción o dramática, no tienes que pagar Aumentos adicionales para Improvisar con tu habilidad de especialista. Un héroe solo puede tener una única habilidad de especialista; adquirir esta ventaja de nuevo te permite elegir una nueva habilidad, pero pierdes la anterior.'),
('LICEO', 'Liceo', 4, 'Estudiaste retórica y debate y refinaste tus dotes sociales en uno de los muchos liceos de Théah o escuelas de señoritas normalmente reservados para la élite social y noble. Cuando realices un Riesgo usando Convencer, Intimidar o Tentar, todos tus dados suman un +1 a su valor.'),
('SEIDR', 'Seidr', 4, 'Has estudiado con un skald vestenio. Has aprendido cómo ver los Nombres de las cosas, cómo conocer el futuro según el baile de las llamas de una hoguera y cómo guiar las pasiones de la gente, ya sea para alabar a tus héroes o ridiculizar a tus enemigos. Gasta 1 punto de héroe y pronuncia un discurso sobre otro personaje, que gana 1 nivel de Reputación (como la ventaja del mismo nombre) de tu elección, aumenta una Reputación existente en 1 nivel o cambia su Reputación a otra diferente a tu elección (pero el nivel sigue siendo el mismo). Si cambias la Reputación existente de un personaje, cualquiera que use la nueva Reputación contra él consigue tantos dados adicionales como el nivel de esa Reputación. Gasta 1 punto de héroe para lanzar runas, dados o huesos. Cuando lo hagas, hazle al DJ una pregunta sencilla sobre el futuro. El DJ debe responder con honestidad, pero solo tiene que decir sí o no. Si el evento en cuestión puede cambiar debido a las acciones de otros, como si una persona morirá o no, entonces la respuesta dada representa el resultado que actualmente es más probable, pero por lo demás este poder nunca se equivoca. Gasta 1 punto de héroe cuando mires a otro humano mortal para saber el nombre de esa persona. Ningún disfraz puede esconder el nombre ante ti ni tampoco creerás ninguna mentira diseñada para ocultar el nombre. Siempre reconocerás a esa persona durante el resto de la escena, no importa lo que ella haga por cambiar.'),
('TOQUEMILAGROSO', 'Toque Milagroso', 4, 'Quizás fue por estudiar con la Iglesia o con un chamán local, pero conoces las heridas y sabes cómo curarlas. Gasta 1 punto de héroe y 1 Aumento durante tu acción para curar a otro héroe, que recuperará 1 Herida Dramática. Debes poder tocar al héroe que vayas a curar.'),
('UNIVERSIDAD', 'Universidad', 4, 'Fuiste a una de las universidades regladas de Théah y estás familiarizado con muchos campos académicos de estudio como las matemáticas, la arquitectura y la astronomía. Cuando realices un Riesgo usando Conocimiento, Empatía o Percepción, todos tus dados ganan un +1 a su valor.'),
('ACADEMIADEESGRIMA', 'Academia de Esgrima', 5, 'Puedes elegir un estilo de Esgrima. Si adquieres esta ventaja otra vez, consigues un estilo de Esgrima adicional.'),
('CHISPADEGENIALIDAD', 'Chispa de Genialidad', 5, 'Elige un campo específico de estudio académico (astronomía, matemáticas, arquitectura, historia, etcétera). Cuando hagas un Riesgo y recurras a tu campo de estudio especializado, gasta 1 punto de héroe para conseguir tantos Aumentos adicionales como tu Ingenio.'),
('LAFUERZADEDIEZ', 'La Fuerza de Diez', 5, 'Cuando lleves a cabo una proeza de fuerza bruta (levantar el rastrillo de un castillo, mantener una puerta cerrada contra un ariete que empuja al otro lado, etcétera), gasta 1 punto de héroe para aumentar, en ese Riesgo, todos los valores de tus dados tanto como tu Músculo o Brío, lo que sea mayor. Por ejemplo, si estás intentando evitar que una pared en ruinas colapse para que tus amigos puedan escapar, gasta 1 punto de héroe para sumarle tu Músculo al número de cada uno de tus dados.'),
('JOIEDEVIVRE', 'Joie de Vivre', 5, 'Justo antes de que tenga lugar una confrontación con un villano, gasta 1 punto de héroe y haz algún tipo de comentario breve o inteligente como: «El alma brilla más cuando las cosas parecen más oscuras». Todos los héroes que lo escuchen cuentan como 10 todos los dados que tiren en su siguiente tirada y tengan un valor igual o inferior a su habilidad.'),
('JUNTOSSOMOSFUERTES', 'Juntos Somos Fuertes', 5, 'Gasta 1 punto de héroe para darle cualquiera de tus Aumentos a otro héroe que se encuentre en la misma escena, siempre y cuando te pueda ver o escuchar. Puedes darle todos los Aumentos que desees.'),
('NOSOMOSTANDIFERENTES', 'No Somos Tan Diferentes...', 5, 'Gasta 1 punto de héroe para convencer a un villano de que estás de su lado, considerándote así un aliado de confianza. La ilusión se acaba en cuanto el villano te vea realizar una acción heroica o te niegues a realizar una acción de villanía. Solo puedes usar esta ventaja en cada villano una vez. «Si me engañas una vez…».'),
('NOVOYAMORIRAQUÍ', 'No Voy a Morir Aquí', 5, 'Gasta 1 punto de héroe para ignorar todos los efectos negativos de Heridas Dramáticas durante la ronda: el villano no consigue dados adicionales si tienes 2 Heridas Dramáticas y tú no te quedas Indefenso con 4 Heridas Dramáticas.'),
('LASUERTEDIABLO', 'La Suerte del Diablo', 5, 'Gasta 1 punto de héroe después de realizar un Riesgo para volver a tirar tantos dados como quieras. Debes quedarte con la nueva tirada, a menos que tengas otro efecto que te permita volver a tirar los dados. Solo puedes utilizar esta ventaja una vez por escena.'),
('TUTEVIENESCONMIGO', 'Tú te Viene Conmigo', 5, 'Gasta 1 punto de héroe para hacer que todo el daño que inflijas esta ronda aumente tanto como Heridas Dramáticas tengas.');       

INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('ARISTOCRATA', 'Aristócrata', 'Naciste en el seno de la nobleza de tu país natal y asistes con regularidad a las cortes.', 'Ganas 1 punto de héroe cuando demuestres que la nobleza es algo más que ropa cara y estar en la corte');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('ARISTOCRATA', 'RICO'),
       ('ARISTOCRATA', 'SONRISAENCANTADORA');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('ARISTOCRATA', 'APUNTAR'),
       ('ARISTOCRATA', 'CONOCIMIENTO'),
       ('ARISTOCRATA', 'CONVENCER'),
       ('ARISTOCRATA', 'EMPATIA'),
       ('ARISTOCRATA', 'EQUITACION');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('ARQUEOLOGO', 'Arqueólogo', 'Estudias las ruinas syrneth y exploras los lugares perdidos de Terra.', 'Ganas 1 punto de héroe cuando lleves un artefacto de valor a una universidad, un museo o un lugar donde se expondrá públicamente.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('ARQUEOLOGO', 'OBJETODISTINTIVO'),
       ('ARQUEOLOGO', 'VISTADELINCE');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('ARQUEOLOGO', 'ATLETISMO'),
       ('ARQUEOLOGO', 'CONOCIMIENTO'),
       ('ARQUEOLOGO', 'CONVENCER'),
       ('ARQUEOLOGO', 'PERCEPCION'),
       ('ARQUEOLOGO', 'ROBAR');       
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('ARTESANO', 'Artesano', 'Trabajas sin descanso para crear objetos útiles.', 'Ganas 1 punto de héroe cuando uses tus habilidades artesanas diarias para resolver un problema aparentemente demasiado complejo como para tener una solución tan simple');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('ARTESANO', 'MAESTROARTESANO'),
       ('ARTESANO', 'MANOSO');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('ARTESANO', 'ATLETISMO'),
       ('ARTESANO', 'CONOCIMIENTO'),
       ('ARTESANO', 'CONVENCER'),
       ('ARTESANO', 'INTERPRETAR'),
       ('ARTESANO', 'PERCEPCION');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('ARTISTA', 'Artista', 'Trabajas sin descanso para crear objetos de gran belleza.', 'Ganas 1 punto de héroe cuando te sacrifiques para hacer de Théah un lugar más hermoso.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('ARTISTA', 'FASCINAR'),
       ('ARTISTA', 'MECENAS');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('ARTISTA', 'CONVENCER'),
       ('ARTISTA', 'EMPATIA'),
       ('ARTISTA', 'EQUITACION'),
       ('ARTISTA', 'INTERPRETAR'),
       ('ARTISTA', 'TENTAR');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('ASESINO', 'Asesino', 'Acechas en la sombra como un espectro de la muerte silenciosa a cambio de una moneda ensangrentada, pero no más.', 'Ganas 1 punto de héroe cuando te desvíes del camino marcado para evitar así la muerte de un adversario o evitar hacer algo que podría resultar en la muerte de otra persona.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('ASESINO', 'ESGRIMISTA'),
       ('ASESINO', 'CHISTPORAQUI');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('ASESINO', 'ARMAS'),
       ('ASESINO', 'ATLETISMO'),
       ('ASESINO', 'EMPATIA'),
       ('ASESINO', 'ESCONDER'),
       ('ASESINO', 'INTIMIDAR');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('CABALLERO', 'Caballero', 'Eres un guerrero a caballo y formas parte de la estimada caballería de tu nación.', 'Ganas 1 punto de héroe cuando apliques tus habilidades montando a caballo en una situación poco común.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('CABALLERO', 'GORILA'),
       ('CABALLERO', 'VOLUNTADINDOMITA');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('CABALLERO', 'ARMAS'),
       ('CABALLERO', 'EQUITACION'),
       ('CABALLERO', 'INTIMIDAR'),
       ('CABALLERO', 'PERCEPCION'),
       ('CABALLERO', 'TACTICASDEGUERRA');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('CAPITAN_DE_BARCO', 'Capitán de Barco', 'Das órdenes a una tripulación y surcas los mares por cualquier bandera que hondees.', 'Ganas 1 punto de héroe cuando seas el último de tu tripulación en ponerse a salvo.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('CAPITAN_DE_BARCO', 'CASADOCONELMAR'),
       ('CAPITAN_DE_BARCO', 'LIDERAZGO'),
       ('CAPITAN_DE_BARCO', 'UNOCONELBARCO');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('CAPITAN_DE_BARCO', 'APUNTAR'),
       ('CAPITAN_DE_BARCO', 'CONVENCER'),
       ('CAPITAN_DE_BARCO', 'NAVEGACION'),
       ('CAPITAN_DE_BARCO', 'PERCEPCION'),
       ('CAPITAN_DE_BARCO', 'TACTICASDEGUERRA');

INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('GRANJERO', 'Granjero', 'Te criaste en una granja pequeña, trabajando para sobrevivir, y nunca has conocido la vida de aventura.', 'Ganas 1 punto de héroe cuando resuelvas un problema complejo de una forma sencilla que ya conoces de tu vida en la granja.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('GRANJERO', 'CARACTERISTICALEGENDARIA'),
       ('GRANJERO', 'SUPERVIVIENTE');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('GRANJERO', 'ATLETISMO'),
       ('GRANJERO', 'CONVENCER'),
       ('GRANJERO', 'EMPATIA'),
       ('GRANJERO', 'EQUITACION'),
       ('GRANJERO', 'INTERPRETAR');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('CRIMINAL', 'Criminal', 'Rompes las leyes injustas para conseguir lo que crees que es un bien mayor.', 'Ganas 1 punto de héroe cuando rompas la ley para perseguir una empresa noble.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('CRIMINAL', 'CALLEJERO'),
       ('CRIMINAL', 'CAMARADERIA');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('CRIMINAL', 'ATLETISMO'),
       ('CRIMINAL', 'EMPATIA'),
       ('CRIMINAL', 'ESCONDER'),
       ('CRIMINAL', 'INTIMIDAR'),
       ('CRIMINAL', 'ROBAR');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('ERUDITO', 'Erudito', 'Te dedicas a aprender y a documentar todas las maravillas de Terra.', 'Ganas 1 punto de héroe cuando te pongas en peligro por ir tras el conocimiento.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('ERUDITO', 'LINGUISTA'),
       ('ERUDITO', 'UNIVERSIDAD');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('ERUDITO', 'CONOCIMIENTO'),
       ('ERUDITO', 'CONVENCER'),
       ('ERUDITO', 'EMPATIA'),
       ('ERUDITO', 'INTERPRETAR'),
       ('ERUDITO', 'PERCEPCION');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('CAZADOR', 'Cazador', 'Duermes bajo las estrellas y cazas tu comida con tus propias manos.', 'Ganas 1 punto de héroe cuando uses tu perspicacia de cazador para salvar a alguien del peligro.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('CAZADOR', 'FRANCOTIRADOR'),
       ('CAZADOR', 'LOTENGO');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('CAZADOR', 'APUNTAR'),
       ('CAZADOR', 'EQUITACION'),
       ('CAZADOR', 'ESCONDER'),
       ('CAZADOR', 'INTIMIDAR'),
       ('CAZADOR', 'PERCEPCION');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('CORTESANO', 'Cortesano', 'Asistes con regularidad a las cortes de tu nación natal y actúas como diplomático en las cortes extranjeras.', 'Ganas 1 punto de héroe cuando consigas aplacar una situación violenta con tu encanto y talento.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('CORTESANO', 'AMIGOSENLACORTE'),
       ('CORTESANO', 'UNINOCENTEMALENTENDIDO');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('CORTESANO', 'ARMAS'),
       ('CORTESANO', 'EMPATIA'),
       ('CORTESANO', 'EQUITACION'),
       ('CORTESANO', 'INTERPRETAR'),
       ('CORTESANO', 'TENTAR');

INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('ESPADACHIN', 'Espadachín', 'Has dedicado tu vida a dominar la espada.', 'Ganas 1 punto de héroe cuando recurras al filo de tu espada para defender un ideal noble.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('ESPADACHIN', 'ACADEMIADEESGRIMA');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('ESPADACHIN', 'ARMAS'),
       ('ESPADACHIN', 'ATLETISMO'),
       ('ESPADACHIN', 'EMPATIA'),
       ('ESPADACHIN', 'INTIMIDAR'),
       ('ESPADACHIN', 'INTERPRETAR');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('ESPIA', 'Espía', 'Sirves a tu nación infiltrándote entre sus enemigos y consiguiendo sus secretos.', 'Ganas 1 punto de héroe cuando corras un gran riesgo para descubrir un secreto.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('ESPIA', 'INMUNIDADALVENENO'),
       ('ESPIA', 'OPORTUNISTA');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('ESPIA', 'EMPATIA'),
       ('ESPIA', 'ESCONDER'),
       ('ESPIA', 'PERCEPCION'),
       ('ESPIA', 'ROBAR'),
       ('ESPIA', 'TENTAR');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('EXPLORADOR', 'Explorador', 'Vives para ver los lugares más lejanos que Terra tiene para ofrecer.', 'Ganas 1 punto de héroe cuando pongas la mirada sobre un paisaje que pocos théanos, o ninguno, han visto antes.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('EXPLORADOR', 'ALLANAMIENTODEMORADA'),
       ('EXPLORADOR', 'REFLEJOSRAPIDOS');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('EXPLORADOR', 'ATLETISMO'),
       ('EXPLORADOR', 'CONVENCER'),
       ('EXPLORADOR', 'EMPATIA'),
       ('EXPLORADOR', 'EQUITACION'),
       ('EXPLORADOR', 'NAVEGACION');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('HUERFANO', 'Huérfano', 'Perdiste a tus padres a una edad temprana y te has visto obligado a cuidar de ti mismo.', 'Ganas 1 punto de héroe cuando te pongas en peligro para asegurarte de que otra persona no tenga que estar sola.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('HUERFANO', 'DERROTATEMERARIA'),
       ('HUERFANO', 'HURTO');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('HUERFANO', 'ATLETISMO'),
       ('HUERFANO', 'EMPATIA'),
       ('HUERFANO', 'ESCONDER'),
       ('HUERFANO', 'INTIMIDAR'),
       ('HUERFANO', 'PELEAR');
       
INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('INGENIERO', 'Ingeniero', 'Estás interesado en aplicar el conocimiento científico, las matemáticas y el ingenio para desarrollar soluciones a los problemas técnicos, sociales y comerciales.', 'Ganas 1 punto de héroe cuando utilices tu destreza tecnológica para resolver un problema.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('INGENIERO', 'MAESTROARTESANO'),
       ('INGENIERO', 'NOCIONDELTIEMPO'),
       ('INGENIERO', 'SENTIDODELAORIENTACION');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('INGENIERO', 'APUNTAR'),
       ('INGENIERO', 'TACTICASDEGUERRA'),
       ('INGENIERO', 'CONOCIMIENTO'),
       ('INGENIERO', 'CONVENCER'),
       ('INGENIERO', 'EQUITACION');

INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('INTENDENTE', 'Intendente', 'Sirves en un barco y te haces cargo de todas las cosas que ignoran los marineros.', 'Ganas 1 punto de héroe cuando resuelvas un problema para tu tripulación.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('INTENDENTE', 'LOTENGO'),
       ('INTENDENTE', 'MANOSO'),
       ('INTENDENTE', 'UNOCONELBARCO');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('INTENDENTE', 'APUNTAR'),
       ('INTENDENTE', 'ESCONDER'),
       ('INTENDENTE', 'NAVEGACION'),
       ('INTENDENTE', 'PELEAR'),
       ('INTENDENTE', 'TACTICASDEGUERRA');

INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('INTERPRETE', 'Intérprete', 'Trabajas sin descanso para crear una experiencia de belleza.', 'Ganas 1 punto de héroe cuando uses tus habilidades de complacer al público por algo más que conseguir unas cuantas monedas.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('INTERPRETE', 'INSPIRARGENEROSIDAD'),
       ('INTERPRETE', 'VIRTUOSO');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('INTERPRETE', 'ATLETISMO'),
       ('INTERPRETE', 'EMPATIA'),
       ('INTERPRETE', 'INTERPRETAR'),
       ('INTERPRETE', 'ROBAR'),
       ('INTERPRETE', 'TENTAR');

INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('JENNY', 'Jenny', 'Seduces a otros para divertirte y sacar beneficio.', 'Ganas 1 punto de héroe cuando resuelvas un conflicto con la seducción o con artimañas.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('JENNY', 'ENFOQUEDINAMICO'),
       ('JENNY', 'VENAQUI');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('JENNY', 'APUNTAR'),
       ('JENNY', 'ATLETISMO'),
       ('JENNY', 'EMPATIA'),
       ('JENNY', 'INTERPRETAR'),
       ('JENNY', 'TENTAR');

INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('MARINERO', 'Marinero', 'No sirves a ningún país ni dueño, pero el barco y tu tripulación son toda la familia que necesitas.', 'Ganas 1 punto de héroe cuando pongas a un lado tus deseos personales para asegurar la seguridad y la comodidad de tus aliados.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('MARINERO', 'PELEADEBAR'),
       ('MARINERO', 'VISTADELINCE');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('MARINERO', 'ARMAS'),
       ('MARINERO', 'NAVEGACION'),
       ('MARINERO', 'PELEAR'),
       ('MARINERO', 'PERCEPCION'),
       ('MARINERO', 'TENTAR');

INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('MEDICO', 'Médico', 'Trabajas para curar a los enfermos y asistir a los heridos.', 'Ganas 1 punto de héroe cuando cures las heridas de un villano o de inocentes heridos por un villano.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('MEDICO', 'NOCIONDELTIEMPO'),
       ('MEDICO', 'TOQUEMILAGROSO');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('MEDICO', 'CONOCIMIENTO'),
       ('MEDICO', 'CONVENCER'),
       ('MEDICO', 'EMPATIA'),
       ('MEDICO', 'EQUITACION'),
       ('MEDICO', 'PERCEPCION');

INSERT INTO Background (id, name, description, peculiarity) 
VALUES ('MERCADER', 'Mercader', 'Viajas por la campiña para vender tus mercancías en mercados o puertos.', 'Ganas 1 punto de héroe cuando vendas un objeto por mucho menos de lo que vale a alguien que lo necesita desesperadamente.');

INSERT INTO Background_Advantages (background_id, advantages_id) 
VALUES ('MERCADER', 'LICEO'),
       ('MERCADER', 'NOCIONDELTIEMPO');

INSERT INTO Background_Skills (background_id, skills_id) 
VALUES ('MERCADER', 'CONVENCER'),
       ('MERCADER', 'EMPATIA'),
       ('MERCADER', 'EQUITACION'),
       ('MERCADER', 'INTIMIDAR'),
       ('MERCADER', 'TENTAR');

INSERT INTO Background (id, name, description, peculiarity)
VALUES ('MERCENARIO', 'Mercenario', 'Vendes tus habilidades en batalla al mejor postor.', 'Ganas 1 punto de héroe cuando elijas llevar a cabo tu trabajo por una razón que para ti vale más que el dinero.');

INSERT INTO Background_Advantages (background_id, advantages_id)
VALUES ('MERCENARIO', 'DURODEMATAR'),
('MERCENARIO', 'ESTOMAGODEHIERRO');

INSERT INTO Background_Skills (background_id, skills_id)
VALUES ('MERCENARIO', 'ARMAS'),
('MERCENARIO', 'ATLETISMO'),
('MERCENARIO', 'INTIMIDAR'),
('MERCENARIO', 'PELEAR'),
('MERCENARIO', 'PERCEPCION');

INSERT INTO Background (id, name, description, peculiarity)
VALUES ('OFICIALMARINA', 'Oficial de la Marina', 'Te enrolaste en la marina y te abriste paso en la tripulación de un barco.', 'Ganas 1 punto de héroe cuando pongas las necesidades de la tripulación por encima de las de la misión.');

INSERT INTO Background_Advantages (background_id, advantages_id)
VALUES ('OFICIALMARINA', 'EQUILIBRIOPERFECTO'),
('OFICIALMARINA', 'REGATEAR'),
('OFICIALMARINA', 'UNOCONELBARCO');

INSERT INTO Background_Skills (background_id, skills_id)
VALUES ('OFICIALMARINA', 'ARMAS'),
('OFICIALMARINA', 'INTIMIDAR'),
('OFICIALMARINA', 'NAVEGACION'),
('OFICIALMARINA', 'PERCEPCION'),
('OFICIALMARINA', 'TACTICASDEGUERRA');

INSERT INTO Background (id, name, description, peculiarity)
VALUES ('OFICIALEJERCITO', 'Oficial del Ejército', 'Te enrolaste en el ejército y pronto te encontraste en una posición de mando.', 'Ganas 1 punto de héroe cuando tomes el mando durante un momento de intensa violencia o de extremo peligro.');

INSERT INTO Background_Advantages (background_id, advantages_id)
VALUES ('OFICIALEJERCITO', 'ACADEMIA'),
('OFICIALEJERCITO', 'SENTIDODELAORIENTACION');

INSERT INTO Background_Skills (background_id, skills_id)
VALUES ('OFICIALEJERCITO', 'APUNTAR'),
('OFICIALEJERCITO', 'ATLETISMO'),
('OFICIALEJERCITO', 'EQUITACION'),
('OFICIALEJERCITO', 'INTIMIDAR'),
('OFICIALEJERCITO', 'TACTICASDEGUERRA');

INSERT INTO Background (id, name, description, peculiarity)
VALUES ('PIRATA', 'Pirata', 'Surcas los mares tomando lo que necesitas y otorgando verdadera libertad a todos los que acepten la llamada.', 'Ganas 1 punto de héroe cuando hagas un sacrificio personal para asegurar la libertad de otro.');

INSERT INTO Background_Advantages (background_id, advantages_id)
VALUES ('PIRATA', 'DONDEPONGOELOJO'),
('PIRATA', 'VOLUNTADINDOMITA');

INSERT INTO Background_Skills (background_id, skills_id)
VALUES ('PIRATA', 'APUNTAR'),
('PIRATA', 'INTIMIDAR'),
('PIRATA', 'NAVEGACION'),
('PIRATA', 'PERCEPCION'),
('PIRATA', 'ROBAR');

INSERT INTO Background (id, name, description, peculiarity)
VALUES ('PROFESOR', 'Profesor', 'Enseñas a otros en una prestigiosa institución de enseñanza.', 'Ganas 1 punto de héroe cuando uses conocimientos sacados de un texto enrevesado para resolver un problema complejo.');

INSERT INTO Background_Advantages (background_id, advantages_id)
VALUES ('PROFESOR', 'NUMERARIO'),
('PROFESOR', 'TRABAJOENEQUIPO');

INSERT INTO Background_Skills (background_id, skills_id)
VALUES ('PROFESOR', 'CONOCIMIENTO'),
('PROFESOR', 'CONVENCER'),
('PROFESOR', 'EMPATIA'),
('PROFESOR', 'INTERPRETAR'),
('PROFESOR', 'TENTAR');

INSERT INTO Background (id, name, description, peculiarity)
VALUES ('PUGILISTA', 'Pugilista', 'Confías en tus manos y en tus pies para resolver todos los problemas violentos de tu vida.', 'Ganas 1 punto de héroe cuando tires lo que estés sujetando para luchar con los puños, independientemente del arma de tu oponente.');

INSERT INTO Background_Advantages (background_id, advantages_id)
VALUES ('PUGILISTA', 'BOXEADOR'),
('PUGILISTA', 'MIRARFIJAMENTE');

INSERT INTO Background_Skills (background_id, skills_id)
VALUES ('PUGILISTA', 'ATLETISMO'),
('PUGILISTA', 'CONVENCER'),
('PUGILISTA', 'EMPATIA'),
('PUGILISTA', 'INTERPRETAR'),
('PUGILISTA', 'PELEAR');

INSERT INTO Background (id, name, description, peculiarity)
VALUES ('SACERDOTE', 'Sacerdote', 'Sirves a una causa mayor con cada aliento que respiras.', 'Ganas 1 punto de héroe cuando dejes a un lado la retórica y pongas en práctica las virtudes que predicas.');

INSERT INTO Background_Advantages (background_id, advantages_id)
VALUES ('SACERDOTE', 'INSPIRARGENEROSIDAD'),
('SACERDOTE', 'MIEMBRODELAORDEN');

INSERT INTO Background_Skills (background_id, skills_id)
VALUES ('SACERDOTE', 'CONOCIMIENTO'),
('SACERDOTE', 'EMPATIA'),
('SACERDOTE', 'EQUITACION'),
('SACERDOTE', 'INTERPRETAR'),
('SACERDOTE', 'TENTAR');

INSERT INTO Background (id, name, description, peculiarity)
VALUES ('SIRVIENTE', 'Sirviente', 'Trabajas para otro haciendo lo que tu amo te dice que hagas.', 'Ganas 1 punto de héroe cuando te pongas en peligro para ayudar a otro personaje en una tarea difícil.');

INSERT INTO Background_Advantages (background_id, advantages_id)
VALUES ('SIRVIENTE', 'JACKMALTIEMPO'),
('SIRVIENTE', 'TRABAJOENEQUIPO');

INSERT INTO Background_Skills (background_id, skills_id)
VALUES ('SIRVIENTE', 'EQUITACION'),
('SIRVIENTE', 'ESCONDER'),
('SIRVIENTE', 'PERCEPCION'),
('SIRVIENTE', 'ROBAR'),
('SIRVIENTE', 'TENTAR');

INSERT INTO Background (id, name, description, peculiarity)
VALUES ('SOLDADO', 'Soldado', 'Sabes cómo luchar y cómo matar, y te has ganado la vida haciéndolo bajo estandartes y para otros señores.', 'Ganas 1 punto de héroe cuando te ciñas al plan independientemente del peligro que te suponga.');

INSERT INTO Background_Advantages (background_id, advantages_id)
VALUES ('SOLDADO', 'BUENBEBEDOR'),
('SOLDADO', 'CAMORRISTA');

INSERT INTO Background_Skills (background_id, skills_id)
VALUES ('SOLDADO', 'APUNTAR'),
('SOLDADO', 'ARMAS'),
('SOLDADO', 'INTIMIDAR'),
('SOLDADO', 'PERCEPCION'),
('SOLDADO', 'TACTICASDEGUERRA');  

 INSERT INTO name (name, nation_id)
VALUES ('Arthur Pendragon', 'AVALON'),
       ('Lancelot Morgan', 'AVALON'),
       ('Galahad MacLeod', 'AVALON'),
       ('Tristan O''Sullivan', 'AVALON'),
       ('Gawain Montgomery', 'AVALON'),
       ('Guinevere Avalon', 'AVALON'),
       ('Morgana Le Fay', 'AVALON'),
       ('Isolde Sinclair', 'AVALON'),
       ('Nimue Knightley', 'AVALON'),
       ('Elaine Whitestone', 'AVALON'),
       ('Diego Cortez', 'CASTILLA'),
       ('Javier Ramirez', 'CASTILLA'),
       ('Antonio Herrera', 'CASTILLA'),
       ('Gabriel Navarro', 'CASTILLA'),
       ('Santiago Silva', 'CASTILLA'),
       ('Isabella Castellano', 'CASTILLA'),
       ('Sofia Lopez', 'CASTILLA'),
       ('Carmen Gonzalez', 'CASTILLA'),
       ('Maria Fernandez', 'CASTILLA'),
       ('Ana Ruiz', 'CASTILLA'),
       ('Viktor Eisenhardt', 'EISEN'),
       ('Wilhelm von Hammerstein', 'EISEN'),
       ('Heinrich Schwartz', 'EISEN'),
       ('Gustav Richter', 'EISEN'),
       ('Klaus Wagner', 'EISEN'),
       ('Elsa von Eisen', 'EISEN'),
       ('Ingrid Schmidt', 'EISEN'),
       ('Frieda Becker', 'EISEN'),
       ('Helga Fischer', 'EISEN'),
       ('Greta Weber', 'EISEN'),
       ('Liam O''Connor', 'INISMORE'),
       ('Seamus Gallagher', 'INISMORE'),
       ('Declan Kelly', 'INISMORE'),
       ('Connor Brennan', 'INISMORE'),
       ('Aidan Flynn', 'INISMORE'),
       ('Aoife Sullivan', 'INISMORE'),
       ('Saoirse Murphy', 'INISMORE'),
       ('Siobhan Ryan', 'INISMORE'),
       ('Niamh Kennedy', 'INISMORE'),
       ('Ciara Doyle', 'INISMORE'),
       ('Alejandro Herrera', 'LASMARCASALTAS'),
       ('Carlos Rodriguez', 'LASMARCASALTAS'),
       ('Mateo Sanchez', 'LASMARCASALTAS'),
       ('Rafael Vega', 'LASMARCASALTAS'),
       ('Javier Moreno', 'LASMARCASALTAS'),
       ('Sofia Ramirez', 'LASMARCASALTAS'),
       ('Maria Morales', 'LASMARCASALTAS'),
       ('Ana Herrera', 'LASMARCASALTAS'),
       ('Laura Jimenez', 'LASMARCASALTAS'),
       ('Carolina Suarez', 'LASMARCASALTAS'), 
       ('Ignacio Alvarez', 'MANCOMUNIDADSARMATA'),
       ('Juan Torres', 'MANCOMUNIDADSARMATA'),
       ('Ricardo Morales', 'MANCOMUNIDADSARMATA'),
       ('Gabriel Fernandez', 'MANCOMUNIDADSARMATA'),
       ('Miguel Vargas', 'MANCOMUNIDADSARMATA'),
       ('Valentina Morales', 'MANCOMUNIDADSARMATA'),
       ('Camila Ruiz', 'MANCOMUNIDADSARMATA'),
       ('Isabella Hernandez', 'MANCOMUNIDADSARMATA'),
       ('Andrea Silva', 'MANCOMUNIDADSARMATA'),
       ('Natalia Castro', 'MANCOMUNIDADSARMATA'),
       ('Philippe Dubois', 'MONTAIGNE'),
       ('Francois LeBlanc', 'MONTAIGNE'),
       ('Louis Moreau', 'MONTAIGNE'),
       ('Antoine Mercier', 'MONTAIGNE'),
       ('Henri Rochefort', 'MONTAIGNE'),
       ('Genevieve LeBlanc', 'MONTAIGNE'),
       ('Madeleine Boucher', 'MONTAIGNE'),
       ('Sophie Laurent', 'MONTAIGNE'),
       ('Isabelle Rousseau', 'MONTAIGNE'),
       ('Catherine Lefevre', 'MONTAIGNE'),
       ('Dmitri Ivanov', 'USSURA'),
       ('Mikhail Petrov', 'USSURA'),
       ('Ivan Sokolov', 'USSURA'),
       ('Alexei Romanov', 'USSURA'),
       ('Viktor Orlov', 'USSURA'),
       ('Katerina Volkova', 'USSURA'),
       ('Natalya Ivanova', 'USSURA'),
       ('Irina Smirnova', 'USSURA'),
       ('Anna Sokolova', 'USSURA'),
       ('Yelena Romanova', 'USSURA'),
       ('Erik Svensson', 'VESTENMENNAVENJAR'),
       ('Lars Jansson', 'VESTENMENNAVENJAR'),
       ('Henrik Olsen', 'VESTENMENNAVENJAR'),
       ('Anders Lundqvist', 'VESTENMENNAVENJAR'),
       ('Bjorn Eriksson', 'VESTENMENNAVENJAR'),
       ('Ingrid Dahl', 'VESTENMENNAVENJAR'),
       ('Astrid Lindholm', 'VESTENMENNAVENJAR'),
       ('Elsa Bjornsdottir', 'VESTENMENNAVENJAR'),
       ('Freja Nilsson', 'VESTENMENNAVENJAR'),
       ('Karin Gustavsson', 'VESTENMENNAVENJAR'),
       ('Giovanni Rossi', 'VODACCE'),
       ('Marco Bianchi', 'VODACCE'),
       ('Roberto Conti', 'VODACCE'),
       ('Stefano Ricci', 'VODACCE'),
       ('Antonio Moretti', 'VODACCE'),
       ('Isabella Russo', 'VODACCE'),
       ('Sofia Ferrari', 'VODACCE'),
       ('Gabriella Romano', 'VODACCE'),
       ('Giulia Santoro', 'VODACCE'),
       ('Elena Lombardi', 'VODACCE');
       
INSERT INTO concept (name) VALUES
('Contrabandista de Información Codiciada'),
('Guardián/a de los Bosques Encantados'),
('Duelista Defensor/a de los Oprimidos'),
('Capitán/Capitana del Viento Implacable'),
('Embajador/a de mi Nación'),
('Cazador/a de Recompensas Implacable'),
('Médico/a Cirujano/a de Combate'),
('Cazador/a de seres fantásticos'),
('Espíritu Libre de los Mares Salvajes'),
('Explorador/a de Tierras Desconocidas'),
('Artista de la Espada Mortal'),
('Espía de Identidades Cambiantes'),
('Cazador/a de Criaturas Míticas'),
('Ladrón/a de Joyas Maestro/a'),
('Mercenario/a con Corazón de Oro'),
('Médico/a de Guerreros'),
('Sabio/a de las Antiguas Profecías'),
('Contrabandista de Reliquias Preciadas'),
('Inventor/a de Artefactos Extraordinarios'),
('Contrabandista con Pasado Oscuro'),
('Noble Exiliado/a Luchador/a'),
('Místico/a Guardián/a de Secretos'),
('Contratista de Asesinatos Reconvertido/a'),
('Capitán/Capitana de barco'),
('Diplomático/a Intrigante de Altos Vuelos'),
('Cazador/a de Tesoros Intrépido/a'),
('Cirujano/a con Manos de Oro'),
('Contratista Infiltrado/a'),
('Alquimista Solitario/a'),
('Comerciante en Declive'),
('Granjero/a'),
('Esgrimista Misterioso/a'),
('Caballero/a'),
('Juglar');    
       
        