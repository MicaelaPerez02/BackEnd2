package com.example.proyectoIntegradorPerezMicaela.service;

import com.example.proyectoIntegradorPerezMicaela.entities.Patient;
import com.example.proyectoIntegradorPerezMicaela.model.PatientDto;
import com.example.proyectoIntegradorPerezMicaela.repository.IPatientRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PatientService implements IPatientService{
    @Autowired
    public void setPatienteRepository(IPatientRepository iPatienteRepository) {
        this.iPatientRepository = iPatienteRepository;
    }
    private IPatientRepository iPatientRepository;

    @Autowired
    public void setMapper(ObjectMapper mapper){
        this.mapper = mapper;
    }
    private ObjectMapper mapper;


    public void savePatient (PatientDto patientDto){
        Patient newPatient = mapper.convertValue(patientDto, Patient.class);
        iPatientRepository.save(newPatient);
    }

    public void deletePatient(Long id){
        iPatientRepository.deleteById(id);
    }

    public PatientDto findPatientById(Long id) throws Exception{
        Optional<Patient> found =  iPatientRepository.findById(id);
        if (found.isPresent())
            return mapper.convertValue(found, PatientDto.class);
        else throw new Exception("Patient with id " + id + "not exist");
    }

    public void updatePatient(PatientDto patientDto){
        savePatient(patientDto);
    }

    public Collection<PatientDto> getAll(){
        List<Patient> allPatient = iPatientRepository.findAll();
        Set<PatientDto> allPatientDto = new HashSet<PatientDto>();
        for (Patient patient: allPatient)
            allPatientDto.add(mapper.convertValue(patient, PatientDto.class));

        return allPatientDto;
    }

}
