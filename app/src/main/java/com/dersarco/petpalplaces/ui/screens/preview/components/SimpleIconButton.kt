package com.dersarco.petpalplaces.ui.screens.preview.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.theme.CustomButtonColors
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.SpecialRed

@Composable
fun PetIconButton(
    modifier: Modifier = Modifier,
    colors: CustomButtonColors = CustomButtonColors(),
    icon: ImageVector,
    size: Dp = 48.dp,
    cornerRadiusPercent: Int = 10,
    onClick: () -> Unit
) {

    Box(
        modifier = modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(percent = cornerRadiusPercent))
            .border(1.dp, colors.border.copy(alpha = 0.4f), RoundedCornerShape(percent = cornerRadiusPercent))
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ){

        Box(modifier = Modifier
            .size(size)
            .clip(RoundedCornerShape(percent = cornerRadiusPercent))
            .background(colors.background.copy(alpha = 0.2f))
            .blur(1.dp))

        Icon(
            modifier = Modifier
                .size(24.dp),
            imageVector = icon,
            contentDescription = null,
            tint = colors.icon
        )
    }
}



@Composable
@Preview(
    widthDp = 100,
    heightDp = 100
)
fun SimpleIconButtonPreview() {
    PetPalPlacesTheme {
        PetIconButton(
            icon = ImageVector.vectorResource(id = R.drawable.ic_arrow_left),
            onClick = {}
        )
    }
}

@Composable
@Preview(
    widthDp = 100,
    heightDp = 100
)
fun HeartIconButtonPreview() {
    PetPalPlacesTheme {
        PetIconButton(
            icon = ImageVector.vectorResource(id = R.drawable.ic_outline_heart),
            onClick = {}
        )
    }
}

@Composable
@Preview(
    widthDp = 100,
    heightDp = 100
)
fun HeartFillIconButtonPreview() {
    PetPalPlacesTheme {
        PetIconButton(
            colors = CustomButtonColors(
                icon = SpecialRed,
            ),
            icon = ImageVector.vectorResource(id = R.drawable.ic_fill_heart),
            onClick = {}
        )
    }
}