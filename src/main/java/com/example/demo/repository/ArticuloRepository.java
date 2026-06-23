package com.example.demo.repository;

// Importamos el modelo de datos Articulo
import com.example.demo.model.Articulo;

// Importamos JpaRepository, que nos da los métodos CRUD listos
import org.springframework.data.jpa.repository.JpaRepository;

// Importamos la anotación @Repository que marca esta interfaz como componente de acceso a datos
import org.springframework.stereotype.Repository;

//import java.util.List;

// Esta interfaz se conecta con la base de datos y maneja operaciones sobre la entidad Articulo
@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {

}