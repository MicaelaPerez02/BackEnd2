package com.example.integradorPlayground.service;

import com.example.integradorPlayground.model.EstudianteDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EstudianteServiceTest {

    @Autowired
    private EstudianteService estudianteService;

    @Test
    public void testCrearEstudiante(){
        EstudianteDto estudianteDto = new EstudianteDto();
        estudianteDto.setNombre("Micaela");
        estudianteDto.setApellido("Perez");
        estudianteService.crearEstudiante(estudianteDto);

        EstudianteDto estudianteMica = estudianteService.leerEstudiante(1L);

        assertTrue(estudianteMica != null);
    }
}