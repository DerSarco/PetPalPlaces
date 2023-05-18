package com.dersarco.petpalplaces.ui.screens.preview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.dersarco.petpalplaces.ui.screens.preview.components.InfoTag
import com.dersarco.petpalplaces.ui.screens.preview.components.PetIconButton
import com.dersarco.petpalplaces.ui.screens.preview.components.ReviewTitle
import com.dersarco.petpalplaces.ui.theme.InfoTagColors
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.SpecialYellow


@Composable
fun PreviewScreen() {
    PreviewScreenContent()
}

@Composable
fun PreviewScreenContent() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {


        Column(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp),
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

@Composable
@Preview(
    device = Devices.PIXEL_4,
    showSystemUi = true,
)
fun PreviewScreenPreview() {
    PetPalPlacesTheme {
        PreviewScreenContent()
    }
}