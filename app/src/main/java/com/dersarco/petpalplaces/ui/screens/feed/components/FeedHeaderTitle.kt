package com.dersarco.petpalplaces.ui.screens.feed.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.ui.screens.components.MyCustomText


@Composable
fun FeedHeaderTitle(
    title: String,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
    ) {
        MyCustomText(
            text = title,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            fontColor = Color.White
        )
    }

}