package com.garaj.model.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum FuelType {
    GASOLINE("Benzin"),
    DIESEL("Dizel"),
    ELECTRIC("Elektrik"),
    HYBRID("Hibrit");

    private final String text;

    public FuelType getDisplayName() {
        return FuelType.valueOf(text);
    }
}
