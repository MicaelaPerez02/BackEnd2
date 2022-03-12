package com.company.test;

import com.company.FachadaBusqueda;
import com.company.model.Hotel;
import com.company.model.Vuelo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FachadaBusquedaTest {

    @Test
    public void buscar_coincidaFechaDeVueloYHotel() {
        //DADO
        FachadaBusqueda sujetoDePrueba = new FachadaBusqueda();
        Vuelo vueloPrueba = new Vuelo("10/03/2022 ", "25/03/2022 ", "Buenos Aires ", "Paris ");
        Hotel hotelPrueba = new Hotel("10/03/2022 ", "25/03/2022 ", "Paris");

        //CUANDO
        String esperado = sujetoDePrueba.buscar(vueloPrueba, hotelPrueba);

        //ENTONCES
        Assertions.assertEquals(esperado, "10/03/2022 25/03/2022 Buenos Aires Paris 10/03/2022 25/03/2022 Paris");
    }
}