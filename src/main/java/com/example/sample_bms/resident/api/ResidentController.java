package com.example.sample_bms.resident.api;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/residents")
public class ResidentController {
    private final ResidentFacade residentFacade;

    public ResidentController(ResidentFacade residentFacade) {
        this.residentFacade = residentFacade;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResidentDTO> getResident(
            @PathVariable UUID id) {
        return ResponseEntity.ok(
                residentFacade.getResident(id));
    }

    @PostMapping
    public ResponseEntity<ResidentDTO> registerResident(
            @RequestBody RegisterResidentRequest request) {
        ResidentDTO resident = residentFacade.registerResident(
                request.firstName(),
                request.lastName(),
                request.middleName(),
                request.address(),
                request.householdNumber());

        return ResponseEntity.ok(resident);
    }
}
