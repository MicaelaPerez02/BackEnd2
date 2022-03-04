package com.company.MicaelaPerez;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class AnimalTest {
    @Test
    public void siElAnimalEsPesado(){
        Animal caballo = new Animal("caballo", "grande", 3000);
        Animal perro = new Animal("perro", "mediano",20);

        boolean esPesado= caballo.esPesado();
        boolean esPesado1 = perro.esPesado();

        //Assertions.assertEquals(true, caballo.esPesado());
        Assertions.assertTrue(esPesado);
        Assertions.assertFalse(esPesado1);
    }

}