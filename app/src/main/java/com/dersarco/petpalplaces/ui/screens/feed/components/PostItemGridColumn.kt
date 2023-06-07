package com.dersarco.petpalplaces.ui.screens.feed.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dersarco.petpalplaces.ui.screens.components.PostItem

@Composable
fun PostItemGridColumn(
    modifier: Modifier = Modifier,
    items: List<Any> = listOf(),
    totalColumns: Int = 2
) {
    val rows = items.chunked(totalColumns)
    Column(modifier.fillMaxWidth()) {
        rows.forEach { rowItems ->
            Row(Modifier.fillMaxWidth()) {
                rowItems.forEach { _ ->
                    PostItem()
                }
            }
        }
    }
}

@Preview
@Composable
fun GridColumnPreview() {
    PostItemGridColumn()
}