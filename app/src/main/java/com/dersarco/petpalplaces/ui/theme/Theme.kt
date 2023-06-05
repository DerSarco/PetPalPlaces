package com.dersarco.petpalplaces.ui.theme

import android.app.Activity
import android.os.Build
import android.util.Log
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = SpecialPurple,
    onBackground = SpecialWhite,
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,
    background = SpecialPurple,
    onBackground = SpecialWhite,


    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun PetPalPlacesTheme(
    id: Int = ThemeColor.THEME_LIGHT,
    content: @Composable () -> Unit
) {

    val colorScheme = themeList.find { it.id == id } ?: ThemeColor()

    val view = LocalView.current
    val systemUiController = rememberSystemUiController()

    if (!view.isInEditMode) {
        SideEffect {
            systemUiController.setSystemBarsColor(
                color = colorScheme.theme.background,
                darkIcons = !colorScheme.isDark
            )
            val colorStatusBar = if (id == ThemeColor.THEME_LIGHT) colorScheme.theme.primary.toArgb() else colorScheme.theme.background.toArgb()
            val window = (view.context as Activity).window
            window.statusBarColor = colorStatusBar
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = colorScheme.isDark
        }
    }

    MaterialTheme(
        colorScheme = colorScheme.theme,
        typography = Typography,
        content = content
    )
}