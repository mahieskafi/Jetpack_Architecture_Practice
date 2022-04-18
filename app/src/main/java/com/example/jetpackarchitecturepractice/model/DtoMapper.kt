package com.example.jetpackarchitecturepractice.model

interface DtoMapper<DTO, DomainModel> {

    fun mapDtoToEntity(dto: DTO): DomainModel
    fun mapEntityToDto(domainModel: DomainModel): DTO
}