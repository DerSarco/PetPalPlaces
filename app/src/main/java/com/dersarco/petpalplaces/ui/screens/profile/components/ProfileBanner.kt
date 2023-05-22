package com.dersarco.petpalplaces.ui.screens.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 48.dp)
                .padding(bottom = 16.dp)
                .shadow(
                    elevation = 68.dp,
                    ambientColor = Color.Blue,
                    spotColor = Color.Black,
                    shape = RoundedCornerShape(20.dp)
                )
                .constrainAs(card) {
                    top.linkTo(parent.top, margin = 68.dp)
                    start.linkTo(parent.start, margin = 48.dp)
                    end.linkTo(parent.end, margin = 48.dp)
                    height = Dimension.fillToConstraints
                },
            elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 50.dp
            )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.End
            ) {
                IconButton(modifier = Modifier.size(24.dp), onClick = {}) {
                    Icon(painter = painterResource(id = R.drawable.edit_2), contentDescription = "")
                }
            }
            Image(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(78.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(id = R.drawable.portrait_example),
                contentDescription = "Profile Picture",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(Modifier.weight(1f)) {
                    Icon(painter = painterResource(id = R.drawable.user), contentDescription = "")
                    Spacer(modifier = Modifier.width(4.dp))
                    MyCustomText(
                        text = "Der Sarco",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Row(Modifier.weight(1f)) {
                    MyCustomText(
                        text = "@username",
                        fontSize = 16.sp,
                        fontColor = SpecialGray
                    )
                }
            }
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(Modifier.weight(1f)) {
                    Icon(painter = painterResource(id = R.drawable.sms), contentDescription = "")
                    Spacer(modifier = Modifier.width(4.dp))
                    MyCustomText(
                        text = "mail@mail.com",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}