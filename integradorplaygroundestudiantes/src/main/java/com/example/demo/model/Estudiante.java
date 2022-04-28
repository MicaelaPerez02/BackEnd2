package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;


@Entity
@Table(name="Estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String apellido;

    @OneToMany(mappedBy = "estudiante")
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
