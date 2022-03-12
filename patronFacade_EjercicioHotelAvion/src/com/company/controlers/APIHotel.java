package com.company.controlers;

import com.company.model.Hotel;

public class APIHotel {

    public String obternerDatosHotel(Hotel hotel){
        return hotel.getFechaEntrada() + hotel.getFechaSalida() + hotel.getCiudad();
    }
}
