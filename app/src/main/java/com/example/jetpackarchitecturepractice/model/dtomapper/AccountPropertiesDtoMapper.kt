package com.example.jetpackarchitecturepractice.model.dtomapper

import com.example.jetpackarchitecturepractice.model.DtoMapper
import com.example.jetpackarchitecturepractice.model.data.AccountProperties

class AccountPropertiesDtoMapper : DtoMapper<AccountPropertiesDTO, AccountProperties> {
    override fun mapDtoToEntity(dto: AccountPropertiesDTO): AccountProperties {
        return AccountProperties(
            pk = dto.pk,
            email = dto.email,
            username = dto.username
        )
    }

    override fun mapEntityToDto(domainModel: AccountProperties): AccountPropertiesDTO {
        return AccountPropertiesDTO(
            pk = domainModel.pk,
            email = domainModel.email,
            username = domainModel.username
        )
    }
}