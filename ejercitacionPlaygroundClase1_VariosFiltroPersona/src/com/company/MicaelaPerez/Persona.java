package com.company.MicaelaPerez;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private String mail;
    private Integer edad;

    public Persona(String nombre, String apellido, String mail, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.edad = edad;
    }

    public boolean mostrarApellidoyNombre(String dato, String dato2) {
        if (apellido.equals(dato) && nombre.equals(dato2)) {
            return true;
        } else
            return false;
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public Integer getEdad() {
        return edad;
    }
}
