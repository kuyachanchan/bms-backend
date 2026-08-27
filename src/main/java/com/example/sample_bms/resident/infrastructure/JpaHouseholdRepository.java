package com.example.sample_bms.resident.infrastructure;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample_bms.resident.domain.Household;
import com.example.sample_bms.resident.domain.HouseholdRepository;

public interface JpaHouseholdRepository extends JpaRepository<Household, UUID>, HouseholdRepository {

}
