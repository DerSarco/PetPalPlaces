package com.dersarco.petpalplaces.ui.screens.preview.components

import android.R.attr.startY
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme


@Composable
fun ShadowRecGradient(
    modifier: Modifier = Modifier,
    colors: Pair<Color, Color> = Pair(Color.Yellow, Color.Red),
    size: Dp = 100.dp
) {
    val boxSize = with(LocalDensity.current) { size.toPx() }
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(
                Brush.verticalGradient(
                    startY = 0.0f,
                    endY = boxSize,
                    colors = listOf(
                        colors.first,
                        colors.second
                    ),
                )
            )
    )
}

@Composable
@Preview(widthDp = 411, heightDp = 200)
fun ShadowRecPreview() {
    PetPalPlacesTheme {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ) {
            ShadowRecGradient(
                colors = Pair(
                    Color.Yellow.copy(alpha = 0f),
                    Color.Red
                ),
                modifier = Modifier.height(100.dp),
                size = 200.dp
            )
        }
    }
}