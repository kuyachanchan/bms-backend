package com.example.sample_bms.resident.api;

public record RegisterResidentRequest(
        String firstName,
        String lastName,
        String middleName,
        String address,
        String householdNumber) {

}
