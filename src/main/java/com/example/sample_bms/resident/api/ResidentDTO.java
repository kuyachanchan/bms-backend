package com.example.sample_bms.resident.api;

import java.util.UUID;

import com.example.sample_bms.resident.domain.Resident;

public record ResidentDTO(
        UUID id,
        String firstName,
        String middleName,
        String lastName,
        HouseholdDTO household) {

    public static ResidentDTO from(Resident resident) {
        return new ResidentDTO(
                resident.getId(),
                resident.getFirstName(),
                resident.getMiddleName(),
                resident.getLastName(),
                new HouseholdDTO(
                        resident.getHousehold().getId(),
                        resident.getHousehold().getHouseholdNumber(),
                        resident.getHousehold().getAddress()));
    }
}
