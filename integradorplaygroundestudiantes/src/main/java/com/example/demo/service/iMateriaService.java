package com.example.demo.service;
import com.example.integradorPlayground.model.EstudianteDto;
import com.example.integradorPlayground.model.MateriaDto;

import java.util.Set;

public interface iMateriaService {
    void crearMateria(MateriaDto materiaDto);
    MateriaDto leerMateria(Long id);
    void modificarMateria(MateriaDto materiaDto);
    void eliminarMateria(Long id);

    Set<MateriaDto> getTodos();
}
