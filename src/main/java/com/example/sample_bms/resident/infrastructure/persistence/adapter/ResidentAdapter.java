package com.example.sample_bms.resident.infrastructure.persistence.adapter;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.sample_bms.resident.domain.entity.Resident;
import com.example.sample_bms.resident.domain.repository.ResidentRepository;
import com.example.sample_bms.resident.infrastructure.persistence.mapper.ResidentMapper;
import com.example.sample_bms.resident.infrastructure.persistence.repository.JpaResidentRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ResidentAdapter implements ResidentRepository {

    private final JpaResidentRepository jpaResidentRepository;
    private final ResidentMapper residentMapper;

    @Override
    public Resident save(Resident resident) {
        return residentMapper.toResidentDomain(jpaResidentRepository.save(residentMapper.toResidentEntity(resident)));
    }

    @Override
    public Optional<Resident> findById(UUID id) {
        return jpaResidentRepository.findById(id).map(residentMapper::toResidentDomain);
    }

    @Override
    public boolean existsById(UUID id) {
        return jpaResidentRepository.existsById(id);
    }

    @Override
    public void deleteById(UUID id) {
        jpaResidentRepository.deleteById(id);
    }
}
