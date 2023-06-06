package com.dersarco.petpalplaces.domain.usecase

import androidx.activity.ComponentActivity
import com.dersarco.petpalplaces.domain.AppWriteResponse
import com.dersarco.petpalplaces.domain.utils.AppwriteConst
import io.appwrite.Client
import io.appwrite.exceptions.AppwriteException
import io.appwrite.services.Account
import io.appwrite.models.Account as AccountModel


class RegisterGoogleUserUseCase(
    private val client: Client,
) {
    suspend operator fun invoke(activity: ComponentActivity): AppWriteResponse<AccountModel> {
        return try {
            val account = Account(client)
            account.createOAuth2Session(
                provider = "google",
                activity = activity,
                success = AppwriteConst.SUCCESS,
                failure = AppwriteConst.FAILURE
            )
            AppWriteResponse.Success(account.get())
        } catch (e: Exception) {
            e.printStackTrace()
            AppWriteResponse.Error(e.message.toString(), 9999)

        } catch (e: AppwriteException) {
            e.printStackTrace()
            AppWriteResponse.Error(e.message!!, e.code!!)
        }
    }
}
