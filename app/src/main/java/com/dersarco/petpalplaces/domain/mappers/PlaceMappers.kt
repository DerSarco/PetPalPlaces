package com.dersarco.petpalplaces.domain.mappers

import com.dersarco.petpalplaces.data.remote.entity.PlaceDTO
import com.dersarco.petpalplaces.data.remote.entity.PlaceReviewDTO
import com.dersarco.petpalplaces.data.remote.entity.UserFavoriteDTO
import com.dersarco.petpalplaces.domain.usecase.entity.Place
import com.dersarco.petpalplaces.domain.usecase.entity.PlaceFavorites
import com.dersarco.petpalplaces.domain.usecase.entity.PlaceReview


fun Place.toPlaceDTO() = PlaceDTO(
    address = this.address,
    description = this.description,
    placeName = this.placeName,
    imageRef = this.imageRef,
    ownerUser = this.ownerUser,
    votes = this.votes
)

fun PlaceReview.toPlaceReviewDTO() = PlaceReviewDTO(
    placeId = this.placeId,
    vote = this.vote,
    comment = this.comment
)

fun PlaceFavorites.toUserFavoriteDTO() = UserFavoriteDTO(
    placeId = this.placeId,
    userId = this.userId
)