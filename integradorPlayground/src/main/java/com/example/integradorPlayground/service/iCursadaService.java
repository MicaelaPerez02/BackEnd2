package com.example.integradorPlayground.service;

import com.example.integradorPlayground.model.CursadaDto;

import java.util.Set;

public interface iCursadaService {
    void crearCursada(CursadaDto cursadaDto);
    CursadaDto leerCursada(Long id);
    void modificarCursada(CursadaDto cursadaDto);
    void eliminarCursada(Long id);

    Set<CursadaDto> getTodos();
}
