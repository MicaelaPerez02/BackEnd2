package main.com.dh.clinica.dao.impl;

import main.com.dh.clinica.dao.IDao;
import main.com.dh.clinica.model.Domicilio;
import main.com.dh.clinica.model.Paciente;
import main.com.dh.clinica.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PacienteDaoH2 implements IDao<Paciente> {

    private final static Logger logger = Logger.getLogger(PacienteDaoH2)
    @Override
    public Paciente guardar(Paciente paciente) {
        return null;
    }

    @Override
    public Paciente buscar(int id) {
        return null;
    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public List<Paciente> buscarTodos() {
        return null;
    }
}
