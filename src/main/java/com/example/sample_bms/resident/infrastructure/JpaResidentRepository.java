package com.example.sample_bms.resident.infrastructure;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample_bms.resident.domain.Resident;
import com.example.sample_bms.resident.domain.ResidentRepository;

public interface JpaResidentRepository extends JpaRepository<Resident, UUID>, ResidentRepository {

}
