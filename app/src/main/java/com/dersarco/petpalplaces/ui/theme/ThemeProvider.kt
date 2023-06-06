package com.dersarco.petpalplaces.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import com.dersarco.petpalplaces.ui.theme.ThemeColor.Companion.THEME_BLACK
import com.dersarco.petpalplaces.ui.theme.ThemeColor.Companion.THEME_DARK

data class ThemeColor(
    val id: Int = THEME_LIGHT,
    val isDark: Boolean = false,
    val theme: ColorScheme = lightColorScheme(
        primary = Color(0xFFBE6BFD),
        secondary = Color(0xFFAC48F5),
        surface = Color(0xFFB2A7B8),
        background = Color(0xFFFFFFFF),
        onBackground = Color(0xFF201925),
    )
) {
    companion object {
        const val THEME_LIGHT   = 0
        const val THEME_DARK    = 1
        const val THEME_BLACK   = 2
    }
}


val themeList = listOf(
    ThemeColor(),
    ThemeColor(
        id = THEME_DARK,
        isDark = true,
        theme = darkColorScheme(
            primary = Color(0xFFBE6BFD),
            secondary = Color(0xFFAC48F5),
            surface = Color(0xFFB2A7B8),
            background = Color(0xFFFFFFFF),
            onBackground = Color(0xFF201925),
        )
    ),
    ThemeColor(
        id = THEME_BLACK,
        isDark = true,
        theme = darkColorScheme(
            primary = Color(0xFFBE6BFD),
            secondary = Color(0xFFAC48F5),
            surface = Color(0xFF71767F),
            background = Color(0xFF000000),
            onBackground = Color(0xFFFFFFFF),
        )
    ),
)