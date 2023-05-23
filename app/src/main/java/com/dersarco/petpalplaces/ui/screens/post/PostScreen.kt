package com.dersarco.petpalplaces.ui.screens.post

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.dersarco.petpalplaces.ui.screens.post.components.ListPlaces
import com.dersarco.petpalplaces.ui.screens.post.components.PostTopBar
import com.dersarco.petpalplaces.ui.screens.post.events.PostEvents
import com.dersarco.petpalplaces.ui.screens.post.state.PostState
import com.dersarco.petpalplaces.ui.screens.post.viewModel.PostScreenViewModel
import com.dersarco.petpalplaces.ui.theme.ItemPostColors
import com.dersarco.petpalplaces.ui.theme.OutlineIconButtonColors
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.SpecialBlack
import com.dersarco.petpalplaces.ui.theme.SpecialGray
import com.dersarco.petpalplaces.ui.theme.SpecialWhite


@Composable
fun PostScreen(
    viewModel: PostScreenViewModel = viewModel(),
) {

    PostScreenContent(
        state = viewModel.state,
        onEvent = viewModel::dispatcherEvent,
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PostScreenContent(
    state: PostState,
    onEvent: (PostEvents) -> Unit,
) {

    val colors = ItemPostColors(
        background = SpecialGray.copy(alpha = 0.1f),
        border = SpecialGray.copy(alpha = 0.6f),
        title = SpecialBlack,
        buttonColors = OutlineIconButtonColors(
            icon = SpecialBlack,
            background = SpecialWhite,
            border = SpecialGray
        )
    )

    Scaffold(
        topBar = {
            PostTopBar(
                backgroundColor = SpecialWhite,
                textColor = SpecialBlack,
                showShadow = state.showShadowBar,
            )
        },
        ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(SpecialWhite)
        ) {
            ListPlaces(
                itemColors = colors,
                isFirstItemVisible = {
                    onEvent(PostEvents.OnShowShadowBar(!it))
                },
            )
        }
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.NEXUS_5,
)
fun PostScreenPreview() {
    PetPalPlacesTheme {
        PostScreenContent(
            state = PostState(),
            onEvent = {},
        )
    }
}