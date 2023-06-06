package com.dersarco.petpalplaces.data.remote.entity

data class PlaceReviewDTO(
    val placeId: String,
    val vote: Int,
    val comment: String,
)
