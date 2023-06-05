package com.dersarco.petpalplaces.ui.screens.register.components

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dersarco.petpalplaces.ui.screens.components.MyClickableText
import com.dersarco.petpalplaces.ui.screens.components.MyElevatedButton
import com.dersarco.petpalplaces.ui.screens.login.components.LoginFormFooter
import com.dersarco.petpalplaces.ui.screens.login.components.MyOutlinedLoginText
import com.dersarco.petpalplaces.ui.theme.quickSandFamily

@Composable
fun RegisterForm(
    paddingValues: PaddingValues,
    onRegisterClick: () -> Unit
) {
    // TODO: Add the state for the register credentials
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp)
                .padding(horizontal = 16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray
            )
        ) {}
        Card(
            modifier = Modifier
                .padding(top = 48.dp)
                .fillMaxSize(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.height(48.dp))
                Text(
                    text = "Create an account",
                    fontFamily = quickSandFamily,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                MyClickableText(text = "Already a member?", clickableText = "Login")
                Spacer(modifier = Modifier.height(48.dp))
                MyOutlinedLoginText(onValueChanged = { Log.d("written", it) },
                    placeholderText = "Enter Your Username",
                    onIconPressed = {})
                Spacer(modifier = Modifier.height(16.dp))
                MyOutlinedLoginText(
                    onValueChanged = { Log.d("written", it) },
                    placeholderText = "Enter Your Password",
                    onIconPressed = {},
                    isPassword = true,
                    isVisible = false,
                    hasIcon = true,
                )
                Spacer(modifier = Modifier.height(16.dp))
                MyOutlinedLoginText(
                    onValueChanged = { Log.d("written", it) },
                    placeholderText = "Confirm your password",
                    onIconPressed = {},
                    isPassword = true,
                    isVisible = false,
                    hasIcon = true,
                )
                Spacer(modifier = Modifier.height(12.dp))
                Spacer(modifier = Modifier.height(16.dp))
                Spacer(modifier = Modifier.height(96.dp))
                MyElevatedButton(text = "SIGN UP") {
                    onRegisterClick()
                }
                Spacer(modifier = Modifier.height(24.dp))
                LoginFormFooter()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun RegisterFormPreview() {
    Scaffold { padding ->
        RegisterForm(padding){}
    }
}