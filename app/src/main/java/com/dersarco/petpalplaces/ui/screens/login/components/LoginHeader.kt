package com.dersarco.petpalplaces.ui.screens.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.theme.SpecialPurple

@Composable
fun LoginHeader(
    paddingValues: PaddingValues
) {

    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxWidth()
            .padding(top = 48.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Image(
            modifier = Modifier.size(96.dp),
            imageVector = ImageVector.vectorResource(id = R.drawable.logo),
            contentDescription = "Logo",
            contentScale = ContentScale.Fit
        )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LoginHeaderPrev() {
    Scaffold(
        containerColor = SpecialPurple
    ) { padding ->
        LoginHeader(padding)
    }
}