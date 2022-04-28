package com.example.proyectoIntegradorPerezMicaela.entities;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DATE")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "id")
    private Dentist dentist;
}
