package com.company.MicaelaPerez.model;

import com.company.MicaelaPerez.model.Empleado;

public class EmpleadoContratado extends Empleado {
    private Integer cantHorasTrabajadas;
    private Integer tarifaPorHora;

    public EmpleadoContratado(String nombre, String apellido, Integer numeroDeCuenta, Integer cantHorasTrabajadas, Integer tarifaPorHora) {
        super(nombre, apellido, numeroDeCuenta);
        this.cantHorasTrabajadas = cantHorasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public Integer getCantHorasTrabajadas() {
        return cantHorasTrabajadas;
    }

    public Integer getTarifaPorHora() {
        return tarifaPorHora;
    }
}
