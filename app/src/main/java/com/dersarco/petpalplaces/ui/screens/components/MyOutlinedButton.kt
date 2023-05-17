package com.dersarco.petpalplaces.ui.screens.login.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun RowScope.MyOutlinedButton(
    onClick: () -> Unit,
    buttonText: String,
    @DrawableRes icon: Int
) {
    OutlinedButton(
        modifier = Modifier
            .padding(16.dp)
            .weight(1f),
        onClick = { onClick() }) {
        Image(
            modifier = Modifier.size(12.dp),
            painter = painterResource(id = icon),
            contentDescription = "Button Logo",
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = buttonText)
    }
}