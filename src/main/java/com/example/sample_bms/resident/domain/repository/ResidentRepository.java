package com.example.sample_bms.resident.domain.repository;

import java.util.Optional;
import java.util.UUID;

import com.example.sample_bms.resident.domain.entity.Resident;

public interface ResidentRepository {
    Resident save(Resident resident);

    Optional<Resident> findById(UUID id);

    boolean existsById(UUID id);

    void deleteById(UUID id);
}
