package com.dersarco.petpalplaces.ui.screens.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.components.entities.FieldTrailingIcon
import com.dersarco.petpalplaces.ui.theme.SpecialGray
import com.dersarco.petpalplaces.ui.theme.SpecialSolitude

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCustomOutlinedInput(
    placeholderText: String,
    value: String,
    height: Dp = 56.dp,
    trailingIcon: FieldTrailingIcon? = null,
    onValueChange: (String) -> Unit,
) {
    OutlinedTextField(
        modifier = Modifier
            .height(height)
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
        trailingIcon = {
            if (trailingIcon?.icon != null) {
                Icon(
                    modifier = Modifier.clickable {
                        trailingIcon.onPressedIcon()
                    },
                    imageVector = trailingIcon.icon,
                    contentDescription = "Trailing Icon",
                    tint = Color.Black
                )
            }
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = SpecialSolitude,
            focusedBorderColor = SpecialSolitude
        ),
        singleLine = false
    )
}

@Preview
@Composable
fun MyCustomOutlinedInputPrev() {
    MyCustomOutlinedInput(
        placeholderText = "Generic",
        value = "",
        trailingIcon = FieldTrailingIcon(
            icon = ImageVector.run { vectorResource(id = R.drawable.gps) }
        ) {
            Log.d("prev", "Hello!")
        },
        onValueChange = {}
    )
}