package com.dersarco.petpalplaces.ui.screens.preview.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.core.extensions.formatNumber
import com.dersarco.petpalplaces.core.extensions.formatWithCommas
import com.dersarco.petpalplaces.ui.theme.InfoTagColors
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.SpecialWhite
import com.dersarco.petpalplaces.ui.theme.SpecialYellow

@Composable
fun InfoBar(
    modifier: Modifier = Modifier,
    votes: String = "0",
    rating: String = "0",
    reviews: String = "0",
    distance: String = "0",
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        InfoTag(
            icon = ImageVector.vectorResource(id = R.drawable.ic_fill_hand),
            counter = votes,
            detail = "Votes"
        )
        InfoTag(
            icon = ImageVector.vectorResource(id = R.drawable.ic_fill_start),
            counter = rating,
            detail = reviews,
            colors = InfoTagColors(
                icon = SpecialYellow
            )
        )
        InfoTag(
            colors = InfoTagColors(
                text = SpecialWhite,
            ),
            icon = ImageVector.vectorResource(id = R.drawable.ic_fill_route),
            distance = distance,
        )
    }
}


@Composable
@Preview
fun InfoBarPreview() {
    PetPalPlacesTheme {
        InfoBar(
            votes = 5_334.formatWithCommas(),
            rating = "3.8",
            reviews = "(${5_345.formatNumber()} reviews)",
            distance = "5 mil",
        )
    }
}