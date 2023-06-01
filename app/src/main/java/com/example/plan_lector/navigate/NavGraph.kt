package com.example.plan_lector.navigate

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.plan_lector.Greeting
import com.example.plan_lector.Index
import com.example.plan_lector.gameIndex
import com.example.plan_lector.movieIndex
import com.example.plan_lector.musicIndex
import com.example.plan_lector.placesIndex
import com.example.plan_lector.technologyIndex

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation(navigationController: NavHostController) {
    NavHost(navController = navigationController, startDestination = Route.Index.route) {
        composable(Route.Index.route) {
            Index(
                name = "sigmotoa",
                navigationController = navigationController
            )
        }
        composable(Route.Screen2.route) {
            technologyIndex(navigationController)
        }
        composable(Route.Screen3.route) {
            gameIndex(navigationController)
        }
        composable(Route.Screen4.route) {
            movieIndex(navigationController)
        }
        composable(Route.Screen5.route) {
            musicIndex(navigationController)
        }
        composable(Route.Screen6.route) {
            placesIndex(navigationController)
        }
        /*
        composable(
            Route.Detail.route,
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { navBackStackEntry -> navBackStackEntry.arguments?.let { HorseDetail(
            navigationController, it.getInt("id")
        ) } }
         */
    }
}
