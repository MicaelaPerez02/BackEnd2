package com.example.proyectoIntegradorPerezMicaela.service;

import com.example.proyectoIntegradorPerezMicaela.model.AddressDto;
import com.example.proyectoIntegradorPerezMicaela.model.PatientDto;

public interface IAddressService {
    public AddressDto saveAddress(AddressDto addressDTO);
    public AddressDto getAddressById(Long id);
    public Boolean saveAddressFromPatientDTO(PatientDto patientDTO);
}
