package com.dersarco.petpalplaces.domain.usecase

import com.dersarco.petpalplaces.domain.AppWriteResponse
import com.dersarco.petpalplaces.domain.utils.AppwriteConst
import io.appwrite.Client
import io.appwrite.Query
import io.appwrite.exceptions.AppwriteException
import io.appwrite.models.DocumentList
import io.appwrite.services.Databases

class GetPlaceReviewsUseCase(
    private val client: Client
) {

    suspend operator fun invoke(placeId: String): AppWriteResponse<DocumentList>{
        return try {
            val databases = Databases(client)
            val documents = databases.listDocuments(
                databaseId = AppwriteConst.DATABASE_ID,
                collectionId = AppwriteConst.COLLECTION_PLACE_REVIEW_ID,
                queries = listOf(
                    Query.equal("placeId", placeId)
                )
            )
            AppWriteResponse.Success(documents)
        } catch (e: AppwriteException) {
            AppWriteResponse.Error(e.response.toString(), e.code ?: 0)
        }
    }
}