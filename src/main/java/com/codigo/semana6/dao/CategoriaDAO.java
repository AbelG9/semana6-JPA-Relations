package com.codigo.semana6.dao;

import com.codigo.semana6.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDAO extends JpaRepository<CategoriaEntity, Long> {
}
