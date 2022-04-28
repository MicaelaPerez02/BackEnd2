package com.example.proyectoIntegradorPerezMicaela.controller;

import com.example.proyectoIntegradorPerezMicaela.entities.Dentist;
import com.example.proyectoIntegradorPerezMicaela.model.DentistDto;
import com.example.proyectoIntegradorPerezMicaela.model.PatientDto;
import com.example.proyectoIntegradorPerezMicaela.repository.IDentistRepository;
import com.example.proyectoIntegradorPerezMicaela.service.IDentistService;
import com.example.proyectoIntegradorPerezMicaela.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/dentist")
public class DentistController {
    @Autowired
    private IDentistService dentistService;

    @PostMapping
    public ResponseEntity<String> addDentist(@RequestBody DentistDto dentistDto){
        dentistService.saveDentist(dentistDto);
        return ResponseEntity.ok("Dentist saved correctly");
    }

    @GetMapping("/{id}")
    public DentistDto getStudent(@PathVariable Long id) throws Exception {
        return dentistService.findDentistById(id);
    }

    @PutMapping()
    public ResponseEntity<?> modifyDentist(@RequestBody DentistDto dentistDto) {
        dentistService.updateDentist(dentistDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeDentist(@PathVariable Long id) {
        ResponseEntity<String> response = null;
        dentistService.deleteDentist(id);
        response = ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        return response;
    }

    @GetMapping("/listDentist")
    public Collection<DentistDto> listAppointment() {
        return dentistService.getAll();
    }

}
