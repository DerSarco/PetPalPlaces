package com.dersarco.petpalplaces.ui.screens.preview.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.core.extensions.formatNumber
import com.dersarco.petpalplaces.core.extensions.formatWithCommas
import com.dersarco.petpalplaces.ui.theme.InfoTagColors
import com.dersarco.petpalplaces.ui.theme.SpecialYellow
import com.dersarco.petpalplaces.ui.theme.quickSandFamily
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun InfoTag(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    colors: InfoTagColors = InfoTagColors(),
    counter: String,
    detail: String = "Description",
    verticalPadding: Dp = 8.dp,
) {

    Row(
        modifier = modifier
            .padding(vertical = verticalPadding),
         verticalAlignment = Alignment.CenterVertically,
    ) {

        Icon(
            modifier = Modifier
                .size(19.dp),
            imageVector = icon,
            contentDescription = null,
            tint = colors.icon
        )
        Spacer(modifier = Modifier.size(12.dp))
        Text(
            modifier = modifier,
            text = counter,
            fontFamily = quickSandFamily,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = colors.text,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Spacer(modifier = Modifier.size(4.dp))
        Text(
            modifier = modifier,
            text = detail,
            fontFamily = quickSandFamily,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
            color = colors.text.copy(alpha = 0.6f),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }

}

@Composable
fun InfoTag(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    colors: InfoTagColors = InfoTagColors(),
    distance: String = "5 mil",
    verticalPadding: Dp = 12.dp,
) {

    Row(
        modifier = modifier
            .padding(vertical = verticalPadding),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        Icon(
            modifier = Modifier
                .size(19.dp),
            imageVector = icon,
            contentDescription = null,
            tint = colors.icon
        )

        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = distance,
            fontFamily = quickSandFamily,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            color = colors.text,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,

        )
    }

}

@Composable
@Preview
fun InfoTagPreview() {
    InfoTag(
        icon = ImageVector.vectorResource(id = R.drawable.ic_fill_hand),
        counter = 5_2334.formatNumber(),
        detail = "Votes"
    )
}

@Composable
@Preview
fun InfoTagDistancePreview() {
    InfoTag(
        icon = ImageVector.vectorResource(id = R.drawable.ic_fill_hand),
        distance = "5 mil",
    )
}

@Composable
@Preview(widthDp = 411)
fun InfoTagMultiplePreview() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        InfoTag(
            icon = ImageVector.vectorResource(id = R.drawable.ic_fill_hand),
            counter = 5_2334.formatWithCommas(),
            detail = "Votes"
        )
        InfoTag(
            icon = ImageVector.vectorResource(id = R.drawable.ic_fill_start),
            counter = "3.8",
            detail = "(${5_345.formatNumber()} reviews)",
            colors = InfoTagColors(
                icon = SpecialYellow
            )
        )
        InfoTag(
            icon = ImageVector.vectorResource(id = R.drawable.ic_fill_route),
            distance = "5 mil",
        )
    }
}

