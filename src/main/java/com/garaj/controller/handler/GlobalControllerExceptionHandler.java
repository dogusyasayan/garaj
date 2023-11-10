package com.garaj.controller.handler;

import com.garaj.exception.BrandAlreadyExistException;
import com.garaj.exception.BrandNotFoundException;
import com.garaj.exception.CarNotFoundException;
import com.garaj.model.response.error.ErrorResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Locale;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalControllerExceptionHandler {

    private final MessageSource messageSource;

    @ExceptionHandler(CarNotFoundException.class)
    public ResponseEntity<ErrorResponse> handle(CarNotFoundException exception) {
        return instanceError(exception, "Car code not found", HttpStatus.CONFLICT);
    }

    @ExceptionHandler(BrandNotFoundException.class)
    public ResponseEntity<ErrorResponse> handle(BrandNotFoundException exception) {
        return instanceError(exception, "Brand not found", HttpStatus.CONFLICT);
    }

    @ExceptionHandler(BrandAlreadyExistException.class)
    public ResponseEntity<ErrorResponse> handle(BrandAlreadyExistException exception) {
        return instanceError(exception, "Brand already exist", HttpStatus.CONFLICT);
    }

    private ResponseEntity<ErrorResponse> instanceError(RuntimeException ex, String errorMessage, HttpStatus status) {
        log.error(errorMessage + " exception occurred.", ex);
        ErrorResponse errorResponse = ErrorResponse.builder()
                .exception(ex.getClass().getSimpleName())
                .error(messageSource.getMessage(ex.getMessage(), null, Locale.forLanguageTag("tr")))
                .timestamp(System.currentTimeMillis())
                .build();

        return new ResponseEntity<>(errorResponse, status);
    }
}
