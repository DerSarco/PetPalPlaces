package com.dersarco.petpalplaces.ui.screens.preview.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.core.extensions.formatNumber
import com.dersarco.petpalplaces.core.extensions.formatWithCommas
import com.dersarco.petpalplaces.ui.screens.components.text.Paragraph
import com.dersarco.petpalplaces.ui.screens.preview.components.InfoBar
import com.dersarco.petpalplaces.ui.screens.preview.components.NavigationBack
import com.dersarco.petpalplaces.ui.screens.preview.components.PetIconButton
import com.dersarco.petpalplaces.ui.screens.preview.components.ReviewTitle
import com.dersarco.petpalplaces.ui.screens.preview.components.SlideImage
import com.dersarco.petpalplaces.ui.screens.preview.events.PlacePreviewEvent
import com.dersarco.petpalplaces.ui.screens.preview.state.PlacePreviewState
import com.dersarco.petpalplaces.ui.theme.CustomButtonColors
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.SpecialPurple
import com.dersarco.petpalplaces.ui.theme.SpecialRed
import com.dersarco.petpalplaces.ui.theme.SpecialWhite


@Composable
fun PreviewScreen() {
    PreviewScreenContent(
        state = PlacePreviewState(
            images = listOf(
                "https://razadeperro.com/wp-content/uploads/193348577_312970840358471_6044885919976984413_n.jpg",
                "https://razadeperro.com/wp-content/uploads/194146329_438787197451164_8444697227989279062_n.jpg",
                "https://razadeperro.com/wp-content/uploads/193968429_141891607994621_5387995002231728550_n.jpg",
                "https://razadeperro.com/wp-content/uploads/194631788_229112508660969_5271132824087601565_n.jpg",
            ),
            reviewTitle = "Tail-Wagging Trek in Torres del Paine",
            reviewDescription = "Torres del Paine National Park is located in the Patagonia region of Chile, and it is widely considered one of the most stunning and diverse natural areas in the world. The park is characterized by its soaring mountains, sparkling lakes, vast glaciers, and pristine wilderness, offering breathtaking views at every turn.",
            reviewRating = 3.8f,
            reviewCount = 5_345,
            reviewAuthor = "John Doe",
            distance = "5 mill",
            votes = 5_334,

            isLiked = true,
            isSaved = true,

        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PreviewScreenContent(
    state: PlacePreviewState,
    onEvent: (PlacePreviewEvent) -> Unit = {},
) {

    Scaffold(
        topBar = {
            NavigationBack(
                topPadding = 58.dp,
                horizontalPadding = 16.dp,
                leadingIcon = {
                    PetIconButton(
                        icon = ImageVector.vectorResource(id = R.drawable.ic_arrow_left),
                        onClick = {
                            onEvent(PlacePreviewEvent.Close)
                        }
                    )
                },
                trailingIcon = {
                    val icon = if (state.isSaved) R.drawable.ic_fill_heart else R.drawable.ic_outline_heart
                    PetIconButton(
                        colors = CustomButtonColors(
                            icon = if (state.isSaved) SpecialRed else SpecialWhite,
                        ),
                        icon = ImageVector.vectorResource(id = icon),
                        onClick = {
                            if (state.isSaved) onEvent(PlacePreviewEvent.SavePlace) else onEvent(PlacePreviewEvent.SavePlace)
                        }
                    )
                },
            )
        },
    ) { paddingValues ->
        Modifier.padding(paddingValues) // TODO: 6/29/21 fix this, paddingValues not working with the top bar if you set to Column layout for this screen
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.background)
            ) {
                SlideImage(
                    images = state.images,
                )
            }

            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 24.dp),
            ) {
                ReviewTitle(
                    title = state.reviewTitle,
                    trailingIcon = {
                        val icon = if (state.isLiked) R.drawable.ic_fill_hand else R.drawable.ic_outline_like_hand
                        PetIconButton(
                            colors = CustomButtonColors(
                                icon = if (state.isLiked) SpecialPurple else SpecialWhite,
                            ),
                            icon = ImageVector.vectorResource(id = icon),
                            onClick = {
                                if (state.isLiked) onEvent(PlacePreviewEvent.Dislike) else onEvent(PlacePreviewEvent.Like)
                            }
                        )
                    },
                )
                InfoBar(
                    votes = state.votes.formatWithCommas(),
                    rating = state.reviewRating.toString(),
                    reviews = "(${state.reviewCount.formatNumber()} reviews)",
                    distance = state.distance,
                )
                Paragraph(
                    text = state.reviewDescription,
                )
            }
        }
    }


}

@Composable
@Preview(
    device = Devices.PIXEL_4,
    showSystemUi = true,
)
fun PreviewScreenPreview() {
    PetPalPlacesTheme {
        PreviewScreenContent(
            state = PlacePreviewState(
                images = listOf(
                    "https://razadeperro.com/wp-content/uploads/193348577_312970840358471_6044885919976984413_n.jpg",
                    "https://razadeperro.com/wp-content/uploads/194146329_438787197451164_8444697227989279062_n.jpg",
                    "https://razadeperro.com/wp-content/uploads/193968429_141891607994621_5387995002231728550_n.jpg",
                    "https://razadeperro.com/wp-content/uploads/194631788_229112508660969_5271132824087601565_n.jpg",
                ),
                reviewTitle = "Tail-Wagging Trek in Torres del Paine",
                reviewDescription = "Torres del Paine National Park is located in the Patagonia region of Chile, and it is widely considered one of the most stunning and diverse natural areas in the world. The park is characterized by its soaring mountains, sparkling lakes, vast glaciers, and pristine wilderness, offering breathtaking views at every turn.",
                reviewRating = 3.8f,
                reviewCount = 5_345,
                reviewAuthor = "John Doe",
                distance = "5 mill",
                votes = 5_334,

                )
        )
    }
}