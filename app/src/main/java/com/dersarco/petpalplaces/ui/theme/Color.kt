package com.dersarco.petpalplaces.ui.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


val SpecialPurple = Color(0xFFBF6CFE)
val SpecialGray = Color(0xFFB2A7B8)
val SpecialBlack = Color(0xFF201925)

val SpecialSolitude = Color(0xFFEBE4F2)
val SpecialImageBoxBg = Color(0xFFf4f4f4)
val SpecialStarColor = Color(0xFFFFC107)

val SpecialWhite = Color(0xFFFDFDFD)
val SpecialRed = Color(0xFFF54848)
val SpecialYellow = Color(0xFFFFC107)


data class CustomButtonColors(
    val background: Color = SpecialBlack,
    val border: Color = SpecialBlack,
    val icon: Color = SpecialWhite,
)

data class InfoTagColors(
    val icon: Color = SpecialPurple,
    val text: Color = SpecialWhite,
    val detail: Color = SpecialGray,
)

data class DotIndicatorColors(
    val selected: Color = SpecialWhite,
    val unselected: Color = SpecialWhite.copy(alpha = 0.4f),
)