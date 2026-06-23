package com.example.demo.service;

import com.example.demo.model.Articulo;
import java.util.List;
import java.util.Optional;

public interface ArticuloService {

    List<Articulo> getAllArticulos();
    Optional<Articulo> getArticuloById(Long id);
    Articulo saveArticulo(Articulo articulo);
    Articulo updateArticulo(Long id, Articulo articulo);
    void deleteArticulo(Long id);

}
