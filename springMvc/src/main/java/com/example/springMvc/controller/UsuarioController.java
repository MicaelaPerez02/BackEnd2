package com.example.springMvc.controller;

import com.example.springMvc.dominio.Usuario;
import com.example.springMvc.services.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    private UsuarioService usuarioService = new UsuarioService();

    @GetMapping("/")
    public Usuario crearUsuario(){
        return usuarioService.crearUsuario();
    }

    @GetMapping("crear2")
        public Usuario crearUsuario2(){
            Usuario usuario = new Usuario("Camila", 20);
            return usuario;
        }

}
