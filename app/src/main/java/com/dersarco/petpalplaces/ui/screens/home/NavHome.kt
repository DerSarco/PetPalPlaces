package com.dersarco.petpalplaces.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dersarco.petpalplaces.core.routes.AppRoutes
import com.dersarco.petpalplaces.ui.screens.favorites.FavoritesScreen
import com.dersarco.petpalplaces.ui.screens.feed.FeedScreen
import com.dersarco.petpalplaces.ui.screens.post.PostScreen
import com.dersarco.petpalplaces.ui.screens.profile.ProfileScreen

@Composable
fun NavHome(
    currentRoute: String = AppRoutes.Favorites().route
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = currentRoute
    ) {
        composable(AppRoutes.Feed().route) {
            FeedScreen()
        }
        composable(AppRoutes.Favorites().route) {
            FavoritesScreen()
        }
        composable(AppRoutes.Post().route) {
            PostScreen()
        }
        composable(AppRoutes.Profile().route) {
            ProfileScreen()
        }
    }
}

@Preview
@Composable
fun NavHomePreview() {
    NavHome()
}