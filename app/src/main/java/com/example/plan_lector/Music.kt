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
fun musicIndex(navigationController: NavHostController){
    val songList = listOf(
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

    itemIndex(navigationController,songList)
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MusicPreview() {
    Plan_lectorTheme {
        movieIndex(rememberNavController())
    }
}
