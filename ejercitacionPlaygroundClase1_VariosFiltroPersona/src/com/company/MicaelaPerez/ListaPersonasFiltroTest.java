package com.company.MicaelaPerez;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class ListaPersonasFiltroTest {
    @Test
    public void siCumpleLasCondicionesAgregaALaLista(){
        //ARRANGE - DATOS
        Persona mica = new Persona("Micaela", "Perez", "micaelaperez663@gmail.com", 19);
        Persona josu = new Persona("Josue", "Madruga", "josumadruga@gmail.com", 19);
        Persona manu = new Persona("Manuel", "Perez Etchegaray", "manu@gmail.com", 20);
        Persona nani = new Persona("Nadia", "Martin Montesi", "nani@gmail.com", 19);
        Persona cam = new Persona("Camila", "Gauto", "camgauto@gmail.com", 19);
        Persona bondio = new Persona("Micaela", "Libonatti", "bondio@gmail.com", 20);
        Persona agus = new Persona("Agustin", "Rivarola", "agusriva@gmail.com", 17);
        Persona leonel = new Persona("Leonel", "Contreras", "leocontreras@gmail.com", 15);

        //creo la lista en donde almaceno a las personas y las filtro
        ListaPersonasFiltro filtro = new ListaPersonasFiltro();

        //ACT - EJECUCION
        List<Persona> resultado = filtro.filtrar(List.of(mica,josu,manu,nani,cam,agus,leonel,bondio));

        //ASSERT - COMPROBACIÓN

        /*Poniendo todas las edades en menores, funciona, si no, da mal
        Assert.assertTrue(resultado.size()==0); */

        //Si pongo a dos mayores, funciona con 1 porque 1 es menor que 5
        Assert.assertTrue(resultado.size()==1);

    }

}