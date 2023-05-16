package com.dersarco.petpalplaces.ui.screens.login.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dersarco.petpalplaces.R
import com.dersarco.petpalplaces.ui.theme.SpecialGray
import com.dersarco.petpalplaces.ui.theme.quickSandFamily

@Composable
fun LoginFormFooter() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    ) {
        Divider(
            Modifier
                .padding(horizontal = 16.dp)
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
        Text(
            text = "or",
            fontFamily = quickSandFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = SpecialGray
        )
        Divider(
            Modifier
                .padding(horizontal = 16.dp)
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
    Spacer(modifier = Modifier.height(16.dp))
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        MyOutlinedButton(onClick = { }, buttonText = "Google", icon = R.drawable.google)
        MyOutlinedButton(onClick = { }, buttonText = "Facebook", icon = R.drawable.facebook)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LoginFormPrev() {
    Scaffold {
        LoginForm(it)
    }
}

@Preview
@Composable
fun LoginFormFooterPrev() {
    LoginFormFooter()
}