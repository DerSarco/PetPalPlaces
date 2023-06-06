package com.dersarco.petpalplaces.domain.usecase

import com.dersarco.petpalplaces.domain.AppWriteResponse
import com.dersarco.petpalplaces.domain.usecase.entity.Place
import com.dersarco.petpalplaces.domain.mappers.toPlaceDTO
import com.dersarco.petpalplaces.domain.utils.AppwriteConst
import io.appwrite.Client
import io.appwrite.ID
import io.appwrite.exceptions.AppwriteException
import io.appwrite.models.Document
import io.appwrite.services.Databases

class InsertNewPlaceUseCase(
    private val client: Client
) {

    suspend operator fun invoke(place: Place): AppWriteResponse<Document> {
        return try {
            val databases = Databases(client)
            val response = databases.createDocument(
                databaseId = AppwriteConst.DATABASE_ID,
                collectionId = AppwriteConst.COLLECTION_PLACE_ID,
                documentId = ID.unique(),
                data = place.toPlaceDTO()
            )
            AppWriteResponse.Success(response)
        } catch (e: AppwriteException) {
            AppWriteResponse.Error(e.response.toString(), e.code ?: 0)
        }
    }
}