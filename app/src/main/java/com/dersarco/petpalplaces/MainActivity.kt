package com.dersarco.petpalplaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import com.dersarco.petpalplaces.ui.screens.login.LoginScreen
import com.dersarco.petpalplaces.ui.screens.preview.PreviewScreen
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme
import com.dersarco.petpalplaces.ui.theme.SpecialBlack

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetPalPlacesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    //LoginScreen()
                    PreviewScreen()
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PetPalPlacesTheme {
        LoginScreen()
    }
}