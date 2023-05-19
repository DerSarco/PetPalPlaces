package com.dersarco.petpalplaces.ui.screens.preview.events

sealed class PlacePreviewEvent {
    class CurrentId(val id: Int) : PlacePreviewEvent()
    object Like : PlacePreviewEvent()
    object Dislike : PlacePreviewEvent()
    object Close : PlacePreviewEvent()
    object SavePlace : PlacePreviewEvent()
    object UnsavePlace : PlacePreviewEvent()
}