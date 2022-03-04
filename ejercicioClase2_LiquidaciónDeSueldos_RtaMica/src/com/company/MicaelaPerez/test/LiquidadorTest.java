package com.company.MicaelaPerez.test;

import com.company.MicaelaPerez.model.Empleado;
import com.company.MicaelaPerez.model.EmpleadoContratado;
import com.company.MicaelaPerez.model.EmpleadoEfectivo;
import com.company.MicaelaPerez.service.Liquidador;
import com.company.MicaelaPerez.service.LiquidadorEmpleadoContratado;
import com.company.MicaelaPerez.service.LiquidadorEmpleadoEfectivo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LiquidadorTest {
    @Test
    public void deberiaEmitirUnDocDigitalParaEmpleadoEfectivo() {
        //ARRANGE
        Liquidador prueba = new LiquidadorEmpleadoEfectivo();
        Empleado empleado = new EmpleadoEfectivo("Micaela", "Perez", 123,15000, 2500,6000);
        String rtaEsperada = "La liquidación generada es un documento digital. Saldo a liquidar: 18500";

        //ACT
        String rta = prueba.liquidarSueldo(empleado);

        //ASSERT
        Assertions.assertEquals(rtaEsperada, rta);
    }

    @Test
    public void deberiaEmitirUnDocDigitalParaEmpleadoContratado(){
        //ARRANGE
        Liquidador prueba = new LiquidadorEmpleadoContratado();
        Empleado empleado = new EmpleadoContratado("Carina", "Gordo", 456, 40,500);
        String rtaEsperada = "La liquidación generada es un docuento impreso. Saldo a liquidar: 20000";

        //ACT
        String rta = prueba.liquidarSueldo(empleado);

        //ASSERT
        Assertions.assertEquals(rtaEsperada,rta);
    }

    @Test
    public void deberiaRetornarMensajeDeErrorCuandoNoSePuedeLiquidar(){
        //ARRANGE
        Liquidador prueba = new LiquidadorEmpleadoEfectivo();
        Empleado empleado = new EmpleadoContratado("Micaela", "Perez", 245, 50, 700);
        String rtaEsperada = "La liquidación no pudo ser calculada";

        //ACT
        String rta = prueba.liquidarSueldo(empleado);

        //ASSERT
        Assertions.assertEquals(rtaEsperada,rta);
    }

}