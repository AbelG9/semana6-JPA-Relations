package com.codigo.semana6.controller;

import com.codigo.semana6.entity.AutorEntity;
import com.codigo.semana6.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping()
    public List<AutorEntity> listarAutores() {
        List<AutorEntity> autores = autorService.obtenerTodos();
        return autores;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorEntity> obtenerAutoresPorId(@PathVariable Long id) throws Exception {
        AutorEntity autor = autorService.obtenerAutorPorId(id);
        return ResponseEntity.ok(autor);
    }

    @PostMapping()
    public ResponseEntity<AutorEntity> crearAutor(@RequestBody AutorEntity autorEntity) {
        AutorEntity autor = autorService.crearAutor(autorEntity);
        return new ResponseEntity<>(autor, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AutorEntity> actualizarAutor(@PathVariable Long id, @RequestBody AutorEntity autorEntity) throws Exception {
        AutorEntity autor = autorService.actualizarAutor(id, autorEntity);
        return ResponseEntity.ok(autor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AutorEntity> eliminarAutor(@PathVariable Long id) throws Exception {
        autorService.eliminarAutor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<AutorEntity> eliminarLogicamenteAutor(@PathVariable Long id) throws Exception {
        AutorEntity autor = autorService.eliminarLogicamenteAutor(id);
        return ResponseEntity.ok(autor);
    }
}
