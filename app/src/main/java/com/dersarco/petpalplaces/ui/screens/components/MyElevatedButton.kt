package com.dersarco.petpalplaces.ui.screens.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.ui.theme.SpecialPurple
import com.dersarco.petpalplaces.ui.theme.quickSandFamily

@Composable
fun MyElevatedButton(
    text: String,
    modifier: Modifier = Modifier,
    onClicked: () -> Unit
) {
    ElevatedButton(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = SpecialPurple
        ),
        shape = RoundedCornerShape(10.dp),
        onClick = { onClicked() },
    ) {
        Text(
            text = text,
            fontFamily = quickSandFamily,
            fontWeight = FontWeight.Bold
        )
    }
}