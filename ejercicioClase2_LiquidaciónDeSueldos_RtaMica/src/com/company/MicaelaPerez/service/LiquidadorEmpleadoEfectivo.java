package com.company.MicaelaPerez.service;

import com.company.MicaelaPerez.model.Empleado;
import com.company.MicaelaPerez.model.EmpleadoEfectivo;

public class LiquidadorEmpleadoEfectivo extends Liquidador{
    @Override
    public String liquidarSueldo(Empleado empleado){
        String mensajeRta = "La liquidación no pudo ser calculada";
        if (empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo empleadoEfectivo = (EmpleadoEfectivo) empleado;
            Integer sueldoFinal = empleadoEfectivo.getSueldoBasico()+ empleadoEfectivo.getPremios()-empleadoEfectivo.getDescuentos();
            mensajeRta = "La liquidación generada es un documento digital. Saldo a liquidar: " + sueldoFinal;
        } return mensajeRta;
    }
}
