package com.example.proyectoIntegradorPerezMicaela.repository;

import com.example.proyectoIntegradorPerezMicaela.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address, Long> {
}
