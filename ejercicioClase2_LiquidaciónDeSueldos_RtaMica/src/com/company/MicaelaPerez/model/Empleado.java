package com.company.MicaelaPerez.model;

public class Empleado {
    private String nombre;
    private String apellido;
    private Integer numeroDeCuenta;

    public Empleado(String nombre, String apellido, Integer numeroDeCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public Integer getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
}
