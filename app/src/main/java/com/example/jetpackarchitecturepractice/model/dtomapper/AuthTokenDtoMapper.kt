package com.example.jetpackarchitecturepractice.model.dtomapper

import com.example.jetpackarchitecturepractice.model.DtoMapper
import com.example.jetpackarchitecturepractice.data.dto.cach.AuthTokenDTO
import com.example.jetpackarchitecturepractice.model.data.AuthToken

class AuthTokenDtoMapper : DtoMapper<AuthTokenDTO, AuthToken> {
    override fun mapDtoToEntity(dto: AuthTokenDTO): AuthToken {
        return AuthToken(
            account_pk = dto.account_pk,
            token = dto.token
        )
    }

    override fun mapEntityToDto(domainModel: AuthToken): AuthTokenDTO {
        return AuthTokenDTO(
            account_pk = domainModel.account_pk,
            token = domainModel.token
        )
    }
}