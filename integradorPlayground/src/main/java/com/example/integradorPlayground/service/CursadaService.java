package com.example.integradorPlayground.service;

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

    private void guardarCursada(CursadaDto cursadaDto){
        Cursada cursada = mapper.convertValue(cursadaDto, Cursada.class);
        cursadaRepository.save(cursada);
    }
    @Override
    public void crearCursada(CursadaDto cursadaDto) {
        guardarCursada(cursadaDto);
    }

    @Override
    public CursadaDto leerCursada(Long id) {
        Optional<Cursada> cursada = cursadaRepository.findById(id);

        CursadaDto cursadaDto = null;
        if (cursada.isPresent())
            cursadaDto = mapper.convertValue(cursada, CursadaDto.class);

        return cursadaDto;
    }

    @Override
    public void modificarCursada(CursadaDto cursadaDto) {
        guardarCursada(cursadaDto);
    }

    @Override
    public void eliminarCursada(Long id) {
        cursadaRepository.deleteById(id);
    }

    @Override
    public Set<CursadaDto> getTodos() {
        List<Cursada> cursadas = cursadaRepository.findAll();
        Set<CursadaDto> cursadaDto = new HashSet<>();

        for (Cursada cursada : cursadas) {
            cursadaDto.add(mapper.convertValue(cursada, CursadaDto.class));
        }

        return cursadaDto;
    }


}
