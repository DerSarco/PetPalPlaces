package com.dersarco.petpalplaces.ui.screens.components.text

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.ui.theme.quickSandFamily


@Composable
fun Paragraph(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    style: TextStyle = MaterialTheme.typography.bodyMedium,
    maxLine: Int = 7,
    align: TextAlign = TextAlign.Start,
) {
    Text(

        modifier = modifier,
        text = text,
        fontFamily = quickSandFamily,
        style = style,
        fontWeight = FontWeight.Bold,
        color = color.copy(alpha = 0.8f),
        maxLines = maxLine,
        overflow = TextOverflow.Ellipsis,
        textAlign = align
    )
}

@Composable
@Preview(
    widthDp = 411,
)
fun ParagraphPreview() {
    Box(modifier = Modifier.padding(21.dp)) {

        Paragraph(
            text = "Torres del Paine National Park is located in the Patagonia region of Chile, and it is widely considered one of the most stunning and diverse natural areas in the world. The park is characterized by its soaring mountains, sparkling lakes, vast glaciers, and pristine wilderness, offering breathtaking views at every turn."
        )
    }
}

@Composable
@Preview(
    widthDp = 411,
)
fun ParagraphWithOverFlowPreview() {
    Box(modifier = Modifier.padding(21.dp)) {
        Paragraph(
            text = "Torres del Paine National Park is located in the Patagonia region of Chile, and it is widely considered one of the most stunning and diverse natural areas in the world. The park is characterized by its soaring mountains, sparkling lakes, vast glaciers, and pristine wilderness, offering breathtaking views at every turn. Torres del Paine National Park is located in the Patagonia region of Chile, and it is widely considered one of the most stunning and diverse natural areas in the world"
        )
    }
}

