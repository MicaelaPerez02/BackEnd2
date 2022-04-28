package com.example.proyectoIntegradorPerezMicaela.controller;

import com.example.proyectoIntegradorPerezMicaela.model.PatientDto;
import com.example.proyectoIntegradorPerezMicaela.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private IPatientService patientService;

    @PostMapping
    public ResponseEntity<String> addPatient(@RequestBody PatientDto patientDto){
            patientService.savePatient(patientDto);
            return ResponseEntity.ok("Patient saved correctly");
    }

    @GetMapping("/{id}")
    public PatientDto getPatient(@PathVariable Long id) throws Exception {
        return patientService.findPatientById(id);
    }

    @PutMapping()
    public ResponseEntity<?> modifyPatient(@RequestBody PatientDto patientDto) {
        patientService.updatePatient(patientDto);
        //arreglar los status
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removePatient(@PathVariable Long id) {
        ResponseEntity<String> response = null;
        patientService.deletePatient(id);
        response = ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        return response;
    }

    @GetMapping("/listPatient")
    public Collection<PatientDto> listAppointment() {
        return patientService.getAll();
    }

   /* public Boolean bodyValidation(PatientDto patientDto) {
        boolean b;
        if (patientDto.getLastName() != null && patientDto.getName() != null && patientDto.getAddress() != null) {
            b = true;
        } else b = false;
        return b;
    }*/

}

