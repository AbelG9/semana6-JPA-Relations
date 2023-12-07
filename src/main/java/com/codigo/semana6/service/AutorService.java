package com.codigo.semana6.service;

import com.codigo.semana6.entity.AutorEntity;

import java.util.List;

public interface AutorService {
    List<AutorEntity> obtenerTodos();

    AutorEntity obtenerAutorPorId(Long id) throws Exception;

    AutorEntity crearAutor(AutorEntity autor);

    AutorEntity actualizarAutor(Long id, AutorEntity autorEntity);

    void eliminarAutor(Long id);
}
