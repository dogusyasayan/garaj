package com.garaj.exception;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException() {
        super("car.not.found");
    }
}