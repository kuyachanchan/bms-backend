package com.example.sample_bms.resident.api.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample_bms.resident.api.facade.ResidentFacade;
import com.example.sample_bms.resident.api.mapper.ResidentApiMapper;
import com.webpoint.resident.api.ResidentApi;
import com.webpoint.resident.model.ResidentResponse;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
public class ResidentController implements ResidentApi {
    private final ResidentFacade residentFacade;
    private final ResidentApiMapper residentApiMapper;

    public ResidentController(ResidentFacade residentFacade, ResidentApiMapper residentApiMapper) {
        this.residentFacade = residentFacade;
        this.residentApiMapper = residentApiMapper;
    }

    @Override
    public ResponseEntity<ResidentResponse> getResidentById(@NotNull UUID id) {
        return ResponseEntity.ok(residentApiMapper.toResidentResponse(residentFacade.getResident(id)));
    }

    @Override
    public ResponseEntity<ResidentResponse> registerResident(
            com.webpoint.resident.model.@Valid RegisterResidentRequest registerResidentRequest) {
        return ResponseEntity
                .ok(residentApiMapper.toResidentResponse(residentFacade.registerResident(registerResidentRequest)));
    }
}
