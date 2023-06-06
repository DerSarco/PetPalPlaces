package com.dersarco.petpalplaces.domain.usecase.entity

data class Place(
    val ownerUser: String,
    val placeName: String,
    val address: String,
    val description: String,
    val imageRef: List<String>,
    val votes: Int
)
