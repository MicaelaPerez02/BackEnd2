package com.example.proyectoIntegradorPerezMicaela.service;

import com.example.proyectoIntegradorPerezMicaela.model.DentistDto;

import java.util.Collection;

public interface IDentistService {

    void saveDentist (DentistDto dentistDto);
    DentistDto findDentistById (Long id) throws Exception;
    void updateDentist(DentistDto dentistDto);
    void deleteDentist(Long id);

    Collection<DentistDto> getAll();
}
