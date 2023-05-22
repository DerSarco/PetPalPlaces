package com.dersarco.petpalplaces.ui.screens.preview.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme

@Composable
fun ShadowLayer() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {

        ShadowRecGradient(
            size = 120.dp,
            colors = Pair(
                MaterialTheme.colorScheme.background.copy(alpha = 0.7f),
                MaterialTheme.colorScheme.background.copy(alpha = 0f),
            ),
            modifier = Modifier.height(120.dp)
        )

        ShadowRecGradient(
            size = 160.dp,
            colors = Pair(
                MaterialTheme.colorScheme.background.copy(alpha = 0f),
                MaterialTheme.colorScheme.background,
            ),
            modifier = Modifier.height(180.dp)
        )
    }
}

@Composable
@Preview(
    showBackground = true,
    widthDp = 411,
    heightDp = 512,
)
fun ShadowLayerPreview() {
    PetPalPlacesTheme {
        ShadowLayer()
    }
}
