package com.example.integradorPlayground.repository;

import com.example.integradorPlayground.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iMateriaRepository extends JpaRepository<Materia, Long> {
}
