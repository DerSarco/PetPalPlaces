package com.dersarco.petpalplaces.ui.screens.register

import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.screens.components.Header
import com.dersarco.petpalplaces.ui.screens.components.LogoImage
import com.dersarco.petpalplaces.ui.screens.register.components.RegisterForm
import com.dersarco.petpalplaces.ui.theme.SpecialPurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(
    viewModel: RegisterViewModel = hiltViewModel()
) {

    val context = LocalContext.current
    Scaffold(
        containerColor = SpecialPurple
    ) { padding ->
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                modifier = Modifier.matchParentSize(),
                painter = painterResource(id = R.drawable.background),
                contentDescription = "Background",
                contentScale = ContentScale.FillBounds
            )
            Column(modifier = Modifier.fillMaxSize()) {
                Header(padding) {
                    LogoImage(logo = R.drawable.logo)
                }
                RegisterForm(padding) {
                    viewModel.registerGoogleUser(context as ComponentActivity)
                }
            }
        }
    }
}

@Preview
@Composable
fun RegisterScreenPreview() {
    RegisterScreen()
}