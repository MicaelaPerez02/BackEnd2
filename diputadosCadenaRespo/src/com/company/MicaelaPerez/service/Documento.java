package com.company.MicaelaPerez.service;

import com.company.MicaelaPerez.model.FuncionarioPublico;

public class Documento{
    private String contenido;
    private Integer tipoAcceso;

    public Documento(String contenido, Integer tipoAcceso) {
        this.contenido = contenido;
        this.tipoAcceso = tipoAcceso;
    }

    public Integer getTipoAcceso() {
        return tipoAcceso;
    }
}
