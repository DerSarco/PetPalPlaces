package com.dersarco.petpalplaces.ui.screens.home.state

import com.dersarco.petpalplaces.core.routes.AppRoutes

data class HomeState(
    val currentRoute: String = AppRoutes.Feed().route
)