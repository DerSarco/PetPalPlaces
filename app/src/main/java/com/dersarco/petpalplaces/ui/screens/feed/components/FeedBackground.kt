package com.dersarco.petpalplaces.ui.screens.feed.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.SpecialPurple

@Composable
fun FeedBackGround(
    padding: PaddingValues,
    content: @Composable () -> Unit
) {
    ConstraintLayout(
        modifier = Modifier
            .padding(padding)
            .background(SpecialPurple)
            .fillMaxSize()
    ) {
        val (headerLocation, headerTitle) = createRefs()
        FeedHeaderLocationProfile(location = "Location, Country", modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .constrainAs(headerLocation) {
                top.linkTo(parent.top, 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(headerTitle.top)
            })
        FeedHeaderTitle(
            "Explore Pet-Friendly Paradises for Adventure!",
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .constrainAs(headerTitle) {
                    top.linkTo(headerLocation.bottom, 8.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
        content()
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun FeedBackBackgroundPrev() {
    PetPalPlacesTheme {
        Scaffold { scaffoldPadding ->
            FeedBackGround(padding = scaffoldPadding) {
            }
        }
    }
}
