package com.example.jetpackarchitecturepractice.model

interface DtoMapper<DTO, ENTITY> {

    fun mapDtoToEntity(dto: DTO): ENTITY
    fun mapEntityToDto(entity: ENTITY): DTO
}