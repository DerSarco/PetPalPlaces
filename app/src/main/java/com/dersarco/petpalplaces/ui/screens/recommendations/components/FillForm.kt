package com.dersarco.petpalplaces.ui.screens.recommendations.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.ui.screens.components.MyCustomOutlinedInput
import com.dersarco.petpalplaces.ui.screens.recommendations.RecommendationScreen
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme

@Composable
fun FillForm(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        MyCustomOutlinedInput(placeholderText = "Enter place name", value = "", onValueChange = {})
        Spacer(modifier = Modifier.height(18.dp))
        MyCustomOutlinedInput(placeholderText = "Enter address", value = "", onValueChange = {})
        Spacer(modifier = Modifier.height(18.dp))
        MyCustomOutlinedInput(placeholderText = "Select city", value = "", onValueChange = {})
        Spacer(modifier = Modifier.height(18.dp))
        MyCustomOutlinedInput(placeholderText = "Enter description of place", value = "", onValueChange = {})
    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun FillFormPrev() {
    PetPalPlacesTheme {
        RecommendationScreen()
    }
}