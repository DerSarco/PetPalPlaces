package com.dersarco.petpalplaces.ui.screens.home.events

import com.dersarco.petpalplaces.core.routes.AppRoutes

sealed class HomeEvent {
    data class NavigateTo(val route: String = AppRoutes.Feed().route) : HomeEvent()
}