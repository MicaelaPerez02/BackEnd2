package com.company;

import com.company.controlers.APIHotel;
import com.company.controlers.APIVuelo;
import com.company.model.Hotel;
import com.company.model.Vuelo;

public class FachadaBusqueda {

    //LocalDate fechaHoy = LocalDate.now();

    private APIVuelo apiVuelo;
    private APIHotel apiHotel;

    public FachadaBusqueda(){
        apiVuelo = new APIVuelo();
        apiHotel = new APIHotel();
    }

    public String buscar(Vuelo vuelo, Hotel hotel){
        String vueloYHotel = "";
        vueloYHotel = vueloYHotel + apiVuelo.obternerDatosVuelo(vuelo) + apiHotel.obternerDatosHotel(hotel);
        return vueloYHotel;
    }
}
