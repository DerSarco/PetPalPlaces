package com.dersarco.petpalplaces.ui.screens.components.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.dersarco.petpalplaces.ui.theme.quickSandFamily


@Composable
fun Title(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    style: TextStyle = MaterialTheme.typography.titleLarge,
    align: TextAlign = TextAlign.Start,
    lineHeight: TextUnit = TextUnit.Unspecified,
    maxLines: Int = 2
) {
    Text(
        modifier = modifier,
        text = text,
        fontFamily = quickSandFamily,
        style = style,
        fontWeight = FontWeight.Bold,
        color = color,
        textAlign = align,
        lineHeight = lineHeight,
        maxLines = maxLines,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
@Preview
fun TitlePreview() {
   Title(
         text = "Welcome Back"
   )
}