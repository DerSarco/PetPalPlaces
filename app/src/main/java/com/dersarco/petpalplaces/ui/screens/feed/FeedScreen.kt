package com.dersarco.petpalplaces.ui.screens.feed

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.ui.screens.components.MyCustomText
import com.dersarco.petpalplaces.ui.screens.components.PostItem
import com.dersarco.petpalplaces.ui.screens.feed.components.FeedBackGround
import com.dersarco.petpalplaces.ui.screens.feed.components.PostItemGridColumn
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.SpecialGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeedScreen() {

    Scaffold(
        Modifier.fillMaxSize(),
    ) { paddingValues ->
        // TODO: Obviously this parameters should receive the original information.
        val scrollState = rememberScrollState()
        FeedBackGround(padding = paddingValues) {
            LazyColumn(
                modifier = Modifier
                    .padding(top = 36.dp)
                    .scrollable(scrollState, Orientation.Vertical)
                    .background(Color.White)
            ) {
                item {
                    MyCustomText(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "Most Voted Places",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    MyCustomText(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "Explore the top-voted places by users",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        fontColor = SpecialGray
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 16.dp),
                    ) {
                        items((1..3).toList()) {
                            PostItem()
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    MyCustomText(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "Explore more Places",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    MyCustomText(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "Explore more places added by users",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        fontColor = SpecialGray
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
                item {
                    PostItemGridColumn(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        items = (1..20).toList(),
                    )
                }
            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun FeedScreenPrev() {
    PetPalPlacesTheme {
        FeedScreen()
    }
}