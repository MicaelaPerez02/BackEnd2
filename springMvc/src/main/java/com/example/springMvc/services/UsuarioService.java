package com.example.springMvc.services;

import com.example.springMvc.dominio.Usuario;

public class UsuarioService {

    public Usuario crearUsuario() {
        Usuario usuario = new Usuario("Micaela", 20);
        return usuario;
    }
}