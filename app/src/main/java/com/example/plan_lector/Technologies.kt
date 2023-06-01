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
fun technologyIndex(navigationController: NavHostController){val technologyList = listOf(
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

    itemIndex(navigationController,technologyList)
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun technologyPreview() {
    Plan_lectorTheme {
        technologyIndex(rememberNavController())
    }
}