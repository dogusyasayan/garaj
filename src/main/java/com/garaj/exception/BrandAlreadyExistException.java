package com.garaj.exception;

public class BrandAlreadyExistException extends RuntimeException {

    public BrandAlreadyExistException(String brandName) {
        super("Brand already exist: " + brandName);
    }
}