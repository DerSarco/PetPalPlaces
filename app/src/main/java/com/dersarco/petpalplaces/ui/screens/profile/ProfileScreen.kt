package com.dersarco.petpalplaces.ui.screens.profile

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
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.profile.components.ProfileBackground
import com.dersarco.petpalplaces.ui.screens.profile.components.ProfilePostItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Scaffold(
        Modifier.fillMaxSize()
    ) { paddingValues ->
        // TODO: Obviously this parameters should receive the original information.
        val scrollState = rememberScrollState()
        ProfileBackground(paddingValues = paddingValues, titleText = "Posts", postCounter = 12) {

            LazyVerticalGrid(
                modifier = Modifier.scrollable(scrollState, Orientation.Vertical),
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