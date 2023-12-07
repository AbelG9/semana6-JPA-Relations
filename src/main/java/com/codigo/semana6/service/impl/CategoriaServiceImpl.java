package com.codigo.semana6.service.impl;

import com.codigo.semana6.dao.CategoriaDAO;
import com.codigo.semana6.entity.CategoriaEntity;
import com.codigo.semana6.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    CategoriaDAO categoriaDAO;

    @Override
    public List<CategoriaEntity> obtenerTodos() {
        return categoriaDAO.findAll();
    }

    @Override
    public CategoriaEntity obtenerCategoriaPorId(Long id) throws Exception {
        Optional<CategoriaEntity> categoria = categoriaDAO.findById(id);
        if (categoria.isPresent()) {
            return categoria.get();
        } else {
            throw new Exception("Error, no existe");
        }
    }

    @Override
    public CategoriaEntity crearCategoria(CategoriaEntity categoria) {
        return categoriaDAO.save(categoria);
    }

    @Override
    public CategoriaEntity actualizarCategoria(Long id, CategoriaEntity categoria) {
        return null;
    }

    @Override
    public void eliminarCategoria(Long id) {

    }
}
