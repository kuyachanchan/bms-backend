package com.example.sample_bms.resident.api;

import java.util.UUID;

public record HouseholdDTO(
                UUID id,
                String householdNumber,
                String address) {

}
