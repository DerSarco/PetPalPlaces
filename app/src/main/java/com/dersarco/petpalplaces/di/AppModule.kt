package com.dersarco.petpalplaces.di

import android.content.Context
import com.dersarco.petpalplaces.data.remote.AppWrite
import com.dersarco.petpalplaces.domain.usecase.RegisterUserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.appwrite.Client
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppWriteClient(@ApplicationContext context: Context) = AppWrite.createClient(context)


    @Provides
    @Singleton
    fun provideRegisterUserUseCase(client: Client) = RegisterUserUseCase(client)

}