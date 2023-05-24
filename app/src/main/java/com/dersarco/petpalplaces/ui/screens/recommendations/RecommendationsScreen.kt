package com.dersarco.petpalplaces.ui.screens.recommendations

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.components.MyCustomText
import com.dersarco.petpalplaces.ui.screens.recommendations.components.FillForm
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme

@Composable
fun RecommendationScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            IconButton(
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .shadow(
                        elevation = 1.dp,
                        spotColor = Color.Gray,
                        ambientColor = Color.White
                    )
                    .size(36.dp),
                onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.arrow_left),
                    contentDescription = "Back Button"
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            MyCustomText(
                text = "Add New Place",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(16.dp)
        )
        FillForm(modifier = Modifier.fillMaxWidth())
    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun RecommendationScreenPrev() {
    PetPalPlacesTheme {
        RecommendationScreen()
    }
}