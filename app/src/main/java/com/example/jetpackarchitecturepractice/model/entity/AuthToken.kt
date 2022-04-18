package com.example.jetpackarchitecturepractice.model.entity


data class AuthToken(
    var account_pk: Int? = -1,
    var token: String? = null
)
