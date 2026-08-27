package com.example.sample_bms.resident.application;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sample_bms.resident.api.ResidentDTO;
import com.example.sample_bms.resident.domain.Household;
import com.example.sample_bms.resident.domain.HouseholdRepository;
import com.example.sample_bms.resident.domain.Resident;
import com.example.sample_bms.resident.domain.ResidentRepository;

@Service
@Transactional
public class ResidentService {

    private final ResidentRepository residentRepository;
    private final HouseholdRepository householdRepository;

    public ResidentService(ResidentRepository residentRepository, HouseholdRepository householdRepository) {
        this.residentRepository = residentRepository;
        this.householdRepository = householdRepository;
    }

    public ResidentDTO registerResident(
            String firstName,
            String lastName,
            String middleName,
            String address,
            String householdNumber) {

        Household household = new Household(
                householdNumber,
                address);

        Household savedHousehold = householdRepository.save(household);

        Resident resident = new Resident(
                firstName,
                lastName,
                middleName,
                savedHousehold);

        Resident saved = residentRepository.save(resident);

        return ResidentDTO.from(saved);
    }

    @Transactional(readOnly = true)
    public ResidentDTO getResident(UUID id) {

        Resident resident = residentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        "Resident not found: " + id));

        return ResidentDTO.from(resident);
    }

}
