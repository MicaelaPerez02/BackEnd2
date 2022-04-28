package com.example.proyectoIntegradorPerezMicaela.service;

import com.example.proyectoIntegradorPerezMicaela.model.AppointmentDto;

import java.util.Collection;

public interface IAppointmentService {
    public void saveAppointment(AppointmentDto appointmentDto);
    public AppointmentDto getAppointmentById(Long id) throws Exception;
    public void deleteAppointment(Long id);
    public void updateAppointment(AppointmentDto appointmentDto);
    public Collection<AppointmentDto> getAll();
}
