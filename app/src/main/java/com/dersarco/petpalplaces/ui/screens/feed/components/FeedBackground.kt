package com.dersarco.petpalplaces.ui.screens.feed.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.SpecialGray
import com.dersarco.petpalplaces.ui.theme.SpecialPurple

@Composable
fun FeedBackGround(
    padding: PaddingValues,
    content: @Composable () -> Unit
) {

    var searchText by remember {
        mutableStateOf("")
    }

    ConstraintLayout(
        modifier = Modifier
            .padding(padding)

            .fillMaxSize()
    ) {
        val (headerColumn, contentRef) = createRefs()
        Column(
            modifier = Modifier
                .background(SpecialPurple)
                .constrainAs(headerColumn) {
                    top.linkTo(parent.top, 16.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            FeedHeaderLocationProfile(
                location = "Location, Country", modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
            )
            FeedHeaderTitle(
                "Explore Pet-Friendly Paradises for Adventure!",
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }

        Column(modifier = Modifier
            .background(Color.White)
            .constrainAs(contentRef) {
                top.linkTo(headerColumn.bottom, 54.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
                height = Dimension.fillToConstraints
                width = Dimension.matchParent
            }) {
            content()
        }
    }

    ConstraintLayout {
        val (search) = createRefs()
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .constrainAs(search) {
                    top.linkTo(parent.top, 140.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 16.dp
            )
        ) {
            Row(
                Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
                Spacer(modifier = Modifier.width(8.dp))
                SearchField(searchText) { searchString ->
                    searchText = searchString
                }
            }
        }
    }
}

@Composable
fun SearchField(
    text: String,
    onValueChanged: (String) -> Unit
) {
    BasicTextField(
        value = text,
        onValueChange = { onValueChanged(it) },
        singleLine = true,
        decorationBox = { innerTextField ->
            if (text.isBlank()){
                Text(text = "Search a place", color = SpecialGray)
            }
            innerTextField()
        }
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun FeedBackBackgroundPrev() {
    PetPalPlacesTheme {
        Scaffold { scaffoldPadding ->
            FeedBackGround(padding = scaffoldPadding) {
            }
        }
    }
}
