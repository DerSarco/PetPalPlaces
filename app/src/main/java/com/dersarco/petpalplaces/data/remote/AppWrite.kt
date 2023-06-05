package com.dersarco.petpalplaces.data.remote

import android.content.Context
import io.appwrite.Client

object AppWrite {

    fun createClient(context: Context): Client {
        return Client(context)
            .setEndpoint("https://cloud.appwrite.io/v1")
            .setProject(PROJECT_ID)
            .setSelfSigned(status = true)
    }
}

private const val PROJECT_ID = "6464eeabe592f858144b"