package com.dersarco.petpalplaces.ui.screens.post.viewModel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.dersarco.petpalplaces.ui.screens.post.events.PostEvents
import com.dersarco.petpalplaces.ui.screens.post.state.PostState

class PostScreenViewModel(

) : ViewModel() {

    var state by mutableStateOf(PostState())
    private set

    fun dispatcherEvent(event: PostEvents) {
        when (event) {
            is PostEvents.OnShowShadowBar -> {
                state = state.copy(
                    showShadowBar = event.showShadowBar,
                )
            }
        }
    }
}