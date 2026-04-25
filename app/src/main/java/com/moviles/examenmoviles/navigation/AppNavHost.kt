package com.moviles.examenmoviles.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.moviles.examenmoviles.ui.theme.screens.SpaceDetailScreen
import com.moviles.examenmoviles.ui.theme.screens.SpaceListScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppDestinations.LIST) {
        composable(AppDestinations.LIST) {
            SpaceListScreen(onSpaceClick = { id ->
                navController.navigate(AppDestinations.createDetailRoute(id))
            })
        }
        composable(AppDestinations.DETAIL) { backStackEntry ->
            val id = backStackEntry.arguments?.getString("spaceId")?.toInt() ?: 0
            SpaceDetailScreen(spaceId = id, onBack = { navController.popBackStack() })
        }
    }
}