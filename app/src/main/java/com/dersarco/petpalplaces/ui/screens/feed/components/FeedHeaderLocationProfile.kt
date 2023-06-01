package com.dersarco.petpalplaces.ui.screens.feed.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.components.MyCustomText

@Composable
fun FeedHeaderLocationProfile(
    modifier: Modifier = Modifier,
    avatar: String = "", // TODO: Cambiar esto por la URI del avatar,
    location: String,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.location),
                contentDescription = "Location Icon",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(4.dp))
            MyCustomText(
                text = location,
                fontSize = 14.sp,
                fontColor = Color.White,
                fontWeight = FontWeight.SemiBold
            )
        }
        Image(
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
                .border(
                    1.dp,
                    color = Color.White,
                    shape = RoundedCornerShape(100.dp)
                )
                .size(36.dp),
            painter = painterResource(id = R.drawable.portrait_example),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop
        )
    }
}
