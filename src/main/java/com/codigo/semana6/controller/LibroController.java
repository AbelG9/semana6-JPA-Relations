package com.codigo.semana6.controller;

import com.codigo.semana6.entity.LibroEntity;
import com.codigo.semana6.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<LibroEntity> listarLibros() {
        List<LibroEntity> libros = libroService.obtenerTodos();
        return libros;
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibroEntity> obtenerLibroPorId(@PathVariable Long id) throws Exception {
        LibroEntity libro = libroService.obtenerLibroPorId(id);
        return ResponseEntity.ok(libro);
    }

    @PostMapping()
    public ResponseEntity<LibroEntity> crearLibro(@RequestBody LibroEntity libroEntity) {
        LibroEntity libro = libroService.crearLibro(libroEntity);
        return new ResponseEntity<>(libro, HttpStatus.CREATED);
    }
}

