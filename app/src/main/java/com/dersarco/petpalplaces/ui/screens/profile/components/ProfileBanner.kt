package com.dersarco.petpalplaces.ui.screens.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstrainedLayoutReference
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.components.MyCustomText
import com.dersarco.petpalplaces.ui.theme.SpecialGray

@Composable
fun ProfileBanner(card: ConstrainedLayoutReference) {
    ConstraintLayout {
        ElevatedCard(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .constrainAs(card) {
                    top.linkTo(parent.top, margin = 48.dp)
                    start.linkTo(parent.start, margin = 48.dp)
                    end.linkTo(parent.end, margin = 48.dp)
                    height = Dimension.wrapContent
                },
            elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 12.dp
            ),
            colors = CardDefaults.elevatedCardColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(15.dp)
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .padding(horizontal = 24.dp),
            ) {
                Image(
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(78.dp)
                        .align(Alignment.Center),
                    painter = painterResource(id = R.drawable.portrait_example),
                    contentDescription = "Profile Picture",
                    alignment = Alignment.Center,
                    contentScale = ContentScale.Crop
                )
                IconButton(modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.TopEnd), onClick = {}) {
                    Icon(painter = painterResource(id = R.drawable.edit_2), contentDescription = "")
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    Modifier.weight(1f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.user),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    MyCustomText(
                        text = "Der Sarco",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Row(
                    Modifier.weight(1f),
                ) {
                    MyCustomText(
                        text = "@username",
                        fontSize = 16.sp,
                        fontColor = SpecialGray,
                        textAlign = TextAlign.End,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier.weight(1f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(painter = painterResource(id = R.drawable.sms), contentDescription = "")
                    Spacer(modifier = Modifier.width(4.dp))
                    MyCustomText(
                        text = "mail@mail.com",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyBannerPrev() {
    ConstraintLayout {
        val (card) = createRefs()
        ProfileBanner(card = card)

    }
}