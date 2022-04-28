package com.example.proyectoIntegradorPerezMicaela.service;
import com.example.proyectoIntegradorPerezMicaela.model.PatientDto;

import java.util.Collection;

public interface IPatientService {

    void savePatient (PatientDto patientDto);
    void deletePatient (Long id);
    PatientDto findPatientById(Long id) throws Exception;
    void updatePatient(PatientDto patientDto);
    Collection<PatientDto> getAll();

}
