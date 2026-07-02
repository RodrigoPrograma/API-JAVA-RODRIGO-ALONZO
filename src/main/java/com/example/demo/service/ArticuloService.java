package com.example.demo.service;

import com.example.demo.model.Articulo;
import java.util.List;

public interface ArticuloService {

    List<Articulo> getAllArticulos();
    Articulo getArticuloById(Long id);
    Articulo saveArticulo(Articulo articulo);
    Articulo updateArticulo(Long id, Articulo articulo);
    void deleteArticulo(Long id);

}
