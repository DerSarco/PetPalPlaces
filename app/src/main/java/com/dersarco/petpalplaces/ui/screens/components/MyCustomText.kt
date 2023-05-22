package com.dersarco.petpalplaces.ui.screens.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import com.dersarco.petpalplaces.ui.theme.quickSandFamily

@Composable
fun MyCustomText(
    modifier: Modifier = Modifier,
    text: String,
    fontSize: TextUnit,
    fontWeight: FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Start,
    fontColor: Color = Color.Black,
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = fontSize,
        fontFamily = quickSandFamily,
        fontWeight = fontWeight,
        textAlign = textAlign,
        color = fontColor
    )
}