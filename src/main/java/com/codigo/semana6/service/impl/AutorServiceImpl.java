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
    public AutorEntity crearAutor(AutorEntity autorEntity) {
        return autorDAO.save(autorEntity);
    }

    @Override
    public AutorEntity actualizarAutor(Long id, AutorEntity autorEntity) throws Exception {
        Optional<AutorEntity> autor = autorDAO.findById(id);
        if (autor.isPresent()) {
            AutorEntity autorEdit = autor.get();
            autorEdit.setNombre(autorEntity.getNombre());
            autorEdit.setEstado(autorEntity.getEstado());
            return autorDAO.save(autorEdit);
        } else {
            throw new Exception("Error, no existe");
        }
    }

    @Override
    public boolean eliminarAutor(Long id) throws Exception {
        Optional<AutorEntity> autor = autorDAO.findById(id);
        if (autor.isPresent()) {
            autorDAO.deleteById(id);
        } else {
            throw new Exception("Error, no existe");
        }
        return false;
    }

    @Override
    public AutorEntity eliminarLogicamenteAutor(Long id) throws Exception {
        Optional<AutorEntity> autor = autorDAO.findById(id);
        if (autor.isPresent()) {
            AutorEntity autorEdit = autor.get();
            autorEdit.setEstado(0);
            return autorDAO.save(autorEdit);
        } else {
            throw new Exception("Error, no existe");
        }
    }
}
