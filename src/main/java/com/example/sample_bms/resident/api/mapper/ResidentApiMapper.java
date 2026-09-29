package com.example.sample_bms.resident.api.mapper;

import org.mapstruct.Mapper;

import com.webpoint.resident.model.ResidentResponse;

@Mapper(componentModel = "spring")
public interface ResidentApiMapper {

    ResidentResponse toResidentResponse(com.example.sample_bms.resident.domain.entity.Resident resident);

}
