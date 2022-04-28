package com.dh.integradora23.controller;

import com.dh.integradora23.model.Paciente;
import com.dh.integradora23.service.PacienteService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PacienteController {

    private PacienteService service = new PacienteService();

    @RequestMapping(method = RequestMethod.GET, path = "todos") //traeme todos con el /todos
    public List<Paciente> getTodosLosPacientes(){
        return service.getTodosLosPacientes();
    }

    @GetMapping("pacientePorEmail")
    public String getPacientePorEmail(@RequestParam String email){
        return service.getPacientePorEmail(email).toString();
    }

}
