package com.dersarco.petpalplaces.ui.screens.home.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.core.routes.AppRoutes
import mx.erix.specialbottombarnav.components.SpecialBottomBar
import mx.erix.specialbottombarnav.components.SpecialBottomBarPlus
import mx.erix.specialbottombarnav.data.SpecialBottom

@Composable
fun BottomBarPlus(
    currentSelected: SpecialBottom.Id = SpecialBottom.Id("explore"),
    onItemSelected: (SpecialBottom.Id) -> Unit
) {

    val bottomBarTheme = SpecialBottom.Theme(
        //Shadow
        shadowColor = MaterialTheme.colorScheme.onBackground,
        backgroundColor = MaterialTheme.colorScheme.background,

        //Item
        selectedColor = MaterialTheme.colorScheme.primary,
        unselectedColor = MaterialTheme.colorScheme.onBackground,

        //
        iconPlus = R.drawable.ic_plus_add,
        backGroundSecondaryColor = MaterialTheme.colorScheme.secondary,
    )

    SpecialBottomBarPlus(
        theme = bottomBarTheme,
        menuItems = listOf(
            SpecialBottom.Item(
                icon = R.drawable.ic_outline_explore,
                activatedIcon = R.drawable.ic_fill_explore,
                tag = "Explore",
                id = SpecialBottom.Id(AppRoutes.Feed().route),
            ),

            SpecialBottom.Item(
                icon = R.drawable.ic_outline_post,
                activatedIcon = R.drawable.ic_fill_post,
                tag = "Post",
                id = SpecialBottom.Id(AppRoutes.Post().route),
            ),
            SpecialBottom.Item(
                icon = R.drawable.ic_outline_favorite,
                activatedIcon = R.drawable.ic_fill_favorite,
                tag = "Favorite",
                id = SpecialBottom.Id(AppRoutes.Favorites().route),
            ),
            SpecialBottom.Item(
                icon = R.drawable.ic_outline_profile,
                activatedIcon = R.drawable.ic_fill_profile,
                tag = "Profile",
                id = SpecialBottom.Id(AppRoutes.Profile().route),
            )
        ),
        currentSelected = currentSelected,
        onItemSelected = onItemSelected,

        )
}

@Preview
@Composable
fun BottomAppBarPlusDefaultsPreview() {
    BottomBarPlus(
        currentSelected = SpecialBottom.Id("explore"),
        onItemSelected = {}
    )
}