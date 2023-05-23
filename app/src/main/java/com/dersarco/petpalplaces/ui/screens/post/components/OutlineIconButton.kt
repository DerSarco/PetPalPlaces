package com.dersarco.petpalplaces.ui.screens.post.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.theme.OutlineIconButtonColors

@Composable
fun OutlineIconButton(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int = R.drawable.ic_trash,
    colors: OutlineIconButtonColors = OutlineIconButtonColors(),
    click: () -> Unit = { },
    size: Dp = 36.dp,
) {
    Box(
        modifier = modifier
            .size(size)
            .clip(RoundedCornerShape(6.dp))
            .border(1.dp, colors.border, RoundedCornerShape(6.dp))
            .background(colors.background)
            .clickable { click() },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            tint = colors.icon,
            modifier = Modifier.size(19.dp),
            painter = painterResource(id = icon),
            contentDescription = null
        )
    }
}

@Composable
@Preview
fun OutlineIconButtonPreview() {
    OutlineIconButton()
}

