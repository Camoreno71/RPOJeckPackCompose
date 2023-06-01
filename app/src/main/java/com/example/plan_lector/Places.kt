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
    val placeList = getPlaces()

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

