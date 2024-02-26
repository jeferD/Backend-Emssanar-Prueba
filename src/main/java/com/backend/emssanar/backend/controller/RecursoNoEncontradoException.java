package com.backend.emssanar.backend.controller;

public class RecursoNoEncontradoException extends RuntimeException {
    private final String mensaje;

    public RecursoNoEncontradoException(Long id) {
        super("No se encontró el recurso con el ID: " + id);
        this.mensaje = "No se encontro afiliado con esa identificación";
    }

    public String getMensaje() {
        return mensaje;
    }
}

