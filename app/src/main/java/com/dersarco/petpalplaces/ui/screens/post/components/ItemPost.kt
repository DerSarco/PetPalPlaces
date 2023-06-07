package com.dersarco.petpalplaces.ui.screens.post.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.core.extensions.formatNumber
import com.dersarco.petpalplaces.ui.screens.components.text.Title
import com.dersarco.petpalplaces.ui.screens.preview.components.InfoTag
import com.dersarco.petpalplaces.ui.theme.InfoTagColors
import com.dersarco.petpalplaces.ui.theme.ItemPostColors
import com.dersarco.petpalplaces.ui.theme.SpecialYellow

@Composable
fun ItemPost(
    modifier: Modifier = Modifier,
    colors: ItemPostColors = ItemPostColors(),
    onDelete: () -> Unit = {},
    onEdit: () -> Unit = {},
    onClick: () -> Unit = {},
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .border(1.5.dp, colors.border, RoundedCornerShape(12.dp))
            .clickable { onClick() }
            .background(colors.background)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.height(100.dp),
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .height(100.dp)
                    .aspectRatio(1f)
                    .background(colors.border),
                contentAlignment = Alignment.Center
            ) {
                val width = 200;
                val height = 300;
                val randomQueryParam = "random=${(0..100).random()}";
                AsyncImage(
                    modifier = Modifier
                        .background(colors.border),
                    contentScale = ContentScale.Crop,
                    model = "https://picsum.photos/${width}/${height}?landscape&${randomQueryParam}",
                    contentDescription = null,
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 12.dp),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Title(
                        style = MaterialTheme.typography.titleMedium,
                        color = colors.title,
                        modifier = Modifier.weight(1f),
                        maxLines = 1,
                        text = "Fuzzy Feline Retreat"
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    OutlineIconButton(
                        icon = R.drawable.ic_trash,
                        click = onDelete,
                        colors = colors.buttonColors
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    OutlineIconButton(
                        icon = R.drawable.edit_2,
                        click = onEdit,
                        colors = colors.buttonColors
                    )

                }

                InfoTag(
                    verticalPadding = 5.dp,
                    icon = ImageVector.vectorResource(id = R.drawable.ic_fill_hand),
                    counter = 5_2334.formatNumber(),
                    detail = "Votes",
                    colors = InfoTagColors(
                        text = colors.title,
                    )
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    InfoTag(
                        verticalPadding = 4.dp,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_fill_start),
                        counter = "3.8",
                        detail = "(${5_345.formatNumber()} reviews)",
                        colors = InfoTagColors(
                            icon = SpecialYellow,
                            text = colors.title,
                        )
                    )
                    InfoTag(
                        verticalPadding = 4.dp,
                        icon = ImageVector.vectorResource(id = R.drawable.ic_fill_route),
                        distance = "5 mil",
                        colors = InfoTagColors(
                            text = colors.title,
                        ),
                    )
                }
            }
        }
    }

}

@Composable
@Preview(
    backgroundColor = 0xFFFFFFFF,
    device = Devices.PIXEL_4
)
fun ItemPostPreview() {
    ItemPost()
}