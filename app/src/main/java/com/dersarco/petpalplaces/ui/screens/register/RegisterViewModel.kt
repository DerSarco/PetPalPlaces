package com.dersarco.petpalplaces.ui.screens.register

import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dersarco.petpalplaces.domain.usecase.RegisterFacebookUserUseCase
import com.dersarco.petpalplaces.domain.usecase.RegisterGoogleUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val registerFacebookUserUseCase: RegisterFacebookUserUseCase,
    private val registerGoogleUserUseCase: RegisterGoogleUserUseCase
) : ViewModel() {

    fun registerFacebookUser(activity: ComponentActivity) {
        viewModelScope.launch(Dispatchers.Main) {
            registerFacebookUserUseCase(activity)
        }
    }

    fun registerGoogleUser(activity: ComponentActivity) {
        viewModelScope.launch(Dispatchers.Main) {
            registerGoogleUserUseCase(activity)
        }
    }
}