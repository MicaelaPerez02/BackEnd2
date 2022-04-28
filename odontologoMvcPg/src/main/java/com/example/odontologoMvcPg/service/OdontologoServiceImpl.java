package com.example.odontologoMvcPg.service;
import com.example.odontologoMvcPg.domain.Odontologo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

@Service
public class OdontologoServiceImpl implements OdontologoService {
    @Override
    public List<Odontologo> listaOdontologos(){
        return Arrays.asList(new Odontologo("Mica"), new Odontologo("Cami"));
    }
}
