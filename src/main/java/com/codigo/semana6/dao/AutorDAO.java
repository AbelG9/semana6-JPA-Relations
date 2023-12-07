package com.codigo.semana6.dao;

import com.codigo.semana6.entity.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorDAO extends JpaRepository<AutorEntity, Long> {
}
