package com.company.MicaelaPerez;

import java.util.List;
import java.util.stream.Collectors;

public class ListaPersonasFiltro {
    public List<Persona> filtrar(List<Persona> personas){
        return personas.stream()
                .filter(p -> p.esMayorDeEdad() && p.getNombre().length()>5)
                .collect(Collectors.toList());

        /*Tengo la lista personas, con personas sin filtrar y le pido que
        me filtre según mis condiciones, devolviendome una nueva lista (collect),
        que tiene almacenado lo que le pedí.
         */
    }
}
