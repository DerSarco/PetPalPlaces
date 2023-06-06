package com.dersarco.petpalplaces.ui.screens.home.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.dersarco.petpalplaces.ui.screens.home.events.HomeEvent
import com.dersarco.petpalplaces.ui.screens.home.state.HomeState


class HomeViewModel(
) : ViewModel() {

    var state by mutableStateOf(HomeState())
        private set

    fun onEvent(event: HomeEvent) {
        when (event) {
            is HomeEvent.NavigateTo -> {
                state = state.copy(
                    currentRoute = event.route
                )
            }
        }
    }
}