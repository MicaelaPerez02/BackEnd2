package com.example.proyectoIntegradorPerezMicaela.model;

import com.example.proyectoIntegradorPerezMicaela.entities.Address;
import com.example.proyectoIntegradorPerezMicaela.entities.Appointment;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PatientDto {

    private Long idPatiente;
    private String dni;
    private String name;
    private String lastName;
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private Address address;
    private Set<Appointment> appointments = new HashSet<>();

    public Long getIdPatiente() {
        return idPatiente;
    }

    public PatientDto setIdPatiente(Long idPatiente) {
        this.idPatiente = idPatiente;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
