package com.codigo.semana6.controller;

import com.codigo.semana6.entity.CategoriaEntity;
import com.codigo.semana6.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping()
    public List<CategoriaEntity> listarCategorias() {
        List<CategoriaEntity> categorias = categoriaService.obtenerTodos();
        return categorias;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaEntity> obtenerCategoriaPorId(@PathVariable Long id) throws Exception {
        CategoriaEntity categoria = categoriaService.obtenerCategoriaPorId(id);
        return ResponseEntity.ok(categoria);
    }

    @PostMapping()
    public ResponseEntity<CategoriaEntity> crearCategoria(@RequestBody CategoriaEntity categoriaEntity) {
        CategoriaEntity categoria = categoriaService.crearCategoria(categoriaEntity);
        return new ResponseEntity<>(categoria, HttpStatus.CREATED);
    }
}
