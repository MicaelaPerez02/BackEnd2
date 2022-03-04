package com.company.MicaelaPerez;

public class Animal {
    private String tipo;
    private String tamaño;
    private Integer peso;

    public Animal(String tipo, String tamaño, Integer peso) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    public boolean esPesado(){
        return this.peso > 2000 && this.tamaño.equals("grande");
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public Integer getPeso() {
        return peso;
    }
}
