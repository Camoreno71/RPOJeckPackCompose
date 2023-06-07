package com.example.plan_lector.utils

import androidx.annotation.DrawableRes
import com.example.plan_lector.R

data class Item(val id: Int, val name:String, val description:String,val whereAppear:String, @DrawableRes val photo:Int)

fun getGames(): List<Item> {
    return listOf(
        Item(
            id = 1,
            name = "Pac-Man",
            description = "Juego clásico de laberintos",
            photo = R.drawable.pacman_logo,
            whereAppear = "En los primeros niveles de la historia"
        ),
        Item(
            id = 2,
            name = "Galaga",
            description = "Juego de disparos espaciales",
            photo = R.drawable.galaga_logo,
            whereAppear = "En una competencia de arcade en el capítulo 5"
        ),
        Item(
            id = 3,
            name = "Adventure",
            description = "Un juego de aventuras para la Atari 2600",
            photo = R.drawable.adventure_logo,
            whereAppear = "En la casa del protagonista como parte de su colección de juegos"
        ),
        Item(
            id = 4,
            name = "Zork",
            description = "Una aventura de texto basada en exploración y resolución de rompecabezas",
            photo = R.drawable.zork_logo,
            whereAppear = "Como uno de los juegos favoritos del antagonista principal"
        ),
        Item(
            id = 5,
            name = "Joust",
            description = "Juego de lucha de aves montadas en avestruces",
            photo = R.drawable.joust_logo,
            whereAppear = "En una competencia de arcade en el capítulo 7"
        ),
        Item(
            id = 6,
            name = "Black Tiger",
            description = "Juego de acción y aventura de desplazamiento lateral",
            photo = R.drawable.black_tiger_logo,
            whereAppear = "En una tienda de videojuegos dentro del Oasis"
        ),
        Item(
            id = 7,
            name = "Tempest",
            description = "Juego de disparos de vectores en una estructura tubular",
            photo = R.drawable.tempest_logo,
            whereAppear = "En una sala de juegos retro en el capítulo 3"
        ),
        Item(
            id = 8,
            name = "Raiders of the Lost Ark",
            description = "Juego de aventuras basado en la película de Indiana Jones",
            photo = R.drawable.raiders_of_the_lost_ark_logo,
            whereAppear = "En una misión del Oasis ambientada en la película"
        ),
        Item(
            id = 9,
            name = "Robotron: 2084",
            description = "Juego de disparos de doble palanca con muchos enemigos",
            photo = R.drawable.robotron_2084_logo,
            whereAppear = "En un torneo de videojuegos en el capítulo 10"
        )
    )
}

fun getTechnologies(): List<Item> {
    return listOf(
        Item(
            id = 1,
            name = "Oasis",
            description = "Una realidad virtual masiva y multijugador utilizada como escapismo por los personajes principales. Es el escenario principal de la historia.",
            photo = R.drawable.oasis,
            whereAppear = "A lo largo de toda la historia"
        ),
        Item(
            id = 2,
            name = "Haptic Gloves",
            description = "Guantes hápticos que permiten a los usuarios sentir la textura y la sensación de los objetos en el Oasis.",
            photo = R.drawable.haptic_gloves,
            whereAppear = "Durante las escenas de interacción en el Oasis"
        ),
        Item(
            id = 3,
            name = "Oasis Visor",
            description = "Un visor de realidad virtual que se utiliza para acceder y explorar el Oasis. Es fundamental para sumergirse en el mundo virtual.",
            photo = R.drawable.oasis_visor,
            whereAppear = "Cuando los personajes se sumergen en el Oasis"
        ),
        Item(
            id = 4,
            name = "Hoverboard",
            description = "Un dispositivo de transporte similar a una patineta flotante que se utiliza en el Oasis y en el mundo real.",
            photo = R.drawable.hoverboard,
            whereAppear = "En escenas de acción y desplazamiento en el Oasis y el mundo real"
        ),
        Item(
            id = 5,
            name = "Aech's Basement",
            description = "Una sala virtual secreta en el Oasis que contiene una colección de objetos y referencias a la cultura pop de los años 80.",
            photo = R.drawable.aechs_basement,
            whereAppear = "Durante las exploraciones de los personajes en el Oasis"
        ),
        Item(
            id = 6,
            name = "DeLorean Time Machine",
            description = "Un icónico automóvil retro modificado con funciones especiales, como viajar en el tiempo. Se utiliza en una de las misiones del Oasis.",
            photo = R.drawable.delorean_time_machine,
            whereAppear = "En una de las misiones del Oasis"
        ),
        Item(
            id = 7,
            name = "Omnidirectional Treadmill",
            description = "Una cinta de correr especial que permite a los usuarios caminar y correr en cualquier dirección en el Oasis. Proporciona una experiencia más inmersiva.",
            photo = R.drawable.omnidirectional_treadmill,
            whereAppear = "Durante las escenas de movimiento y exploración en el Oasis"
        ),
        Item(
            id = 8,
            name = "The Orb of Osuvox",
            description = "Un artefacto mágico en el Oasis con poderes misteriosos. Es buscado por los personajes en una de las pruebas del concurso.",
            photo = R.drawable.orb_of_osuvox,
            whereAppear = "En una de las pruebas del concurso dentro del Oasis"
        ),
    )
}

fun getMovies(): List<Item> {
    return listOf(
        Item(
            id = 1,
            name = "Blade Runner",
            description = "Un clásico de ciencia ficción ambientado en un futuro distópico donde los humanos y los replicantes coexisten.",
            photo = R.drawable.blade_runner,
            whereAppear = "En una conversación entre los personajes principales sobre películas de culto."
        ),
        Item(
            id = 2,
            name = "Star Wars: A New Hope",
            description = "La primera película de la saga Star Wars, donde se presenta a Luke Skywalker y su lucha contra el Imperio Galáctico.",
            photo = R.drawable.star_wars,
            whereAppear = "En una escena en la que los personajes visitan un cine y se proyecta la película."
        ),
        Item(
            id = 3,
            name = "The Lord of the Rings: The Fellowship of the Ring",
            description = "La primera película de la trilogía de El Señor de los Anillos, basada en la obra de J.R.R. Tolkien, que sigue la aventura del Anillo Único.",
            photo = R.drawable.lotr_fellowship,
            whereAppear = "En una discusión sobre libros y películas de fantasía entre los protagonistas."
        ),
        Item(
            id = 4,
            name = "The Matrix",
            description = "Una película de ciencia ficción que presenta un mundo virtual simulado y la lucha por la libertad de la humanidad.",
            photo = R.drawable.the_matrix,
            whereAppear = "En una conversación sobre realidades virtuales y simulaciones."
        ),
        Item(
            id = 5,
            name = "Back to the Future",
            description = "Una comedia de aventuras en la que un adolescente viaja en el tiempo en un DeLorean modificado.",
            photo = R.drawable.back_to_the_future,
            whereAppear = "En una escena en la que los personajes debaten sobre viajes en el tiempo."
        ),
        Item(
            id = 6,
            name = "Indiana Jones and the Raiders of the Lost Ark",
            description = "La primera película de la saga de Indiana Jones, donde el arqueólogo se embarca en una búsqueda épica de un artefacto sagrado.",
            photo = R.drawable.raiders_of_the_lost_ark,
            whereAppear = "En una misión del Oasis basada en la película."
        ),
        Item(
            id = 7,
            name = "E.T. the Extra-Terrestrial",
            description = "Una película de ciencia ficción y aventuras sobre un niño que hace amistad con un extraterrestre.",
            photo = R.drawable.et_the_extra_terrestrial,
            whereAppear = "En una escena en la que los personajes discuten sobre películas icónicas de los años 80."
        ),
        Item(
            id = 8,
            name = "The Shining",
            description = "Una película de terror psicológico basada en la novela de Stephen King, que sigue a un hombre y su familia en un hotel aislado.",
            photo = R.drawable.the_shining,
            whereAppear = "En una conversación sobre películas de terror y suspenso."
        ),
        Item(
            id = 9,
            name = "The Goonies",
            description = "Una película de aventuras que sigue a un grupo de niños en una búsqueda del tesoro para salvar su vecindario.",
            photo = R.drawable.the_goonies,
            whereAppear = "En una escena en la que los personajes visitan una sala secreta inspirada en la película."
        )
    )
}

fun getPlaces(): List<Item> {
    return listOf(
        Item(
            id = 1,
            name = "Oasis",
            description = "Un vasto mundo virtual y multijugador que se convierte en el escenario principal de la historia. Es un lugar donde los personajes pueden vivir, interactuar y competir.",
            photo = R.drawable.oasis,
            whereAppear = "En casi todas las partes del libro, ya que el Oasis es fundamental en la trama y la vida de los personajes."
        ),
        Item(
            id = 2,
            name = "Aech's Basement",
            description = "Una sala virtual secreta dentro del Oasis que sirve como escondite y lugar de reunión para los personajes. Está lleno de objetos y referencias a la cultura pop de los años 80.",
            photo = R.drawable.aechs_basement,
            whereAppear = "En varias partes del libro, especialmente cuando los personajes se encuentran en Aech's Basement para planificar estrategias o relajarse."
        ),
        Item(
            id = 3,
            name = "The Distracted Globe",
            description = "Un famoso club nocturno virtual dentro del Oasis. Es conocido por su ambiente animado, su música y sus extravagantes eventos temáticos.",
            photo = R.drawable.the_distracted_globe,
            whereAppear = "En una parte del libro donde los personajes asisten a una fiesta en The Distracted Globe para buscar pistas y socializar."
        ),
        Item(
            id = 4,
            name = "Middletown",
            description = "Una ciudad virtual dentro del Oasis que representa un entorno suburbano típico. Es el lugar de origen de uno de los personajes principales.",
            photo = R.drawable.middletown,
            whereAppear = "En varias partes del libro, ya que Middletown es el hogar de uno de los personajes y se exploran sus experiencias allí."
        ),
        Item(
            id = 5,
            name = "GSS Headquarters",
            description = "La sede de la compañía Global Social Services (GSS), una poderosa corporación dentro del Oasis. Es un lugar importante en la trama del libro.",
            photo = R.drawable.gss_headquarters,
            whereAppear = "En varias partes del libro, especialmente cuando los personajes se enfrentan a desafíos dentro de las instalaciones de GSS Headquarters."
        ),
        Item(
            id = 6,
            name = "The Oology Department",
            description = "Un departamento virtual dentro del Oasis dedicado al estudio y la recolección de huevos de aves extintas. Es un lugar intrigante y misterioso en la historia.",
            photo = R.drawable.the_oology_department,
            whereAppear = "En una parte del libro donde los personajes visitan The Oology Department para buscar información y pistas relacionadas con una búsqueda."
        ),
        Item(
            id = 7,
            name = "Frobozz Magic Cave",
            description = "Una cueva virtual dentro del Oasis que contiene desafíos y enigmas basados en el juego de aventuras clásico 'Zork'. Es un lugar icónico para los amantes de los rompecabezas.",
            photo = R.drawable.frobozz_magic_cave,
            whereAppear = "En una parte del libro donde los personajes exploran la Frobozz Magic Cave en busca de pistas y tesoros ocultos."
        ),
        Item(
            id = 8,
            name = "Castle Anorak",
            description = "Un castillo virtual dentro del Oasis que sirve como guarida del creador del Oasis y alberga la prueba final del concurso. Es un lugar crucial en la trama.",
            photo = R.drawable.castle_anorak,
            whereAppear = "En la parte final del libro, donde los personajes se enfrentan a desafíos y revelaciones en Castle Anorak para obtener el control del Oasis."
        ),
        Item(
            id = 9,
            name = "Flicksync Arena",
            description = "Un lugar virtual en el Oasis donde los personajes participan en competencias y batallas basadas en películas icónicas. Es un punto clave de interacción y competencia.",
            photo = R.drawable.flicksync_arena,
            whereAppear = "En varias partes del libro, especialmente durante las competencias y batallas que tienen lugar en la Flicksync Arena."
        )
    )
}

fun getMusic(): List<Item> {
    return listOf(
        Item(
            id = 1,
            name = "Don't Stop Believin'",
            description = "Una canción emblemática de la banda de rock Journey.",
            photo = R.drawable.dont_stop_believin,
            whereAppear = "En una escena en la que los personajes cantan la canción juntos durante una misión."
        ),
        Item(
            id = 2,
            name = "Thriller",
            description = "Un éxito de Michael Jackson que se ha convertido en un himno del género del pop y del Halloween.",
            photo = R.drawable.thriller,
            whereAppear = "En una escena en la que los personajes bailan la coreografía de la canción."
        ),
        Item(
            id = 3,
            name = "Bohemian Rhapsody",
            description = "Una icónica canción de la banda Queen, conocida por su mezcla de estilos y letras emotivas.",
            photo = R.drawable.bohemian_rhapsody,
            whereAppear = "En una conversación sobre canciones clásicas y su impacto cultural."
        ),
        Item(
            id = 4,
            name = "Sweet Child o' Mine",
            description = "Una canción popular de la banda de rock Guns N' Roses, conocida por su distintivo solo de guitarra.",
            photo = R.drawable.sweet_child_o_mine,
            whereAppear = "En una escena en la que los personajes escuchan la canción mientras realizan una tarea en el Oasis."
        ),
        Item(
            id = 5,
            name = "Take On Me",
            description = "Un éxito de la banda de pop noruega a-ha, reconocido por su pegajoso estribillo y su distintivo video musical animado.",
            photo = R.drawable.take_on_me,
            whereAppear = "En una escena en la que los personajes cantan la canción en un karaoke virtual del Oasis."
        ),
        Item(
            id = 6,
            name = "We Will Rock You",
            description = "Un himno de estadio de la banda Queen, conocido por su ritmo de palmadas y sus coros enérgicos.",
            photo = R.drawable.we_will_rock_you,
            whereAppear = "En una escena en la que los personajes asisten a un concierto virtual en el Oasis y la canción es interpretada por un avatar de Queen."
        ),
        Item(
            id = 7,
            name = "Like a Prayer",
            description = "Una canción icónica de Madonna que combina elementos de música pop y gospel.",
            photo = R.drawable.like_a_prayer,
            whereAppear = "En una conversación sobre la influencia de Madonna en la música pop."
        ),
        Item(
            id = 8,
            name = "Back in Black",
            description = "Una canción emblemática de la banda de rock AC/DC, reconocida por su riff de guitarra distintivo.",
            photo = R.drawable.back_in_black,
            whereAppear = "En una escena en la que los personajes escuchan la canción mientras exploran el Oasis."
        ),
        Item(
            id = 9,
            name = "Eye of the Tiger",
            description = "Una canción de la banda Survivor, conocida por ser el tema principal de la película 'Rocky III'.",
            photo = R.drawable.eye_of_the_tiger,
            whereAppear = "En una escena en la que los personajes se preparan para una competencia importante en el Oasis."
        )
    )
}

