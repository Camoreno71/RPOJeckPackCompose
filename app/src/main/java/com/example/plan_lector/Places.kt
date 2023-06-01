package com.example.plan_lector

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.plan_lector.ui.theme.Plan_lectorTheme


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun placesIndex(navigationController: NavHostController){
    val placeList = listOf(
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

    itemIndex(navigationController,placeList)
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun placePreview() {
    Plan_lectorTheme {
        placesIndex(rememberNavController())
    }
}

