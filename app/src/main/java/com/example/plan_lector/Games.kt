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
fun gameIndex(navigationController: NavHostController){
    val gameList = listOf(
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

    itemIndex(navigationController,gameList)
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GamePreview() {
    Plan_lectorTheme {
        gameIndex(rememberNavController())
    }
}