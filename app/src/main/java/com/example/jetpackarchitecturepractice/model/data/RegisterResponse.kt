package com.example.jetpackarchitecturepractice.model.data

data class RegisterResponse(
    var response: String,
    var errorMessage: String,
    var email: String,
    var username: String,
    var pk: Int,
    var token: String
)