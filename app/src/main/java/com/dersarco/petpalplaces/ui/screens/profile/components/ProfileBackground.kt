package com.dersarco.petpalplaces.ui.screens.profile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.theme.SpecialPurple

@Composable
fun ProfileBackground(
    paddingValues: PaddingValues,
    titleText: String,
    postCounter: Int,
    content: @Composable () -> Unit
) {
    ConstraintLayout(
        modifier = Modifier
            .padding(paddingValues)
            .background(SpecialPurple)
    ) {
        val (card, column) = createRefs()
        PostFeed(
            titleText = titleText,
            postCounter = postCounter,
            column = column,
            content = content
        )
        // TODO: Pasar los parámetros para nombre, usuario y mail
        ProfileBanner(card)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun MyBackgroundPrev() {
    Scaffold {
        ProfileBackground(
            paddingValues = it,
            titleText = "Generic title",
            postCounter = 12
        ) {
            LazyVerticalGrid(
                modifier = Modifier
                    .background(
                        Color.White
                    )
                    .scrollable(rememberScrollState(), Orientation.Vertical),
                columns = GridCells.Adaptive(minSize = 128.dp)
            ) {
                items((1..10).toList()) {
                    ProfilePostItem(image = R.drawable.portrait_example)
                }
            }
        }
    }
}