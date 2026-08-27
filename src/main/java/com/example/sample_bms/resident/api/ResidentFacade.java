package com.example.sample_bms.resident.api;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.example.sample_bms.resident.application.ResidentService;

@Component
public class ResidentFacade {
    private final ResidentService residentService;

    public ResidentFacade(ResidentService residentService) {
        this.residentService = residentService;
    }

    public ResidentDTO getResident(UUID residentId) {
        return residentService.getResident(residentId);
    }

    public ResidentDTO registerResident(
            String firstName,
            String lastName,
            String middleName,
            String address,
            String householdNumber) {
        return residentService.registerResident(
                firstName,
                lastName,
                middleName,
                address,
                householdNumber);
    }
}
