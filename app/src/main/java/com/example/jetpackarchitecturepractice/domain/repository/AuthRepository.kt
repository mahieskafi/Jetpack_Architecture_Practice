package com.example.jetpackarchitecturepractice.domain.repository

import com.example.jetpackarchitecturepractice.data.openapi.OpenApiAuthService
import com.example.jetpackarchitecturepractice.data.persistence.AccountPropertiesDao
import com.example.jetpackarchitecturepractice.data.persistence.AuthTokenDao
import com.example.jetpackarchitecturepractice.domain.session.SessionManager
import javax.inject.Inject

class AuthRepository @Inject
constructor(
    authTokenDao: AuthTokenDao,
    accountPropertiesDao: AccountPropertiesDao,
    openApiAuthService: OpenApiAuthService,
    sessionManager: SessionManager
){
}