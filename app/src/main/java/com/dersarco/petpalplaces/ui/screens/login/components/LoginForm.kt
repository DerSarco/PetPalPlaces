package com.dersarco.petpalplaces.ui.screens.login.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginForm(paddingValues: PaddingValues) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 48.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "Welcome Back",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Black
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LoginFormPreview() {
    Scaffold { padding ->
        LoginForm(padding)
    }
}