package com.example.proyectoIntegradorPerezMicaela.model;

import com.example.proyectoIntegradorPerezMicaela.entities.Dentist;
import com.example.proyectoIntegradorPerezMicaela.entities.Patient;

import java.time.LocalDate;

public class AppointmentDto {

    private Long idAppointment;
    private Patient patient;
    private Dentist dentist;
    private LocalDate date;

    public Patient getPatient() {
        return patient;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public LocalDate getDate() {
        return date;
    }


}
