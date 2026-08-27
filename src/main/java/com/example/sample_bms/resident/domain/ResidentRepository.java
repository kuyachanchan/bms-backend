package com.example.sample_bms.resident.domain;

import java.util.Optional;
import java.util.UUID;

public interface ResidentRepository {
    Resident save(Resident resident);

    Optional<Resident> findById(UUID id);

    boolean existsById(UUID id);

    void deleteById(UUID id);
}
