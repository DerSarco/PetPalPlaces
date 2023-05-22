package com.dersarco.petpalplaces.ui.screens.profile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstrainedLayoutReference
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.dersarco.petpalplaces.ui.screens.components.MyCustomText
import com.dersarco.petpalplaces.ui.theme.SpecialGray

@Composable
fun PostFeed(
    titleText: String,
    postCounter: Int,
    column: ConstrainedLayoutReference,
    content: @Composable () -> Unit
) {
    ConstraintLayout {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
                .background(Color(0xFFFFFFFF))
                .constrainAs(column) {
                    top.linkTo(parent.top, margin = 210.dp)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    height = Dimension.matchParent
                    width = Dimension.matchParent
                }
        ) {
            Column {
                Spacer(modifier = Modifier.height(48.dp))
                Row(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MyCustomText(
                        text = titleText,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    MyCustomText(
                        text = postCounter.toString(),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        fontColor = SpecialGray
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                content()
            }
        }
    }
}