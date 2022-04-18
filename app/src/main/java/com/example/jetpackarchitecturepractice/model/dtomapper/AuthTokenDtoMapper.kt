package com.example.jetpackarchitecturepractice.model.dtomapper

import com.example.jetpackarchitecturepractice.model.DtoMapper
import com.example.jetpackarchitecturepractice.model.dto.AuthTokenDTO
import com.example.jetpackarchitecturepractice.model.entity.AuthToken

class AuthTokenDtoMapper : DtoMapper<AuthTokenDTO, AuthToken> {
    override fun mapDtoToEntity(dto: AuthTokenDTO): AuthToken {
        return AuthToken(
            account_pk = dto.account_pk,
            token = dto.token
        )
    }

    override fun mapEntityToDto(entity: AuthToken): AuthTokenDTO {
        return AuthTokenDTO(
            account_pk = entity.account_pk,
            token = entity.token
        )
    }
}