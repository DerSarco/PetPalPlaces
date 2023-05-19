package com.dersarco.petpalplaces.ui.screens.preview.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.theme.CustomButtonColors
import com.dersarco.petpalplaces.ui.theme.SpecialRed

@Composable
fun NavigationBack(
    topPadding: Dp = 0.dp,
    horizontalPadding: Dp = 0.dp,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = horizontalPadding)
            .padding(top = topPadding),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        leadingIcon?.let {
            leadingIcon()
        }
        trailingIcon?.let {
            trailingIcon()
        }
    }
}

@Composable
@Preview(widthDp = 411)
fun NavigationBackPreview() {
    NavigationBack(
        topPadding = 48.dp,
        horizontalPadding = 16.dp,
        leadingIcon = {
            PetIconButton(
                icon = ImageVector.vectorResource(id = R.drawable.ic_arrow_left),
                onClick = {}
            )
        },
        trailingIcon = {
            PetIconButton(
                colors = CustomButtonColors(
                    icon = SpecialRed,
                ),
                icon = ImageVector.vectorResource(id = R.drawable.ic_fill_heart),
                onClick = {}
            )
        },
    )
}