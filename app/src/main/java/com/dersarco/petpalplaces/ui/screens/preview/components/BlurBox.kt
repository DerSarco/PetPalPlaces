package com.dersarco.petpalplaces.ui.screens.preview.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.R

@Composable
fun BlurBox(
    modifier: Modifier = Modifier,

) {
    Image(
        modifier = modifier,
        painter = painterResource(id = R.drawable.bg_button_blur),
        contentDescription = "bg blur",
    )
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

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "blur test"
        )

        BlurBox(modifier = Modifier.size(48.dp))
    }
}