package com.company.MicaelaPerez.model;

import com.company.MicaelaPerez.service.Documento;

public abstract class FuncionarioPublico {
    protected Integer acceso;
    protected FuncionarioPublico funcionarioSiguiente;

    public String leerDoc(Documento doc) {
        String extra = ".";
        if (funcionarioSiguiente != null) {
            extra = funcionarioSiguiente.leerDoc(doc);
        }
        if (doc.getTipoAcceso() <= this.acceso) {
            return this.getClass().getSimpleName() + " leyó el doc " + extra;
        }
        return extra;
    }

    public void setFuncionarioSiguiente(FuncionarioPublico funcionario) {
        funcionarioSiguiente = funcionario;
    }
}
