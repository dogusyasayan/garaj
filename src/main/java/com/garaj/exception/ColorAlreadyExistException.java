package com.garaj.exception;

public class ColorAlreadyExistException extends RuntimeException {
    public ColorAlreadyExistException(String color) {
        super("Color already exist: " + color);
    }
}
