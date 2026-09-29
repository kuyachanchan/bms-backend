package com.example.sample_bms.resident.domain.entity;

import java.util.UUID;

import lombok.Builder.Default;

public class Household {
    private final UUID id;
    private final String householdNumber;
    private final String address;

    public Household(UUID id, String householdNumber, String address) {
        this.id = id;
        this.householdNumber = householdNumber;
        this.address = address;
    }

    public static Household create(String householdNumber, String address) {
        return new Household(null, householdNumber, address);
    }

    public UUID getId() {
        return id;
    }

    public String getHouseholdNumber() {
        return householdNumber;
    }

    public String getAddress() {
        return address;
    }

}
