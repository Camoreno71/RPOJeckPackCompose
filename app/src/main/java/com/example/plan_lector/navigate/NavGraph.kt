package com.example.plan_lector.navigate

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.plan_lector.screens.Index
import com.example.plan_lector.screens.NarutoCharacterGrid
import com.example.plan_lector.screens.aboutMeIndex
import com.example.plan_lector.screens.gameIndex
import com.example.plan_lector.utils.itemDetail
import com.example.plan_lector.screens.movieIndex
import com.example.plan_lector.screens.musicIndex
import com.example.plan_lector.screens.placesIndex
import com.example.plan_lector.screens.technologyIndex

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation(navigationController: NavHostController) {
    NavHost(navController = navigationController, startDestination = Route.Index.route) {
        composable(Route.Index.route) {
            Index(
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
        composable(Route.Screen7.route) {
            aboutMeIndex(navigationController)
        }
        composable(Route.Screen9.route) {
            NarutoCharacterGrid(navigationController)
        }
        composable(
            Route.Detail.route,
            arguments = listOf(
                navArgument("id") { type = NavType.IntType },
                navArgument("list") { type = NavType.StringType })
        ) { navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getInt("id") ?: 0
            val list = navBackStackEntry.arguments?.getString("list") ?: ""

            itemDetail(id, list, navigationController) }

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
