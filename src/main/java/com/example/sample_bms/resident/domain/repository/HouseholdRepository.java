package com.example.sample_bms.resident.domain.repository;

import java.util.Optional;
import java.util.UUID;

import com.example.sample_bms.resident.domain.entity.Household;

public interface HouseholdRepository {
    Optional<Household> findById(UUID id);

    Household save(Household household);
}
