package com.example.integradorPlayground.repository;

import com.example.integradorPlayground.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iEstudianteRepository extends JpaRepository<Estudiante, Long> {
}
