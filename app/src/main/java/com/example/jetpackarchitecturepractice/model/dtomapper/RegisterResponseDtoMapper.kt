package com.example.jetpackarchitecturepractice.model.dtomapper

import com.example.jetpackarchitecturepractice.data.dto.network.RegisterResponseDTO
import com.example.jetpackarchitecturepractice.model.DtoMapper
import com.example.jetpackarchitecturepractice.model.data.RegisterResponse

class RegisterResponseDtoMapper : DtoMapper<RegisterResponseDTO, RegisterResponse> {
    override fun mapDtoToEntity(dto: RegisterResponseDTO): RegisterResponse {
        return RegisterResponse(
            response = dto.response,
            errorMessage = dto.errorMessage,
            email = dto.email,
            username = dto.username,
            pk = dto.pk,
            token = dto.token
        )
    }

    override fun mapEntityToDto(domainModel: RegisterResponse): RegisterResponseDTO {
        return RegisterResponseDTO(
            response = domainModel.response,
            errorMessage = domainModel.errorMessage,
            email = domainModel.email,
            username = domainModel.username,
            pk = domainModel.pk,
            token = domainModel.token
        )
    }
}