package com.dersarco.petpalplaces.di

import com.dersarco.petpalplaces.domain.usecase.InsertNewPlaceUseCase
import com.dersarco.petpalplaces.domain.usecase.RegisterFacebookUserUseCase
import com.dersarco.petpalplaces.domain.usecase.RegisterGoogleUserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import io.appwrite.Client

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    @ViewModelScoped
    fun provideRegisterGoogleUserUseCase(client: Client) = RegisterGoogleUserUseCase(client)

    @Provides
    @ViewModelScoped
    fun provideRegisterFacebookUserUseCase(client: Client) = RegisterFacebookUserUseCase(client)

    @Provides
    @ViewModelScoped
    fun provideInsertNewPlaceUseCase(client: Client) = InsertNewPlaceUseCase(client)

}