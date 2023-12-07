package com.codigo.semana6.service;

import com.codigo.semana6.entity.CategoriaEntity;

import java.util.List;

public interface CategoriaService {
    List<CategoriaEntity> obtenerTodos();

    CategoriaEntity obtenerCategoriaPorId(Long id) throws Exception;

    CategoriaEntity crearCategoria(CategoriaEntity categoria);

    CategoriaEntity actualizarCategoria(Long id, CategoriaEntity categoria);

    void eliminarCategoria(Long id);
}
