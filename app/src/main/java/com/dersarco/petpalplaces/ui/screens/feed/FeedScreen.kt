package com.dersarco.petpalplaces.ui.screens.feed

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.feed.components.FeedBackGround
import com.dersarco.petpalplaces.ui.screens.profile.components.ProfilePostItem
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeedScreen() {

    Scaffold(
        Modifier.fillMaxSize()
    ) { paddingValues ->
        // TODO: Obviously this parameters should receive the original information.
        val scrollState = rememberScrollState()
        FeedBackGround(padding = paddingValues) {
            LazyVerticalGrid(
                modifier = Modifier
                    .scrollable(scrollState, Orientation.Vertical)
                    .background(Color.White),
                columns = GridCells.Fixed(3),
                userScrollEnabled = true
            ) {
                items((1..3).toList()) {
                    ProfilePostItem(image = R.drawable.portrait_example)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun FeedScreenPrev() {
    PetPalPlacesTheme {
        Scaffold { scaffoldPadding ->
            FeedBackGround(padding = scaffoldPadding) {
            }
        }
    }
}