package com.example.proyectoIntegradorPerezMicaela.repository;

import com.example.proyectoIntegradorPerezMicaela.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepository extends JpaRepository<Appointment, Long> {
}
