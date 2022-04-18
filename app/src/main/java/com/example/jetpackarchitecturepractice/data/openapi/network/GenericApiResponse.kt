package com.example.jetpackarchitecturepractice.data.openapi.network

import retrofit2.Response

sealed class GenericApiResponse<T> {
    class ApiEmptyResponse<T> : GenericApiResponse<T>()

    data class ApiSuccessResponse<T>(val body: T) : GenericApiResponse<T>()

    data class ApiErrorResponse<T>(val message: String) : GenericApiResponse<T>()


    companion object {
        fun <T> create(throwable: Throwable): ApiErrorResponse<T> {
            return ApiErrorResponse(
                message = throwable.message ?: "Unknown Error"
            )
        }

        fun <T> create(response: Response<T>): GenericApiResponse<T> {
            if (response.isSuccessful) {
                val body = response.body()
                return if (body == null || response.code() == 204) {
                    ApiEmptyResponse()
                } else if (response.code() == 401) {
                    ApiErrorResponse("401 Unauthorized. Token may be invalid.")
                } else {
                    ApiSuccessResponse(body = body)
                }
            } else {
                val msg = response.errorBody()?.string()
                val errorMsg = if (msg.isNullOrEmpty()) {
                    response.message()
                } else {
                    msg
                }
                return ApiErrorResponse(
                    errorMsg ?: "unknown error"
                )
            }
        }
    }
}
