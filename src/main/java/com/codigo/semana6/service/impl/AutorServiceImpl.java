package com.codigo.semana6.service.impl;

import com.codigo.semana6.dao.AutorDAO;
import com.codigo.semana6.entity.AutorEntity;
import com.codigo.semana6.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorServiceImpl implements AutorService {
    @Autowired
    private AutorDAO autorDAO;

    @Override
    public List<AutorEntity> obtenerTodos() {
        return autorDAO.findAll();
    }

    @Override
    public AutorEntity obtenerAutorPorId(Long id) throws Exception {
        Optional<AutorEntity> autor = autorDAO.findById(id);
        if (autor.isPresent()) {
            return autor.get();
        } else {
            throw new Exception("Error, no existe");
        }
    }

    @Override
    public AutorEntity crearAutor(AutorEntity autor) {
        return autorDAO.save(autor);
    }

    @Override
    public AutorEntity actualizarAutor(Long id, AutorEntity autorEntity) {
        return null;
    }

    @Override
    public void eliminarAutor(Long id) {

    }
}
