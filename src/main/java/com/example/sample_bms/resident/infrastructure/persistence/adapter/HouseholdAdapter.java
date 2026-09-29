package com.example.sample_bms.resident.infrastructure.persistence.adapter;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.sample_bms.resident.domain.entity.Household;
import com.example.sample_bms.resident.domain.repository.HouseholdRepository;
import com.example.sample_bms.resident.infrastructure.persistence.mapper.ResidentMapper;
import com.example.sample_bms.resident.infrastructure.persistence.repository.JpaHouseholdRepository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class HouseholdAdapter implements HouseholdRepository {

    private final JpaHouseholdRepository jpaHouseholdRepository;
    private final ResidentMapper residentMapper;

    @Override
    public Optional<Household> findById(UUID id) {
        return jpaHouseholdRepository.findById(id).map(residentMapper::toHouseholdDomain);
    }

    @Override
    public Household save(Household household) {
        return residentMapper
                .toHouseholdDomain(jpaHouseholdRepository.save(residentMapper.toHouseholdEntity(household)));
    }

}
