package com.dersarco.petpalplaces.ui.screens.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.ui.screens.login.components.LoginForm
import com.dersarco.petpalplaces.ui.screens.login.components.LoginHeader
import com.dersarco.petpalplaces.ui.theme.SpecialPurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Scaffold(
        containerColor = SpecialPurple
    ) { padding ->
        Column(modifier = Modifier.fillMaxSize()) {
            LoginHeader(padding)
            Spacer(modifier = Modifier.height(48.dp))
            LoginForm(padding)
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}