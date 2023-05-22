package com.dersarco.petpalplaces.ui.screens.profile.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme

@Composable
fun ProfilePostItem(
    @DrawableRes image: Int
) {
    Card(
        modifier = Modifier
            .padding(4.dp)
            .clip(RoundedCornerShape(15.dp))
            .aspectRatio(.835f)
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(id = image),
            contentScale = ContentScale.Crop,
            contentDescription = "",
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview()
@Composable
fun MyProfileBackgroundPrev() {
    PetPalPlacesTheme {
        Scaffold {
            ProfileBackground(
                paddingValues = it,
                titleText = "Generic title",
                postCounter = 12
            ) {
                LazyVerticalGrid(
                    modifier = Modifier.padding(16.dp),
                    columns = GridCells.Adaptive(minSize = 98.dp)
                ) {
                    items((1..10).toList()) {
                        ProfilePostItem(image = R.drawable.portrait_example)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun ProfilePostItemPrev() {
    PetPalPlacesTheme {

        ProfilePostItem(image = R.drawable.portrait_example)
    }
}

