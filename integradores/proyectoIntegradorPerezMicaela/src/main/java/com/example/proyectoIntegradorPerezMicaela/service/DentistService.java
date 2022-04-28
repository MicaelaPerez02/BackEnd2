package com.example.proyectoIntegradorPerezMicaela.service;

import com.example.proyectoIntegradorPerezMicaela.entities.Dentist;
import com.example.proyectoIntegradorPerezMicaela.model.DentistDto;
import com.example.proyectoIntegradorPerezMicaela.repository.IDentistRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DentistService implements IDentistService {

    @Autowired
    public void setDentistRepository(IDentistRepository iDentistRepository) {
        this.iDentistRepository = iDentistRepository;
    }

    private IDentistRepository iDentistRepository;

    @Autowired
    public void setMapper(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    private ObjectMapper mapper;

    public void saveDentist (DentistDto dentistDto){
        Dentist newDentist = mapper.convertValue(dentistDto, Dentist.class);
        iDentistRepository.save(newDentist);
    }

    public DentistDto findDentistById(Long id) throws Exception{
        Optional<Dentist> found =  iDentistRepository.findById(id);
        if (found.isPresent())
            return mapper.convertValue(found, DentistDto.class);
        else throw new Exception("Dentist with id " + id + "not exist");

    }

    public void updateDentist (DentistDto dentistDto){
       saveDentist(dentistDto);
    }

    public void deleteDentist (Long id) { //agregar el throws
        iDentistRepository.deleteById(id);
    }

    public Collection<DentistDto> getAll(){
        List<Dentist> allDentist = iDentistRepository.findAll();
        Set<DentistDto> allDentistDto = new HashSet<DentistDto>();
        for (Dentist dentist: allDentist)
            allDentistDto.add(mapper.convertValue(dentist, DentistDto.class));

        return allDentistDto;
    }


}
