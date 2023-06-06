package com.dersarco.petpalplaces.domain.usecase.entity

data class PlaceReview(
    val placeId: String,
    val comment: String,
    val vote: Int
)
