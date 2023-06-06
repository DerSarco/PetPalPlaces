package com.dersarco.petpalplaces.domain.usecase

import com.dersarco.petpalplaces.domain.AppWriteResponse
import com.dersarco.petpalplaces.domain.utils.AppwriteConst
import io.appwrite.Client
import io.appwrite.Query
import io.appwrite.exceptions.AppwriteException
import io.appwrite.models.DocumentList
import io.appwrite.services.Databases

class AddUserFavoriteUseCase(
    private val client: Client
) {

    suspend operator fun invoke(userId: String): AppWriteResponse<DocumentList>{
        return try {
            val databases = Databases(client)
            val documents = databases.listDocuments(
                databaseId = AppwriteConst.DATABASE_ID,
                collectionId = AppwriteConst.COLLECTION_USER_FAVORITES_ID,
                queries = listOf(
                    Query.equal("userId", userId)
                )
            )
            AppWriteResponse.Success(documents)
        } catch (e: AppwriteException) {
            AppWriteResponse.Error(e.response.toString(), e.code ?: 0)
        }
    }
}