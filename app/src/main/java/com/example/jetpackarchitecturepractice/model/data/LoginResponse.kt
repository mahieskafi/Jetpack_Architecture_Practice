package com.example.jetpackarchitecturepractice.model.data

data class LoginResponse(
    var response: String,
    var errorMessage: String,
    var token: String,
    var pk: Int,
    var email: String
)