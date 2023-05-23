package com.dersarco.petpalplaces.ui.screens.post.components


import android.util.Log
import androidx.annotation.StringRes
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.components.text.Title
import com.dersarco.petpalplaces.ui.screens.preview.components.ShadowRecGradient

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PostTopBar(
    modifier: Modifier = Modifier,
    @StringRes title: Int = R.string.post_title,
    backgroundColor: Color = Color.White,
    textColor: Color = Color.Black,
    horizontalPadding: Dp = 16.dp,
    showShadow: Boolean = false,
    ) {

    val shadowElevation by animateFloatAsState(if (showShadow) 4f else 0f)
    Surface(shadowElevation = shadowElevation.dp) {
        Box(
            modifier = modifier
                .height(60.dp)
                .fillMaxWidth()
                .background(backgroundColor)
                .fillMaxWidth()
                .padding(horizontal = horizontalPadding),
            contentAlignment = Alignment.CenterStart
        ) {
            Title(
                style = MaterialTheme.typography.headlineMedium,
                color = textColor,
                text = stringResource(id = title),
            )
        }
    }

}

@Composable
@Preview
fun PostTopBarPreview() {
    PostTopBar()
}

@Composable
@Preview
fun PostTopBarShadowPreview() {
    PostTopBar(showShadow = true)
}

