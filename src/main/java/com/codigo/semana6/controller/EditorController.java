package com.codigo.semana6.controller;

import com.codigo.semana6.entity.EditorEntity;
import com.codigo.semana6.service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("editor")
public class EditorController {
    @Autowired
    private EditorService editorService;

    @GetMapping()
    public List<EditorEntity> listarEditores() {
        List<EditorEntity> editores = editorService.obtenerTodos();
        return editores;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EditorEntity> obtenerEditorPorId(@PathVariable Long id) throws Exception {
        EditorEntity editor = editorService.obtenerEditorPorId(id);
        return ResponseEntity.ok(editor);
    }

    @PostMapping()
    public ResponseEntity<EditorEntity> crearEditor(@RequestBody EditorEntity editorEntity) {
        EditorEntity editor = editorService.crearEditor(editorEntity);
        return new ResponseEntity<>(editor, HttpStatus.CREATED);
    }
}
