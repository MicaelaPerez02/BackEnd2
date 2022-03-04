package com.company.MicaelaPerez;

public class Tarjetas {
    private Integer numeroFrente;
    private Integer codigoSeguridad;
    private Double fechaExpiracion;

    public Tarjetas(Integer numeroFrente, Integer codigoSeguridad, Double fechaExpiracion) {
        this.numeroFrente = numeroFrente;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaExpiracion = fechaExpiracion;
    }

    public Integer getNumeroFrente() {
        return numeroFrente;
    }

    public Integer getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public Double getFechaExpiracion() {
        return fechaExpiracion;
    }


}
