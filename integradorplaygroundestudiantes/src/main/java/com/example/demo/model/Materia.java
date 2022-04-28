package com.example.integradorPlayground.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Materia {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "materia")
    @JsonIgnore
    private Set<com.example.integradorPlayground.model.Cursada> cursadas;

    public Set<com.example.integradorPlayground.model.Cursada> getCursadas() {
        return cursadas;
    }

    public void setCursadas(Set<com.example.integradorPlayground.model.Cursada> cursadas) {
        this.cursadas = cursadas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
