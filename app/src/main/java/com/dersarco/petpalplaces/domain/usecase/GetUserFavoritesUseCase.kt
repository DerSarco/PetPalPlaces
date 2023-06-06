package com.dersarco.petpalplaces.domain.usecase

import com.dersarco.petpalplaces.domain.AppWriteResponse
import com.dersarco.petpalplaces.domain.usecase.entity.PlaceFavorites
import com.dersarco.petpalplaces.domain.mappers.toUserFavoriteDTO
import com.dersarco.petpalplaces.domain.utils.AppwriteConst
import io.appwrite.Client
import io.appwrite.ID
import io.appwrite.exceptions.AppwriteException
import io.appwrite.models.Document
import io.appwrite.services.Databases

class GetUserFavoritesUseCase(
    private val client: Client
) {

    suspend operator fun invoke(placeFavorites: PlaceFavorites): AppWriteResponse<Document> {
        return try {
            val databases = Databases(client)
            val result = databases.createDocument(
                databaseId = AppwriteConst.DATABASE_ID,
                collectionId = AppwriteConst.COLLECTION_USER_FAVORITES_ID,
                documentId = ID.unique(),
                data = placeFavorites.toUserFavoriteDTO()
            )
            AppWriteResponse.Success(result)
        } catch (e: AppwriteException) {
            AppWriteResponse.Error(e.response.toString(), e.code ?: 0)
        }
    }
}