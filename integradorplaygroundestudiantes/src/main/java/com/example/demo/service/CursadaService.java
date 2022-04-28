package com.example.demo.service;
import com.example.integradorPlayground.model.*;
import com.example.integradorPlayground.repository.iCursadaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CursadaService implements iCursadaService{

    @Autowired
    private iCursadaRepository cursadaRepository;

    @Autowired
    ObjectMapper mapper;

    private void guardarCursada(com.example.integradorPlayground.model.CursadaDto cursadaDto){
        com.example.integradorPlayground.model.Cursada cursada = mapper.convertValue(cursadaDto, com.example.integradorPlayground.model.Cursada.class);
        cursadaRepository.save(cursada);
    }
    @Override
    public void crearCursada(com.example.integradorPlayground.model.CursadaDto cursadaDto) {
        guardarCursada(cursadaDto);
    }

    @Override
    public com.example.integradorPlayground.model.CursadaDto leerCursada(Long id) {
        Optional<com.example.integradorPlayground.model.Cursada> cursada = cursadaRepository.findById(id);

        com.example.integradorPlayground.model.CursadaDto cursadaDto = null;
        if (cursada.isPresent())
            cursadaDto = mapper.convertValue(cursada, com.example.integradorPlayground.model.CursadaDto.class);

        return cursadaDto;
    }

    @Override
    public void modificarCursada(com.example.integradorPlayground.model.CursadaDto cursadaDto) {
        guardarCursada(cursadaDto);
    }

    @Override
    public void eliminarCursada(Long id) {
        cursadaRepository.deleteById(id);
    }

    @Override
    public Set<com.example.integradorPlayground.model.CursadaDto> getTodos() {
        List<com.example.integradorPlayground.model.Cursada> cursadas = cursadaRepository.findAll();
        Set<com.example.integradorPlayground.model.CursadaDto> cursadaDto = new HashSet<>();

        for (com.example.integradorPlayground.model.Cursada cursada : cursadas) {
            cursadaDto.add(mapper.convertValue(cursada, com.example.integradorPlayground.model.CursadaDto.class));
        }

        return cursadaDto;
    }


}
