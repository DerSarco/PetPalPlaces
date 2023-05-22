package com.dersarco.petpalplaces.ui.screens.preview.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import coil.request.ImageRequest

@Composable
fun PreviewImage(
    modifier: Modifier = Modifier,
    url: String,
) {
    SubcomposeAsyncImage(
        contentScale = ContentScale.Crop,
        model = ImageRequest.Builder(LocalContext.current)
            .data(url)
            .crossfade(true)
            .build(),
        loading = {
            Box(
                modifier = modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(
                    color = Color.White,
                    strokeWidth = 1.dp,
                    modifier = Modifier.size(24.dp)
                )
            }
        },
        contentDescription = "Preview image",
        modifier = Modifier.fillMaxSize()
    )


}

@Composable
@Preview(
    showBackground = true,
    widthDp = 411,
    heightDp = 512,
)
fun PreviewImagePreview() {
    PreviewImage(
        url = "https://razadeperro.com/wp-content/uploads/194146329_438787197451164_8444697227989279062_n.jpg"
    )
}

