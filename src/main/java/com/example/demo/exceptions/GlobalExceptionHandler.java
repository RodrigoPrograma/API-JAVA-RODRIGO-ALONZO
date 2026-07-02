package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArticuloNoEncontradoException.class)
    public ResponseEntity<ErrorResponse> handleArticuloNoEncontrado(ArticuloNoEncontradoException ex) {
    
        ErrorResponse error = new ErrorResponse(
            ex.getMessage(),
            HttpStatus.NOT_FOUND.value()
        );

        return ResponseEntity
        .status(HttpStatus.NOT_FOUND)
        .body(error);
    }
}