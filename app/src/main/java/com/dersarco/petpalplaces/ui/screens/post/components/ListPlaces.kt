package com.dersarco.petpalplaces.ui.screens.post.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.ui.theme.ItemPostColors
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme


@Composable
fun ListPlaces(
    items: List<String> = (0..5).map { "Item $it" },
    itemColors: ItemPostColors = ItemPostColors(),
    isFirstItemVisible: (Boolean) -> Unit = {},
) {

    val listState = rememberLazyListState()
    val indexObserver by remember {
        derivedStateOf {
            listState.firstVisibleItemIndex == 0
        }
    }

    LaunchedEffect(indexObserver) {
        isFirstItemVisible(indexObserver)
    }

    LazyColumn(
        state = listState,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(21.dp))
        }
        items(items) { item ->
            ItemPost(
                colors = itemColors,
            )
            Spacer(modifier = Modifier.height(29.dp))
        }
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.NEXUS_5,
)
fun ListPlacesPreview() {
    PetPalPlacesTheme {
        ListPlaces()
    }
}
