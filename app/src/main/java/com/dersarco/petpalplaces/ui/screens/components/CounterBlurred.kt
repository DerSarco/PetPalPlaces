package com.dersarco.petpalplaces.ui.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.theme.CustomButtonColors
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.SpecialRed

@Composable
fun CounterBlurred(
    modifier: Modifier = Modifier,
    colors: CustomButtonColors = CustomButtonColors(),
    icon: ImageVector,
    text: String = "",
    cornerRadiusPercent: Int = 8,
    onClick: () -> Unit
) {

    BlurBackground(
        modifier = Modifier
            .clickable {
                onClick()
            }
            .clip(RoundedCornerShape(percent = cornerRadiusPercent))
    ) {
        Row(
            modifier.padding(4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .size(16.dp)
                    .align(Alignment.CenterVertically),
                imageVector = icon,
                contentDescription = null,
                tint = colors.icon,
            )
            if (text.isNotEmpty()) {
                Spacer(modifier = Modifier.width(8.dp))
                MyCustomText(
                    text = text,
                    fontSize = 14.sp,
                    fontColor = Color.White,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}


@Composable
@Preview(
    widthDp = 100,
    heightDp = 100
)
fun SimpleIconButtonPreview() {
    PetPalPlacesTheme {
        CounterBlurred(
            icon = ImageVector.vectorResource(id = R.drawable.ic_arrow_left),
            text = "9.5K",
            onClick = {}
        )
    }
}

@Composable
@Preview(
    widthDp = 100,
    heightDp = 100
)
fun SimpleIconPreview() {
    PetPalPlacesTheme {
        CounterBlurred(
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
fun HeartFillIconButtonPreview() {
    PetPalPlacesTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "blur test"
            )

            CounterBlurred(
                colors = CustomButtonColors(
                    icon = SpecialRed,
                ),
                text = "9.5K",
                icon = ImageVector.vectorResource(id = R.drawable.ic_fill_heart),
                onClick = {}
            )
        }
    }
}