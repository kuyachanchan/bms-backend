package com.example.sample_bms.identity.domain.valueobject;

public record UserId(
        String prefix,
        String value) {
    public UserId {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("UserId cannot be null or blank");
        }

        value = value.startsWith(prefix) ? value : prefix + value;
    }

    public static UserId of(String prefix, String value) {
        return new UserId(prefix, value);
    }

}
