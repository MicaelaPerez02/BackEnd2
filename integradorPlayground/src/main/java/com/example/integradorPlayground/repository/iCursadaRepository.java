package com.example.integradorPlayground.repository;


import com.example.integradorPlayground.model.Cursada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iCursadaRepository extends JpaRepository<Cursada, Long> {
}
