package com.example.sample_bms.resident.application;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sample_bms.resident.domain.entity.Household;
import com.example.sample_bms.resident.domain.entity.Resident;
import com.example.sample_bms.resident.domain.repository.HouseholdRepository;
import com.example.sample_bms.resident.domain.repository.ResidentRepository;

@Service
@Transactional
public class ResidentService {

    private final ResidentRepository residentRepository;
    private final HouseholdRepository householdRepository;

    public ResidentService(ResidentRepository residentRepository, HouseholdRepository householdRepository) {
        this.residentRepository = residentRepository;
        this.householdRepository = householdRepository;
    }

    public Resident registerResident(
            String firstName,
            String lastName,
            String middleName,
            String address,
            String householdNumber) {

        Household household = Household.create(householdNumber, address);

        Household savedHousehold = householdRepository.save(household);

        Resident resident = Resident.create(firstName, lastName, middleName, savedHousehold);

        return residentRepository.save(resident);
    }

    @Transactional(readOnly = true)
    public Resident getResident(UUID id) {

        return residentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        "Resident not found: " + id));
    }

}
