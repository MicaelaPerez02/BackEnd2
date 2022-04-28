package com.example.proyectoIntegradorPerezMicaela.service;

import com.example.proyectoIntegradorPerezMicaela.entities.Appointment;
import com.example.proyectoIntegradorPerezMicaela.model.AppointmentDto;
import com.example.proyectoIntegradorPerezMicaela.repository.IAppointmentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AppointmentService implements IAppointmentService{

    @Autowired
    public void setiAppointmentRepository(IAppointmentRepository iAppointmentRepository) {
        this.iAppointmentRepository = iAppointmentRepository;
    }
    private IAppointmentRepository iAppointmentRepository;

    @Autowired
    public void setMapper(ObjectMapper mapper){
        this.mapper = mapper;
    }
    private ObjectMapper mapper;

    public void saveAppointment(AppointmentDto appointmentDto){
        Appointment newAppointment = mapper.convertValue(appointmentDto, Appointment.class);
        iAppointmentRepository.save(newAppointment);
    }

    public AppointmentDto getAppointmentById(Long id) throws Exception{
        Optional<Appointment> found = iAppointmentRepository.findById(id);
        if (found.isPresent())
            return mapper.convertValue(found, AppointmentDto.class);
        else
            throw new Exception("Appointment Not Exist");
    }

    public void deleteAppointment(Long id){
        iAppointmentRepository.deleteById(id);
    }

    public void updateAppointment(AppointmentDto appointmentDto){
        saveAppointment(appointmentDto);
    }

    public Collection<AppointmentDto> getAll(){
        List<Appointment> allAppointment = iAppointmentRepository.findAll();
        Set<AppointmentDto> allAppointmentDto = new HashSet<AppointmentDto>();
        for (Appointment appointment: allAppointment)
            allAppointmentDto.add(mapper.convertValue(appointment, AppointmentDto.class));

        return allAppointmentDto;
    }
}
