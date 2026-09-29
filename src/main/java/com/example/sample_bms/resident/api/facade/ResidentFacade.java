package com.example.sample_bms.resident.api.facade;

import java.util.UUID;

import org.springframework.stereotype.Component;
import com.example.sample_bms.resident.application.ResidentService;
import com.example.sample_bms.resident.domain.entity.Resident;
import com.webpoint.resident.model.RegisterResidentRequest;

@Component
public class ResidentFacade {
    private final ResidentService residentService;

    public ResidentFacade(ResidentService residentService) {
        this.residentService = residentService;
    }

    public Resident getResident(UUID residentId) {
        return residentService.getResident(residentId);
    }

    public Resident registerResident(RegisterResidentRequest request) {
        return residentService.registerResident(
                request.getFirstName(),
                request.getLastName(),
                request.getMiddleName(),
                request.getAddress(),
                request.getHouseholdNumber());
    }
}
