package com.company.MicaelaPerez.model;

import com.company.MicaelaPerez.service.Documento;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FuncionarioPublicoTest {
    @Test
    public void leerDoc_SiElMsjEsCorrecto(){
        //ARRANGE
        FuncionarioPublico diputado = new Diputado();
        FuncionarioPublico ministro = new Ministro();
        FuncionarioPublico presidente = new Presidente();
        Documento docPrueba = new Documento("holis", 1);

        //ACT
        diputado.setFuncionarioSiguiente(ministro);
        ministro.setFuncionarioSiguiente(presidente);
        String rtadoEsperado = diputado.leerDoc(docPrueba);

        //ASSERT
        Assert.assertEquals(rtadoEsperado,"Diputado leyó el doc" + " Ministro leyó el doc" + " Presidente leyó el doc .");
    }

}