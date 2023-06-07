package com.example.plan_lector.screens

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.plan_lector.utils.getMovies
import com.example.plan_lector.utils.itemIndex
import com.example.plan_lector.ui.theme.Plan_lectorTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun movieIndex(navigationController: NavHostController){
    val movieList = getMovies()

    itemIndex(navigationController,movieList, listName = "Peliculas", isOdd = true)
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