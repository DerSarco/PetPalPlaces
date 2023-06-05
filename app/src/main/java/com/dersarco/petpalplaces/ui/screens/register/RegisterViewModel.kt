package com.dersarco.petpalplaces.ui.screens.register

import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dersarco.petpalplaces.domain.usecase.RegisterUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val registerUserUseCase: RegisterUserUseCase
) : ViewModel() {

    fun registerUser(activity: ComponentActivity) {
        viewModelScope.launch(Dispatchers.Main) {
            registerUserUseCase(activity)
        }
    }
}