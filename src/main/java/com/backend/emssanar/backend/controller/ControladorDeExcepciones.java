package com.backend.emssanar.backend.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControladorDeExcepciones {

   @ExceptionHandler(RecursoNoEncontradoException.class)
    public ResponseEntity<Map<String, String>> manejarRecursoNoEncontrado(RecursoNoEncontradoException e) {
        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("mensaje", e.getMensaje());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseBody);
    }
}
