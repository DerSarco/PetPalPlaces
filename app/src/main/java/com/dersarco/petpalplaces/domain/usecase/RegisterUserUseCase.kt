package com.dersarco.petpalplaces.domain.usecase

import androidx.activity.ComponentActivity
import io.appwrite.Client
import io.appwrite.exceptions.AppwriteException
import io.appwrite.services.Account

class RegisterUserUseCase(
    private val client: Client,
) {
    suspend operator fun invoke(activity: ComponentActivity) {
        try {
            val account = Account(client)
            account.createOAuth2Session(
                provider = "facebook",
                activity = activity,
                success = SUCCESS,
                failure = FAILURE
            )
        } catch (e: Exception) {
            e.printStackTrace()
        } catch (e: AppwriteException) {
            e.printStackTrace()
        }
    }
}

private const val SUCCESS =
    "appwrite-callback-6464eeabe592f858144b://cloud.appwrite.io/auth/oauth2/success"
private const val FAILURE =
    "appwrite-callback-6464eeabe592f858144b://cloud.appwrite.io/auth/oauth2/failure"