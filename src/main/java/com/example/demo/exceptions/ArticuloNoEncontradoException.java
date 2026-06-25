package com.example.demo.exceptions;

public class ArticuloNoEncontradoException extends RuntimeException {

    public ArticuloNoEncontradoException(Long id) {
        super("Artículo con ID " + id + " no encontrado");
    }
}