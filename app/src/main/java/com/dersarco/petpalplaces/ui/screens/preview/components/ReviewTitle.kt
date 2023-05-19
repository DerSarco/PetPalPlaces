package com.dersarco.petpalplaces.ui.screens.preview.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.components.text.Title
import com.dersarco.petpalplaces.ui.theme.CustomButtonColors
import com.dersarco.petpalplaces.ui.theme.SpecialRed
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun ReviewTitle(
    title: String,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
) {
    Row(
        modifier = Modifier.padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        leadingIcon?.let {
            leadingIcon()
            Spacer(modifier = Modifier.size(16.dp))
        }
        Title(
            modifier = Modifier.weight(1f),
            text = title,
            lineHeight = 1.5.em,
        )
        trailingIcon?.let {
            Spacer(modifier = Modifier.size(16.dp))
            trailingIcon()
        }
    }
}

@Composable
@Preview(widthDp = 411)
fun ReviewTitlePreview() {
    ReviewTitle(
        title = "Tail-Wagging Trek in Torres del Paine"
    )
}

@Composable
@Preview(widthDp = 411)
fun ReviewTitleIconLikePreview() {
    ReviewTitle(
        title = "Tail-Wagging Trek in Torres del Paine",
        trailingIcon = {
            PetIconButton(
                icon = ImageVector.vectorResource(id = R.drawable.ic_outline_like_hand),
                onClick = {}
            )
        },
    )
}

@Composable
@Preview(widthDp = 411)
fun ReviewTitleWithIconsPreview() {
    ReviewTitle(
        title = "Tail-Wagging Trek in Torres del Paine",
        leadingIcon = {
            PetIconButton(
                colors = CustomButtonColors(
                    icon = SpecialRed,
                ),
                icon = ImageVector.vectorResource(id = R.drawable.ic_fill_heart),
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