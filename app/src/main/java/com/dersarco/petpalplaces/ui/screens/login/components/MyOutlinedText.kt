package com.dersarco.petpalplaces.ui.screens.login.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.ui.theme.SpecialGray
import com.dersarco.petpalplaces.ui.theme.quickSandFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyOutlinedLoginText(
    isPassword: Boolean = false,
    isVisible: Boolean = false,
    onValueChanged: (String) -> Unit,
    placeholderText: String,
    hasIcon: Boolean = false,
    fontFamily: FontFamily = quickSandFamily,
    fontWeight: FontWeight = FontWeight.Normal,
    onIconPressed: (Boolean) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        textStyle = TextStyle(
            fontWeight = fontWeight,
            fontFamily = fontFamily
        ),
        value = "", onValueChange = {
            onValueChanged(it)
        },
        shape = RoundedCornerShape(8.dp),
        placeholder = {
            Text(
                text = placeholderText,
                fontFamily = fontFamily,
                fontWeight = fontWeight,
                style = MaterialTheme.typography.labelLarge,
                textAlign = TextAlign.Center,
                color = SpecialGray
            )
        },
        keyboardOptions = if (isPassword)
            KeyboardOptions(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Password
            ) else KeyboardOptions(),
        visualTransformation = if (isPassword && !isVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            if (hasIcon) {
                Icon(
                    imageVector = Icons.Default.Visibility,
                    contentDescription = "Visibility On",
                    modifier = Modifier.clickable {
                        onIconPressed(true)
                    }
                )
            }
        }
    )
}