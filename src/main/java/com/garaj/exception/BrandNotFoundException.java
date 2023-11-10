package com.garaj.exception;

public class BrandNotFoundException extends RuntimeException {

    public BrandNotFoundException() {
        super("brand.not.found");
    }
}
