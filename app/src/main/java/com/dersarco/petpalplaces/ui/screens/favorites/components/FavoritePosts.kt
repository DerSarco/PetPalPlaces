package com.dersarco.petpalplaces.ui.screens.favorites.components

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.ui.screens.components.PostItem

@Composable
fun FavoritesPosts(posts: List<String>) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(180.dp),
    ){
        items(posts){
            PostItem()
        }
    }
}

@Preview
@Composable
fun FavoritesPostsPrev() {
    FavoritesPosts((1..10).map { "" })
}