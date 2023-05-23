package com.dersarco.petpalplaces.ui.screens.recommendations.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.components.entities.FieldTrailingIcon
import com.dersarco.petpalplaces.ui.screens.components.MyCustomOutlinedInput
import com.dersarco.petpalplaces.ui.screens.components.MyElevatedButton
import com.dersarco.petpalplaces.ui.screens.recommendations.RecommendationScreen
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme

@Composable
fun FillForm(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        MyCustomOutlinedInput(placeholderText = "Enter place name", value = "", onValueChange = {})
        Spacer(modifier = Modifier.height(18.dp))
        MyCustomOutlinedInput(
            placeholderText = "Enter address",
            value = "",
            trailingIcon = FieldTrailingIcon(
                icon = ImageVector.vectorResource(id = R.drawable.gps)
            ) {
                //TODO: GPS Clickable
            },
            onValueChange = {})
        Spacer(modifier = Modifier.height(18.dp))
        MyCustomOutlinedInput(
            placeholderText = "Select city",
            value = "",
            trailingIcon = FieldTrailingIcon(
                icon = ImageVector.vectorResource(id = R.drawable.arrow_down)
            ) {
                //TODO: Flecha Clickable
            },
            onValueChange = {})
        Spacer(modifier = Modifier.height(18.dp))
        MyCustomOutlinedInput(
            placeholderText = "Enter description of place",
            value = "",
            onValueChange = {},
            height = 130.dp
        )
    }
    Spacer(modifier = Modifier.height(18.dp))
    UploadImage {

    }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        MyElevatedButton(text = "SAVE") {

        }
    }

}

@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun FillFormPrev() {
    PetPalPlacesTheme {
        RecommendationScreen()
    }
}