package com.dersarco.petpalplaces.ui.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.theme.SpecialGray
import com.dersarco.petpalplaces.ui.theme.SpecialStarColor

@Composable
fun PostItem() {
    Box(
        modifier = Modifier
            .padding(
                end = 8.dp,
                bottom = 8.dp
            )
            .width(180.dp)
            .height(220.dp)
            .clip(RoundedCornerShape(8.dp))
    ) {

        //Only demo
        val width = 200;
        val height = 300;
        val randomQueryParam = "random=${(0..100).random()}";

        AsyncImage(
            //painter = painterResource(id = R.drawable.portrait_example),
            modifier = Modifier.fillMaxSize(),
            model = "https://picsum.photos/${width}/${height}?landscape&${randomQueryParam}",
            contentDescription = "Post Item",
            contentScale = ContentScale.Crop

        )
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconPost(
                ImageVector.vectorResource(id = R.drawable.ic_fill_hand),
                text = "9.5K"
            ) {
                // TODO: Agregar funcionalidad
            }
            IconPost(
                ImageVector.vectorResource(id = R.drawable.ic_fill_heart),
            ) {
                // TODO: Agregar funcionalidad
            }
        }
        // TODO: Pasar los parámetros correspondientes.
        CustomBottom(
            title = "Furry fun in La Serena",
            formattedValues = "4.2 • 1.4 mil"
        )
    }
}

@Composable
fun IconPost(
    icon: ImageVector,
    text: String = "",
    onClick: () -> Unit
) {
    CounterBlurred(
        icon = icon,
        text = text,
    ) {
        onClick()
        TODO("Agregar la funcionalidad de cada click")
    }
}

@Composable
fun BoxScope.CustomBottom(
    title: String,
    formattedValues: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .align(Alignment.BottomStart),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom
    ) {
        MyCustomText(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            fontColor = Color.White
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.star),
                contentDescription = "Star",
                tint = SpecialStarColor
            )
            Spacer(modifier = Modifier.width(4.dp))
            MyCustomText(
                text = formattedValues,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                fontColor = SpecialGray
            )
        }
    }
}

@Preview
@Composable
fun PostItemPrev() {
    PostItem()
}