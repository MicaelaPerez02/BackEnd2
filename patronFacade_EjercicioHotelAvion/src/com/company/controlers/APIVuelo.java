package com.company.controlers;

import com.company.model.Vuelo;

public class APIVuelo {

    public String obternerDatosVuelo(Vuelo vuelo){
        return vuelo.getFechaSalida() + vuelo.getFechaRegreso() + vuelo.getOrigen() + vuelo.getDestino();
    }
}
