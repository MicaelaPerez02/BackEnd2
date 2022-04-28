package com.example.proyectoIntegradorPerezMicaela.service;

import com.example.proyectoIntegradorPerezMicaela.entities.Address;
import com.example.proyectoIntegradorPerezMicaela.model.AddressDto;
import com.example.proyectoIntegradorPerezMicaela.model.PatientDto;
import com.example.proyectoIntegradorPerezMicaela.repository.IAddressRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService implements IAddressService{

    @Autowired
    public void setAddressRepository(IAddressRepository iAddressRepository) {
        this.iAddressRepository = iAddressRepository;
    }
    private IAddressRepository iAddressRepository;

    @Autowired
    public void setMapper(ObjectMapper mapper){
        this.mapper = mapper;
    }
    private ObjectMapper mapper;

    public AddressDto saveAddress(AddressDto addressDTO) {
        Address addressToSave = mapper.convertValue(addressDTO, Address.class);
        Address savedAddress = iAddressRepository.save(addressToSave);
        return mapper.convertValue(savedAddress, AddressDto.class);
    }

    public AddressDto getAddressById(Long id) {
        AddressDto response = null;
        Optional<Address> address = iAddressRepository.findById(id);
        if (address.isPresent()) {
            response = mapper.convertValue(address.get(), AddressDto.class);
        }
        return response;
    }

    public Boolean saveAddressFromPatientDTO(PatientDto patientDTO) {
        Boolean isAddressSaved = false;
        Address savedAddress = null;
        Address addressToSave = mapper.convertValue(patientDTO.getAddress(), Address.class);
        if (addressToSave != null) {
            savedAddress = iAddressRepository.save(addressToSave);
            if (savedAddress.getId() != null) {
                isAddressSaved = true;
            }
        }
        return isAddressSaved;
    }

}
