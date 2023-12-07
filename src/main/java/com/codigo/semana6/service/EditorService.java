package com.codigo.semana6.service;

import com.codigo.semana6.entity.EditorEntity;

import java.util.List;

public interface EditorService {
    List<EditorEntity> obtenerTodos();

    EditorEntity obtenerEditorPorId(Long id) throws Exception;

    EditorEntity crearEditor(EditorEntity editorEntity);

    EditorEntity actualizarEditor(Long id, EditorEntity editorEntity);

    void eliminarEditor(Long id);
}
