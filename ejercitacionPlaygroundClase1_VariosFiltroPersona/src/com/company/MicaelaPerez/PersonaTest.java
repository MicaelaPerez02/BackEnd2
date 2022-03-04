package com.company.MicaelaPerez;

import org.junit.Assert;
import org.junit.Test;


public class PersonaTest {
    @Test
   public void siEsMayorDe18Años() {
        //ARRANGE - A COMPROBAR
        Persona sujetoPrueba = new Persona("Micaela", "Perez", "micaelaperez663@gmail.com", 19);

        //ACT - PRUEBA
        boolean respuesta = sujetoPrueba.esMayorDeEdad();

        //ASSERT - COMPROBACION
        Assert.assertTrue(respuesta);

    }

    public void siElApellidoyNombreSonCorrectos(){
        //ARRANGE
        Persona sujetoPrueba = new Persona("Micaela", "Perez", "micaelaperez663@gmail.com", 19);

        //ACT
        boolean respuesta = sujetoPrueba.mostrarApellidoyNombre("Perez", "Micaela");

        //ASSERT
        Assert.assertTrue(respuesta);
    }



}