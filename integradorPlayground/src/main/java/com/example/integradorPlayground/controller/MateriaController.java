package com.example.integradorPlayground.controller;

import com.example.integradorPlayground.model.MateriaDto;
import com.example.integradorPlayground.service.iMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    @Autowired
    iMateriaService materiaService;

    @PostMapping
    public ResponseEntity<?> crearMateria(@RequestBody MateriaDto materiaDto){
        materiaService.crearMateria(materiaDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public MateriaDto getMateria(@PathVariable Long id){
        return materiaService.leerMateria(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarMateria(@RequestBody MateriaDto materiaDto){
        materiaService.modificarMateria(materiaDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarMateria(@PathVariable Long id){
        materiaService.eliminarMateria(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping()
    public Collection<MateriaDto> getTodosMaterias(){
        return materiaService.getTodos();
    }
}