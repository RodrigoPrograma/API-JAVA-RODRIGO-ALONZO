package com.example.demo.service;
import com.example.demo.model.Articulo;
import com.example.demo.repository.ArticuloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloServiceImpl implements ArticuloService {

    private final ArticuloRepository articuloRepository;
    
    @Autowired
    public ArticuloServiceImpl(ArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }

    public List<Articulo> getAllArticulos() {
        return articuloRepository.findAll();
    }

    public Optional<Articulo> getArticuloById(Long id) {
        return articuloRepository.findById(id);
    }

    public Articulo saveArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    public void deleteArticulo(Long id) {
        articuloRepository.deleteById(id);
    }

    public Articulo updateArticulo(Long id, Articulo articulo) {
        Optional<Articulo> articuloOptional = articuloRepository.findById(id);
        if (articuloOptional.isPresent()) {
            Articulo existingArticulo = articuloOptional.get();
            existingArticulo.setNombre(articulo.getNombre());
            existingArticulo.setPrecio(articulo.getPrecio());
            return articuloRepository.save(existingArticulo);
        } else {
            throw new RuntimeException("Artículo no encontrado");
        }
    }
}
