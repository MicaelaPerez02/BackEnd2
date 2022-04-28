package com.example.integradorPlayground.service;

import com.example.integradorPlayground.model.Estudiante;
import com.example.integradorPlayground.model.EstudianteDto;
import com.example.integradorPlayground.repository.iEstudianteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class EstudianteService implements iEstudianteService {
   @Autowired
   private iEstudianteRepository estudianteRepository;

   @Autowired
   ObjectMapper mapper;

   @Override
   public void crearEstudiante(EstudianteDto estudianteDto) {
      guardarEstudiante(estudianteDto);
   }

   @Override
   public EstudianteDto leerEstudiante(Long id) {
      Optional<Estudiante> estudiante = estudianteRepository.findById(id);

      EstudianteDto estudianteDto = null;
      if (estudiante.isPresent())
         estudianteDto = mapper.convertValue(estudiante, EstudianteDto.class);

      return estudianteDto;
   }

   private void guardarEstudiante(EstudianteDto estudianteDto) {
      Estudiante estudiante = mapper.convertValue(estudianteDto, Estudiante.class);
      estudianteRepository.save(estudiante);
   }

   @Override
   public void modificarEstudiante(EstudianteDto estudianteDto) {
      guardarEstudiante(estudianteDto);
   }

   @Override
   public void eliminarEstudiante(Long id) {
      estudianteRepository.deleteById(id);
   }

   @Override
   public Set<EstudianteDto> getTodos() {
     List<Estudiante> estudiantes = estudianteRepository.findAll();
     Set<EstudianteDto> estudiantesDto = new HashSet<>();

     for(Estudiante estudiante : estudiantes) {
        estudiantesDto.add(mapper.convertValue(estudiante, EstudianteDto.class));
     }

     return estudiantesDto;
   }
}
