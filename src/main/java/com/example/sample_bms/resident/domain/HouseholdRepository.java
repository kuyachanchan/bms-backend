package com.example.sample_bms.resident.domain;

import java.util.Optional;
import java.util.UUID;

public interface HouseholdRepository {
    Optional<Household> findById(UUID id);

    Household save(Household household);
}
