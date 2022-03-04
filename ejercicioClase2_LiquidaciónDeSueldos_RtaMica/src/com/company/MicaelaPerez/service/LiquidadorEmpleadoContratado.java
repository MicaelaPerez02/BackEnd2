package com.company.MicaelaPerez.service;

import com.company.MicaelaPerez.model.Empleado;
import com.company.MicaelaPerez.model.EmpleadoContratado;

public class LiquidadorEmpleadoContratado extends Liquidador{
    @Override
    public String liquidarSueldo(Empleado empleado){
        String mensajeRta = "La liquidación no pudo ser calculada";

        if (empleado instanceof EmpleadoContratado){
            EmpleadoContratado empleadoContratado = (EmpleadoContratado) empleado;
            //revisar
            Integer sueldoFinal = empleadoContratado.getCantHorasTrabajadas()*empleadoContratado.getTarifaPorHora();
            mensajeRta = "La liquidación generada es un docuento impreso. Saldo a liquidar: " + sueldoFinal;
        }
        return mensajeRta;
    }

}
