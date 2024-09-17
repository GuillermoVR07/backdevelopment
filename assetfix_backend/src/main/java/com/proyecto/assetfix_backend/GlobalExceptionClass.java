package com.proyecto.assetfix_backend;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionClass {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> GlobalExceptionClass(Exception e) {
        return new ResponseEntity<>("Ah ocurrido un error inesperado con la solicitud :(", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
