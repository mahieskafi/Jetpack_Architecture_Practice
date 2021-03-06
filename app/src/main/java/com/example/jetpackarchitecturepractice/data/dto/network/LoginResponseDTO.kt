package com.example.jetpackarchitecturepractice.data.dto.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LoginResponseDTO(
    @SerializedName("response")
    @Expose
    var response: String,

    @SerializedName("error_message")
    @Expose
    var errorMessage: String,

    @SerializedName("token")
    @Expose
    var token: String,

    @SerializedName("pk")
    @Expose
    var pk: Int,

    @SerializedName("email")
    @Expose
    var email: String
)
