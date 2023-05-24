package com.dersarco.petpalplaces.ui.screens.favorites

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.ui.screens.components.MyCustomText
import com.dersarco.petpalplaces.ui.screens.favorites.components.FavoritesPosts
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme

@Composable
fun FavoritesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start
        ) {
            MyCustomText(
                text = "Favorite Post",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }
        //TODO: Pasar los favoritos del usuario
        FavoritesPosts((1..10).map { "" })
    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun FavoritesScreenPrev() {
    PetPalPlacesTheme {
        FavoritesScreen()
    }
}