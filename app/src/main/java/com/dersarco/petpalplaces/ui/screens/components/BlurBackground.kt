package com.dersarco.petpalplaces.ui.screens.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.R

@Composable
fun BlurBackground(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .background(Color.Black.copy(alpha = 0.5f)),
        ) {
            content()
        }
    }


}

@Composable
@Preview(
    widthDp = 100,
    heightDp = 100
)
fun BlurBoxPreview() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Image(painter = painterResource(id = R.drawable.arrow_down), contentDescription = "")
        BlurBackground(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "blur test"
            )
        }
    }
}