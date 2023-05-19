package com.dersarco.petpalplaces.ui.screens.components

import androidx.annotation.StringRes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import com.dersarco.petpalplaces.ui.theme.quickSandFamily

@Composable
fun MyCustomText(
    @StringRes text: Int,
    fontSize: TextUnit,
    fontWeight: FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Start
) {
    Text(
        text = stringResource(id = text),
        fontSize = fontSize,
        fontFamily = quickSandFamily,
        fontWeight = fontWeight,
        textAlign = textAlign
    )
}