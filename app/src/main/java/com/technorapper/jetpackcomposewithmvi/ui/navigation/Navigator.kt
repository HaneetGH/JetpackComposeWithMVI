package com.technorapper.jetpackcomposewithmvi.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.technorapper.jetpackcomposewithmvi.ui.detail.DetailActivity

@Composable
fun Navigator() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.MainScreen.route) {
        composable(route = Screens.MainScreen.route)
        {

        }
        composable(route = Screens.MainScreen.route+"/{name}",
        arguments = listOf(
            navArgument("name")
            {
                type= NavType.StringType
                defaultValue="haneet"
                nullable=true

            }
        )){ entry->

            DetailActivity(navController = entry.arguments?.getString("name").toString())
        }
    }
}