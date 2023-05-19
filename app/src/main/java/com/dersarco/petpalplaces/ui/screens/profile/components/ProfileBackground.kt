package com.dersarco.petpalplaces.ui.screens.profile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.components.MyCustomText
import com.dersarco.petpalplaces.ui.theme.SpecialGray
import com.dersarco.petpalplaces.ui.theme.SpecialPurple

@Composable
fun ProfileBackground(
    paddingValues: PaddingValues,
    titleText: String,
    postCounter: Int,
    content: @Composable () -> Unit
) {
    // TODO: Finish the profile card
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(SpecialPurple)
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 198.dp),
            shape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp)
        ) {
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

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun MyBackgroundPrev() {
    Scaffold {
        ProfileBackground(
            paddingValues = it,
            titleText = "Generic title",
            postCounter = 12
        ) {
            LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 128.dp)) {
                items((1..10).toList()) {
                    ProfilePostItem(image = R.drawable.portrait_example)
                }
            }
        }
    }
}