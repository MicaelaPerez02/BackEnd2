package com.dh.clinica.controller;

import com.dh.clinica.model.Domicilio;
import com.dh.clinica.model.Odontologo;
import com.dh.clinica.service.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/domicilios")

public class AddressController {

    @Autowired
    private DomicilioService domicilioService;

    @PostMapping()
    public ResponseEntity<Domicilio> registrarDomicilio(@RequestBody Domicilio domicilio) {
        return ResponseEntity.ok(domicilioService.registrarDomicilio(domicilio));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Domicilio> buscarPorId(@PathVariable Long id) {
        Domicilio domicilio = domicilioService.buscarPorId(id).orElse(null);
        return ResponseEntity.ok(domicilio);
    }

    @GetMapping
    public ResponseEntity<List<Domicilio>> buscarTodos(){
        return ResponseEntity.ok(domicilioService.buscarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {
        ResponseEntity<String> response;
        if (domicilioService.buscarPorId(id).isPresent()) { // Esta validacion no esta en el enunciado del ejericio, pero se las dejo para que la tengan.
            domicilioService.eliminar(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }
}
