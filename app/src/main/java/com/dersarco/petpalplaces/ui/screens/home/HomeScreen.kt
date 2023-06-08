package com.dersarco.petpalplaces.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dersarco.petpalplaces.core.routes.AppRoutes
import com.dersarco.petpalplaces.ui.screens.home.components.BottomBarPlus
import com.dersarco.petpalplaces.ui.screens.home.events.HomeEvent
import com.dersarco.petpalplaces.ui.screens.home.state.HomeState
import com.dersarco.petpalplaces.ui.screens.home.viewModel.HomeViewModel
import mx.erix.specialbottombarnav.data.SpecialBottom
import androidx.lifecycle.viewmodel.compose.viewModel
import com.dersarco.petpalplaces.ui.screens.post.PostScreen
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.ThemeColor

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel()
) {
    HomeScreenContent(
        state = viewModel.state,
        onEvent = viewModel::onEvent
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenContent(
    state: HomeState,
    onEvent: (HomeEvent) -> Unit = {}
) {
    val themeId =
        if (
            state.currentRoute == AppRoutes.Post().route ||
            state.currentRoute == AppRoutes.Favorites().route
        ) ThemeColor.THEME_DARK else ThemeColor.THEME_LIGHT

    PetPalPlacesTheme(
        id = themeId
    ) {
        Scaffold(
            bottomBar = {
                BottomBarPlus(
                    currentSelected = SpecialBottom.Id(state.currentRoute),
                    onItemSelected = {
                        onEvent(HomeEvent.NavigateTo(it.key))
                    }
                )
            }
        ) { paddingValues ->

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        top = paddingValues.calculateTopPadding(),
                        bottom = 48.dp
                    ),

                contentAlignment = Alignment.Center
            ) {

                NavHome(currentRoute = state.currentRoute)
            }
        }
    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreenContent(
        state = HomeState(),
    )
}