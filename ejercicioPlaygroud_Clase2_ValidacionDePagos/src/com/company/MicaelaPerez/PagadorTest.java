package com.company.MicaelaPerez;

import org.junit.Assert;
import org.junit.Test;


public class PagadorTest {
    @Test
    public void deberiaNotificarSiLaTarjetaDeDebitoEstaAutorizada(){
        //ARRANGE
        Pagador pruebapagador = new PagadorDebito();
        Tarjetas tarjeta = new TarjetaDebito(123,1,2010.,1000);
        String rtaEsperada = "La tarjeta de debito esta autorizada, true";

        //ACT
        String rta = pruebapagador.estaAutorizada(tarjeta,100);

        //ASSERT
        Assert.assertEquals(rtaEsperada,rta);
    }

    @Test
    public void deberiaNotificarSiLaTarjetaDeCreditoEstaAutorizada(){
        //ARRANGE
        Pagador pruebapagador = new PagadorCredito();
        Tarjetas tarjeta = new TarjetaCredito(2113,5,2015.,1000,400);
        String rtaEsperada = "La tarjeta de credito esta autorizada, true";

        //ACT
        String rta = pruebapagador.estaAutorizada(tarjeta, 500);
        //ASSERT

        Assert.assertEquals(rtaEsperada,rta);
    }


}