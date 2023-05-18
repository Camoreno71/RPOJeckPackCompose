package com.example.plan_lector.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.plan_lector.Greeting
import com.example.plan_lector.Index

@Composable
fun AppNavigation(navigationController: NavHostController) {
    NavHost(navController = navigationController, startDestination = Route.Index.route) {
        composable(Route.Index.route) {
            Index(
                name = "sigmotoa",
                navigationController = navigationController
            )
        }
        /*
        composable(Route.Screen2.route) {
            SRecycler1(navigationController)
        }
        composable(Route.Screen3.route) {
            SRecycler2(navigationController)
        }
        composable(Route.Screen4.route) {
            SRecyclerHorses(navigationController)
        }
        composable(
            Route.Detail.route,
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { navBackStackEntry -> navBackStackEntry.arguments?.let { HorseDetail(
            navigationController, it.getInt("id")
        ) } }
         */
    }
}
