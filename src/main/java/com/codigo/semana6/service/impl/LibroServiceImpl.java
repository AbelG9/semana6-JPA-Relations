package com.codigo.semana6.service.impl;

import com.codigo.semana6.dao.LibroDAO;
import com.codigo.semana6.entity.LibroEntity;
import com.codigo.semana6.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    LibroDAO libroDAO;

    @Override
    public List<LibroEntity> obtenerTodos() {
        return libroDAO.findAll();
    }

    @Override
    public LibroEntity obtenerLibroPorId(Long id) throws Exception {
        Optional<LibroEntity> libro = libroDAO.findById(id);
        if (libro.isPresent()) {
            return libro.get();
        } else {
            throw new Exception("Error, no existe");
        }
    }

    @Override
    public LibroEntity crearLibro(LibroEntity libroEntity) {
        return libroDAO.save(libroEntity);
    }

    @Override
    public LibroEntity actualizarLibro(Long id, LibroEntity libroEntity) {
        return null;
    }

    @Override
    public void eliminarLibro(Long id) {

    }
}
