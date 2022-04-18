package com.example.jetpackarchitecturepractice.ui.auth

import com.example.jetpackarchitecturepractice.domain.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject
constructor(authRepository: AuthRepository) {
}