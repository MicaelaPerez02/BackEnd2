package com.company.MicaelaPerez.model;

import com.company.MicaelaPerez.model.Empleado;

public class EmpleadoEfectivo extends Empleado {
    private Integer sueldoBasico;
    private Integer descuentos;
    private Integer premios;

    public EmpleadoEfectivo(String nombre, String apellido, Integer numeroDeCuenta, Integer sueldoBasico, Integer descuentos, Integer premios) {
        super(nombre, apellido, numeroDeCuenta);
        this.sueldoBasico = sueldoBasico;
        this.descuentos = descuentos;
        this.premios = premios;
    }

    public Integer getSueldoBasico() {
        return sueldoBasico;
    }

    public Integer getDescuentos() {
        return descuentos;
    }

    public Integer getPremios() {
        return premios;
    }
}
