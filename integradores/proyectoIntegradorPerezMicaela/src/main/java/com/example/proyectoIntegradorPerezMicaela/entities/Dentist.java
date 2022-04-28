package com.example.proyectoIntegradorPerezMicaela.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "DENTIST")
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "LICENSE")
    private String license;

    @OneToMany(mappedBy = "dentist", fetch = FetchType.LAZY) //fetch type lazy??
    @JsonIgnore
    private Set<Appointment> appointments = new HashSet<>();

}