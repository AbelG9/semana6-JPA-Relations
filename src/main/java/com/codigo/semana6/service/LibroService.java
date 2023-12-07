package com.codigo.semana6.service;

import com.codigo.semana6.entity.LibroEntity;

import java.util.List;

public interface LibroService {
    List<LibroEntity> obtenerTodos();

    LibroEntity obtenerLibroPorId(Long id) throws Exception;

    LibroEntity crearLibro(LibroEntity libroEntity);

    LibroEntity actualizarLibro(Long id, LibroEntity libroEntity);

    void eliminarLibro(Long id);
}
