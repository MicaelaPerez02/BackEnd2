package com.example.integradorPlayground.service;

import com.example.integradorPlayground.model.EstudianteDto;

import java.util.Set;

public interface iEstudianteService {

    void crearEstudiante(EstudianteDto estudianteDto);
    EstudianteDto leerEstudiante(Long id);
    void modificarEstudiante(EstudianteDto estudianteDto);
    void eliminarEstudiante(Long id);

    Set<EstudianteDto> getTodos();
}
