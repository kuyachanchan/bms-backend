package com.example.sample_bms.resident.infrastructure.persistence.mapper;

import org.mapstruct.Mapper;

import com.example.sample_bms.resident.domain.entity.Household;
import com.example.sample_bms.resident.domain.entity.Resident;

@Mapper(componentModel = "spring")
public interface ResidentMapper {
    Resident toResidentDomain(
            com.example.sample_bms.resident.infrastructure.persistence.entity.Resident entity);

    com.example.sample_bms.resident.infrastructure.persistence.entity.Resident toResidentEntity(Resident domain);

    Household toHouseholdDomain(
            com.example.sample_bms.resident.infrastructure.persistence.entity.Household entity);

    com.example.sample_bms.resident.infrastructure.persistence.entity.Household toHouseholdEntity(Household domain);
}
