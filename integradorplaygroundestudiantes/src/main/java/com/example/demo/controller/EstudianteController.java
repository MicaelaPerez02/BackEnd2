package com.example.demo.controller;
import com.example.demo.model.EstudianteDto;
import com.example.demo.service.iEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    iEstudianteService estudianteService;

    public ResponseEntity<?> crearEstudiante(@RequestBody EstudianteDto estudianteDto){
        estudianteService.crearEstudiante(estudianteDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public EstudianteDto getEstudiante(@PathVariable Long id){
        return estudianteService.leerEstudiante(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarEstudiante(@RequestBody EstudianteDto estudianteDto){
        estudianteService.modificarEstudiante(estudianteDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarEstudiante(@PathVariable Long id){
        estudianteService.eliminarEstudiante(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping()
    public Collection<EstudianteDto> getTodosEstudiantes(){
        return estudianteService.getTodos();
    }
}
