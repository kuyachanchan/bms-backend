package com.example.sample_bms.resident.domain.entity;

import java.util.UUID;

public class Resident {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final Household household;

    public Resident(UUID id, String firstName, String lastName, String middleName, Household household) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.household = household;
    }

    public static Resident create(String firstName, String lastName, String middleName, Household household) {
        return new Resident(null, firstName, lastName, middleName, household);
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Household getHousehold() {
        return household;
    }

}
