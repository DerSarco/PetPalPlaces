package com.dersarco.petpalplaces.core.routes

sealed class AppRoutes {
    data class Feed(val route: String = "feed") : AppRoutes()
    data class Post(val route: String = "post") : AppRoutes()
    data class Profile(val route: String = "profile") : AppRoutes()
    data class Favorites(val route: String = "favorites") : AppRoutes()
}