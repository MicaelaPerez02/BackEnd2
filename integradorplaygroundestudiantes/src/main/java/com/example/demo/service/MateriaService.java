package com.example.demo.service;

import com.example.integradorPlayground.model.Materia;
import com.example.integradorPlayground.model.MateriaDto;
import com.example.integradorPlayground.repository.iMateriaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class MateriaService implements iMateriaService {

    @Autowired
    private iMateriaRepository materiaRepository;

    @Autowired
    ObjectMapper mapper;

    private void guardarMateria(MateriaDto materiaDto) {
        Materia materia = mapper.convertValue(materiaDto, Materia.class);
        materiaRepository.save(materia);
    }

    @Override
    public void crearMateria(MateriaDto materiaDto) {
        guardarMateria(materiaDto);
    }

    @Override
    public MateriaDto leerMateria(Long id) {
        Optional<Materia> materia = materiaRepository.findById(id);

        MateriaDto materiaDto = null;
        if (materia.isPresent())
            materiaDto = mapper.convertValue(materia, MateriaDto.class);

        return materiaDto;
    }

    @Override
    public void modificarMateria(MateriaDto materiaDto) {
        guardarMateria(materiaDto);
    }

    @Override
    public void eliminarMateria(Long id) {
        materiaRepository.deleteById(id);
    }

    @Override
    public Set<MateriaDto> getTodos() {
        List<Materia> materias = materiaRepository.findAll();
        Set<MateriaDto> materiaDto = new HashSet<>();

        for (Materia materia : materias) {
            materiaDto.add(mapper.convertValue(materia, MateriaDto.class));
        }

        return materiaDto;
    }
}