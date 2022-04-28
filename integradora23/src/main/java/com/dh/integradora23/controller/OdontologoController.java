package com.dh.integradora23.controller;

import com.dh.integradora23.model.Odontologo;
import com.dh.integradora23.model.Paciente;
import com.dh.integradora23.service.OdontologoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OdontologoController {
    private OdontologoService odontologoService = new OdontologoService();

    @RequestMapping(method = RequestMethod.GET, path = "odontodos") //traeme todos con el /todos
    public List<Odontologo> getTodosLosPacientes(){
        return odontologoService.getOdontologos();
    }

    @GetMapping("/odontologo")
    public String getOdontologo(@RequestParam("id") Integer id){
        return "Hola: " + odontologoService.getOdontologo(id);
    }
}


