package com.company.MicaelaPerez.service;

import com.company.MicaelaPerez.model.Empleado;

public abstract class Liquidador {
    public abstract String liquidarSueldo(Empleado empleado); //metodo plantilla

    public String depositarSueldo(Empleado empleado){
        return "Sueldo depositado en la cuenta " + empleado.getNumeroDeCuenta();
    }

    //imprimir recibo no es abstracta porque cambia dependiendo el empleado.
}
