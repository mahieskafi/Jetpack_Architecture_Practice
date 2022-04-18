package com.example.jetpackarchitecturepractice.model.dtomapper

import com.example.jetpackarchitecturepractice.model.DtoMapper
import com.example.jetpackarchitecturepractice.model.dto.AccountPropertiesDTO
import com.example.jetpackarchitecturepractice.model.entity.AccountProperties

class AccountPropertiesDtoMapper : DtoMapper<AccountPropertiesDTO, AccountProperties> {
    override fun mapDtoToEntity(dto: AccountPropertiesDTO): AccountProperties {
        return AccountProperties(
            pk = dto.pk,
            email = dto.email,
            username = dto.username
        )
    }

    override fun mapEntityToDto(entity: AccountProperties): AccountPropertiesDTO {
        return AccountPropertiesDTO(
            pk = entity.pk,
            email = entity.email,
            username = entity.username
        )
    }
}