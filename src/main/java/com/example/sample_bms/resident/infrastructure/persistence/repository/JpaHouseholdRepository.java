package com.example.sample_bms.resident.infrastructure.persistence.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample_bms.resident.infrastructure.persistence.entity.Household;

public interface JpaHouseholdRepository extends JpaRepository<Household, UUID> {

}
