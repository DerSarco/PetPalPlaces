package com.dersarco.petpalplaces.data.remote.entity

data class PlaceDTO(
    val ownerUser: String,
    val placeName: String,
    val address: String,
    val description: String,
    val imageRef: List<String>,
    val votes: Int
)
