package com.example.proyectoIntegradorPerezMicaela.controller;

import com.example.proyectoIntegradorPerezMicaela.model.AddressDto;
import com.example.proyectoIntegradorPerezMicaela.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private IAddressService addressService;

    @PostMapping
    public ResponseEntity<AddressDto> addAddress(@RequestBody AddressDto addressDto){
        ResponseEntity<AddressDto> response = ResponseEntity.internalServerError().build();
        if(addressDto != null) {
            AddressDto savedAddress = addressService.saveAddress(addressDto);
            if (savedAddress.getIdAddress() != null) {
                response = ResponseEntity.ok(savedAddress);
            }
        }
        return response;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressDto> getAddressById(@PathVariable Long id) {
        ResponseEntity<AddressDto> response = ResponseEntity.notFound().build();
        AddressDto addressDTO = addressService.getAddressById(id);
        if(addressDTO != null) {
            response = ResponseEntity.ok(addressDTO);
        }
        return response;
    }
}
