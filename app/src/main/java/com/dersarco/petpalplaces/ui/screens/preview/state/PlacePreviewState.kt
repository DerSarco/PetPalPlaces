package com.dersarco.petpalplaces.ui.screens.preview.state

data class PlacePreviewState(
    val images: List<String> = listOf(),
    val reviewTitle : String = "",
    val reviewDescription : String = "",

    val votes : Int = 0,
    val reviewRating : Float = 0f,
    val reviewCount : Int = 0,
    val reviewAuthor : String = "",
    val distance : String = "",

    val isSaved : Boolean = false,
    val isLiked : Boolean = false,
)