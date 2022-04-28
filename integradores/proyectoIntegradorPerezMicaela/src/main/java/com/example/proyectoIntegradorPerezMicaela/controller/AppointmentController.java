package com.example.proyectoIntegradorPerezMicaela.controller;

import com.example.proyectoIntegradorPerezMicaela.model.AppointmentDto;
import com.example.proyectoIntegradorPerezMicaela.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    IAppointmentService appointmentService;

    @PostMapping
    public void addAppointment(@RequestBody AppointmentDto appointmentDto) {
        appointmentService.saveAppointment(appointmentDto);
    }

    @GetMapping()
    public Collection<AppointmentDto> getAll() {
        return appointmentService.getAll();
    }

    @GetMapping("/{id}")
    public AppointmentDto getAppointment(@PathVariable Long id) throws Exception {
        return appointmentService.getAppointmentById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeAppointment(@PathVariable Long id) {
        ResponseEntity<String> response = null;
        appointmentService.deleteAppointment(id);
        response = ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        return response;
    }

    @GetMapping("/listAppointment")
    public Collection<AppointmentDto> listAppointment() {
        return appointmentService.getAll();
    }


    @PutMapping()
    public ResponseEntity<?> modifyAppointment(@RequestBody AppointmentDto appointmentDto) {
        appointmentService.updateAppointment(appointmentDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
