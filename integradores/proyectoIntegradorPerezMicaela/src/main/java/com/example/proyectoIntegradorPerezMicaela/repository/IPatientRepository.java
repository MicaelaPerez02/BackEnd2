package com.example.proyectoIntegradorPerezMicaela.repository;

import com.example.proyectoIntegradorPerezMicaela.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepository extends JpaRepository<Patient, Long> {
}
