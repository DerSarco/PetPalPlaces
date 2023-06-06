package com.dersarco.petpalplaces.ui.screens.recommendations.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.components.MyCustomText
import com.dersarco.petpalplaces.ui.theme.SpecialGray
import com.dersarco.petpalplaces.ui.theme.SpecialImageBoxBg
import com.dersarco.petpalplaces.ui.theme.SpecialSolitude

@Composable
fun UploadImage(
    onPressed: () -> Unit
) {
    Row(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .border(
                width = 1.dp, Color.LightGray, shape = RoundedCornerShape(8.dp)
            )
            .background(SpecialSolitude)
            .padding(horizontal = 16.dp)
            .clickable { onPressed() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(66.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(
                    1.dp,
                    Color.LightGray,
                    shape = RoundedCornerShape(8.dp)
                )
                .background(SpecialImageBoxBg),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.Image,
                contentDescription = "Image Icon",
                tint = SpecialGray
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.upload),
                contentDescription = "Upload Icon",
                tint = SpecialGray
            )
            Spacer(modifier = Modifier.width(8.dp))
            MyCustomText(
                text = "Add Image",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                fontColor = SpecialGray,

                )
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview
@Composable
fun UploadImagePrev() {
    UploadImage {

    }
}