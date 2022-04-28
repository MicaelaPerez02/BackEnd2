package com.example.proyectoIntegradorPerezMicaela.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {

    private Long idAddress;
    private String street;
    private String number;
    private String city;
    private String state;

    public Long getIdAddress() {
        return idAddress;
    }


}

