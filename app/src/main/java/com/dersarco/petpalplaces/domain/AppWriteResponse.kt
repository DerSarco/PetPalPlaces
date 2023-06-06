package com.dersarco.petpalplaces.domain

sealed class AppWriteResponse<T: Any> {
    data class Success<T: Any>(val data: T): AppWriteResponse<T>()
    data class Error<T: Any>(val error: String, val code: Int): AppWriteResponse<T>()
}
