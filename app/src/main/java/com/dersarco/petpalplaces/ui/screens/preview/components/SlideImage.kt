package com.dersarco.petpalplaces.ui.screens.preview.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SlideImage(
    modifier: Modifier = Modifier,
    images: List<String> = listOf(),
) {
    val pageCount = images.size
    val pagerState = rememberPagerState()

    HorizontalPager(
        modifier = modifier.fillMaxSize(),
        pageCount = pageCount,
        state = pagerState
    ) { page ->
        PreviewImage(
            url = images[page]
        )
    }
    ShadowLayer()
    DotIndicator(
        count = images.size,
        selected = pagerState.currentPage,
    )

}


@Composable
@Preview(
    showBackground = true,
    widthDp = 411,
    heightDp = 512,
)
fun SlideImagePreview() {
    PetPalPlacesTheme {
        SlideImage(
            images = listOf(
                "https://razadeperro.com/wp-content/uploads/193348577_312970840358471_6044885919976984413_n.jpg",
                "https://razadeperro.com/wp-content/uploads/194146329_438787197451164_8444697227989279062_n.jpg",
                "https://razadeperro.com/wp-content/uploads/193968429_141891607994621_5387995002231728550_n.jpg",
                "https://razadeperro.com/wp-content/uploads/194631788_229112508660969_5271132824087601565_n.jpg",

                )
        )
    }
}