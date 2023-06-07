package com.example.plan_lector.screens

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.plan_lector.utils.getGames
import com.example.plan_lector.utils.itemIndex
import com.example.plan_lector.ui.theme.Plan_lectorTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun gameIndex(navigationController: NavHostController){
    val gameList = getGames()

    itemIndex(navigationController,gameList, listName = "Juegos")
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