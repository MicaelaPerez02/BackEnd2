package com.example.demo.service;


import java.util.Set;

public interface iCursadaService {
    void crearCursada(com.example.integradorPlayground.model.CursadaDto cursadaDto);
    com.example.integradorPlayground.model.CursadaDto leerCursada(Long id);
    void modificarCursada(com.example.integradorPlayground.model.CursadaDto cursadaDto);
    void eliminarCursada(Long id);

    Set<com.example.integradorPlayground.model.CursadaDto> getTodos();
}
