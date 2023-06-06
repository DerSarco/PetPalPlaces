package com.dersarco.petpalplaces.domain.usecase

import androidx.activity.ComponentActivity
import com.dersarco.petpalplaces.domain.utils.AppwriteConst
import io.appwrite.Client
import io.appwrite.exceptions.AppwriteException
import io.appwrite.services.Account

class RegisterFacebookUserUseCase(
    private val client: Client,
) {
    suspend operator fun invoke(activity: ComponentActivity) {
        try {
            val account = Account(client)
            account.createOAuth2Session(
                provider = "facebook",
                activity = activity,
                success = AppwriteConst.SUCCESS,
                failure = AppwriteConst.FAILURE
            )
        } catch (e: Exception) {
            e.printStackTrace()
        } catch (e: AppwriteException) {
            e.printStackTrace()
        }
    }
}
