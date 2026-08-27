package com.example.sample_bms.identity.domain;

import com.example.sample_bms.identity.domain.valueobject.UserId;

import jakarta.persistence.Id;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UserId id;
}
