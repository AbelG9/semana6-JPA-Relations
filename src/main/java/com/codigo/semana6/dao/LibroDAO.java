package com.codigo.semana6.dao;

import com.codigo.semana6.entity.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroDAO extends JpaRepository<LibroEntity, Long> {
}
