package com.example.mycityapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mycityapp.data.repository.Category

@Composable
fun CityGuideApp() {
    val navController = rememberNavController()
    val categories = listOf(
        Category.Restaurants,
        Category.Cafes,
        Category.Malls,
    )
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController, categories) }
        composable("category/{name}") { backStackEntry ->
            CategoryScreen(
                navController,
                categories.find {
                    it.name == (backStackEntry.arguments?.getString("name") ?: "")
                } ?: categories.first())
        }
        composable("place/{category}/{place}") { backStackEntry ->
            PlaceDetailScreen(
                navController,
                categories.flatMap { it.places }
                    .find { it.name == (backStackEntry.arguments?.getString("place") ?: "") }
            )
        }
    }
}