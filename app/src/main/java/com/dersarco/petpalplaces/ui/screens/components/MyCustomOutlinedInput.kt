package com.dersarco.petpalplaces.ui.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.ui.theme.SpecialGray
import com.dersarco.petpalplaces.ui.theme.SpecialSolitude

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCustomOutlinedInput(
    placeholderText: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .border(
                width = 1.dp,
                Color.LightGray,
                shape = RoundedCornerShape(8.dp)
            )
            .clip(RoundedCornerShape(8.dp))
            .background(SpecialSolitude)
            .fillMaxWidth(),
        value = value,
        onValueChange = { onValueChange(it) },
        placeholder = {
            MyCustomText(
                text = placeholderText,
                fontColor = SpecialGray,
                fontSize = 16.sp
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = SpecialSolitude,
            focusedBorderColor = SpecialSolitude
        ),
    )
}