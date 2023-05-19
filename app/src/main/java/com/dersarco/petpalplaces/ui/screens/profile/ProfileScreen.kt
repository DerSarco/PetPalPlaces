package com.dersarco.petpalplaces.ui.screens.profile

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dersarco.petpalplaces.ui.screens.profile.components.ProfileBackground

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Scaffold(
        Modifier.fillMaxSize()
    ) { paddingValues ->
        // TODO: Obviously this parameters should receive the original information.
        ProfileBackground(paddingValues = paddingValues, titleText = "", postCounter = 0) {

        }
    }
}