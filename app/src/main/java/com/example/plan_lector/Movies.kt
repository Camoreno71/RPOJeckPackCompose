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
fun movieIndex(navigationController: NavHostController){
    val movieList = listOf(
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

    itemIndex(navigationController,movieList)
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MoviePreview() {
    Plan_lectorTheme {
        movieIndex(rememberNavController())
    }
}