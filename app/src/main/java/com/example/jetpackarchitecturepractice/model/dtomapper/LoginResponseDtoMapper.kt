package com.example.jetpackarchitecturepractice.model.dtomapper

import com.example.jetpackarchitecturepractice.data.dto.network.LoginResponseDTO
import com.example.jetpackarchitecturepractice.model.DtoMapper
import com.example.jetpackarchitecturepractice.model.data.LoginResponse

class LoginResponseDtoMapper : DtoMapper<LoginResponseDTO, LoginResponse> {
    override fun mapDtoToEntity(dto: LoginResponseDTO): LoginResponse {
        return LoginResponse(
            response = dto.response,
            errorMessage = dto.errorMessage,
            token = dto.token,
            pk = dto.pk,
            email = dto.email
        )
    }

    override fun mapEntityToDto(domainModel: LoginResponse): LoginResponseDTO {
        return LoginResponseDTO(
            response = domainModel.response,
            errorMessage = domainModel.errorMessage,
            token = domainModel.token,
            pk = domainModel.pk,
            email = domainModel.email
        )
    }
}