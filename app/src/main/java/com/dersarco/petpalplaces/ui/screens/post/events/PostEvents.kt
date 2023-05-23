package com.dersarco.petpalplaces.ui.screens.post.events

sealed class PostEvents {
    class OnShowShadowBar(val showShadowBar: Boolean) : PostEvents()
}
