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
import com.dersarco.petpalplaces.ui.screens.preview.state.PlacePreviewState
import com.dersarco.petpalplaces.ui.theme.CustomButtonColors
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.SpecialRed


@Composable
fun PreviewScreen() {
    PreviewScreenContent(
        state = PlacePreviewState(
            images = listOf(
                "https://razadeperro.com/wp-content/uploads/193348577_312970840358471_6044885919976984413_n.jpg",
                "https://razadeperro.com/wp-content/uploads/194146329_438787197451164_8444697227989279062_n.jpg",
                "https://razadeperro.com/wp-content/uploads/193968429_141891607994621_5387995002231728550_n.jpg",
                "https://razadeperro.com/wp-content/uploads/194631788_229112508660969_5271132824087601565_n.jpg",
            )
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PreviewScreenContent(
    state: PlacePreviewState,
) {

    Scaffold(
        topBar = {
            NavigationBack(
                topPadding = 48.dp,
                horizontalPadding = 16.dp,
                leadingIcon = {
                    PetIconButton(
                        icon = ImageVector.vectorResource(id = R.drawable.ic_arrow_left),
                        onClick = {}
                    )
                },
                trailingIcon = {
                    PetIconButton(
                        colors = CustomButtonColors(
                            icon = SpecialRed,
                        ),
                        icon = ImageVector.vectorResource(id = R.drawable.ic_fill_heart),
                        onClick = {}
                    )
                },
            )
        },
    ) { _ ->
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
                    title = "Tail-Wagging Trek in Torres del Paine",
                    trailingIcon = {
                        PetIconButton(
                            icon = ImageVector.vectorResource(id = R.drawable.ic_outline_like_hand),
                            onClick = {}
                        )
                    },
                )
                InfoBar(
                    votes = 5_334.formatWithCommas(),
                    rating = "3.8",
                    reviews = "(${5_345.formatNumber()} reviews)",
                    distance = Pair("5", "mil"),
                )
                Paragraph(
                    text = "Torres del Paine National Park is located in the Patagonia region of Chile, and it is widely considered one of the most stunning and diverse natural areas in the world. The park is characterized by its soaring mountains, sparkling lakes, vast glaciers, and pristine wilderness, offering breathtaking views at every turn."
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
            state = PlacePreviewState()
        )
    }
}