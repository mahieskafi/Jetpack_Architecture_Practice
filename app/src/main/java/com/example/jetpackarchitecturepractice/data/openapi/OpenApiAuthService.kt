package com.example.jetpackarchitecturepractice.data.openapi

import androidx.lifecycle.LiveData
import com.example.jetpackarchitecturepractice.data.dto.network.LoginResponseDTO
import com.example.jetpackarchitecturepractice.data.dto.network.RegisterResponseDTO
import com.example.jetpackarchitecturepractice.data.openapi.network.GenericApiResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface OpenApiAuthService {
    @POST("account/login")
    @FormUrlEncoded
    fun login(
        @Field("username") email: String,
        @Field("password") password: String
    ): LiveData<GenericApiResponse<LoginResponseDTO>>

    @POST("account/register")
    @FormUrlEncoded
    fun register(
        @Field("email") email: String,
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("password2") password2: String
    ): LiveData<GenericApiResponse<RegisterResponseDTO>>

}