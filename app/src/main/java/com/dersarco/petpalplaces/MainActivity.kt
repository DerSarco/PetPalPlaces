package com.dersarco.petpalplaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dersarco.petpalplaces.ui.screens.home.HomeScreen
import com.dersarco.petpalplaces.ui.screens.login.LoginScreen
import com.dersarco.petpalplaces.ui.screens.post.PostScreen
import com.dersarco.petpalplaces.ui.screens.preview.PlacePreviewActivity
import com.dersarco.petpalplaces.ui.theme.PetPalPlacesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                //LoginScreen()
                //startActivity(PlacePreviewActivity.create(this))
                //PostScreen()

                //SpecialBottomBarAdd()
                HomeScreen()

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