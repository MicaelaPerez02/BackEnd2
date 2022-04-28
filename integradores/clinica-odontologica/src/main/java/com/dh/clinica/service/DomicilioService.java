package com.dh.clinica.service;


import com.dh.clinica.model.Domicilio;
import com.dh.clinica.model.Turno;
import com.dh.clinica.repository.impl.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class DomicilioService {
    private final DomicilioRepository domicilioRepository;

    @Autowired
    public DomicilioService(DomicilioRepository domicilioRepository) {
        this.domicilioRepository = domicilioRepository;
    }

    public Domicilio registrarDomicilio(Domicilio d){
        domicilioRepository.save(d);
        return d;
    }
    public Optional<Domicilio> buscarPorId(Long id){
            return domicilioRepository.findById(id);
    }
    public List<Domicilio> buscarTodos(){
        return domicilioRepository.findAll();
    }
    public void eliminar(Long id) {
        domicilioRepository.deleteById(id);
    }

}
