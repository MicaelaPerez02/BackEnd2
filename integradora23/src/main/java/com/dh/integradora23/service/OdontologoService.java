package com.dh.integradora23.service;

import com.dh.integradora23.model.Odontologo;

import java.util.ArrayList;
import java.util.List;

public class OdontologoService {
    private List<Odontologo> odontologos;

    public OdontologoService() {
        this.odontologos = new ArrayList<>();
        this.odontologos.add(new Odontologo(1, "Micaela", "Perez", 123));
        this.odontologos.add(new Odontologo(2, "Leonel", "Mola", 456));
    }

    public List<Odontologo> getOdontologos() {
        return odontologos;
    }

    public Odontologo getOdontologo (Integer id) {
        for (Odontologo odontologo : odontologos) {
            if (odontologo.getId().equals(id)) {
                return odontologo;
            }
        }
        return null;
    }
}
