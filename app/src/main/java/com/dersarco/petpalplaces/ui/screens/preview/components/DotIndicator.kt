package com.dersarco.petpalplaces.ui.screens.preview.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.ui.theme.DotIndicatorColors
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme

@Composable
fun DotIndicator(
    count: Int = 0,
    selected: Int = 0,
    colors: DotIndicatorColors = DotIndicatorColors(),
){
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            Modifier
                .height(32.dp)
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(count) { iteration ->
                val color = if (selected == iteration) colors.selected else colors.unselected
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(CircleShape)
                        .background(color)
                        .size(7.dp)

                )
            }
        }
    }
}


@Composable
@Preview(
    widthDp = 411,
    heightDp = 731,
)
fun DotIndicatorPreview() {
    PetPalPlacesTheme {
        DotIndicator(
            count = 4,
            selected = 2
        )
    }
}

