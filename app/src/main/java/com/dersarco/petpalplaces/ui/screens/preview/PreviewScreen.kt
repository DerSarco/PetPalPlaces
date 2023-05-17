package com.dersarco.petpalplaces.ui.screens.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme


@Composable
fun PreviewScreen() {
    PreviewScreenContent()
}

@Composable
fun PreviewScreenContent() {
    //To build preview layout

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