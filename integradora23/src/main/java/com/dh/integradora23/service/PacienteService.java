package com.dh.integradora23.service;

import com.dh.integradora23.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class PacienteService {

    private List<Paciente> pacientes;

    public PacienteService() {
        this.pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Pérez", "Frailejón Ernesto", "tuamigoelfrailejonernestoperez@mail.org"));
        pacientes.add(new Paciente("Pekerman", "José", "lomejorquetuvoelfutbolcolombiano@mail.org"));
        pacientes.add(new Paciente("Perez", "Micaela", "micaelaperez663@gmail.com"));
    }

    public List<Paciente> getTodosLosPacientes(){
        return this.pacientes;
    }

    public Paciente getPacientePorEmail(String email){
        Paciente respuesta = null;

        for (Paciente p : pacientes) {
            if(p.getEmail().equals(email)){
                respuesta = p;
            }
        }
        return respuesta;
    }
}
