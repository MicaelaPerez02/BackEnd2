package com.company.MicaelaPerez;

public class TarjetaDebito extends Tarjetas{
    private Integer saldoDisponible;

    public TarjetaDebito(Integer numeroFrente, Integer codigoSeguridad, Double fechaExpiracion, Integer saldoDisponible) {
        super(numeroFrente, codigoSeguridad, fechaExpiracion);
        this.saldoDisponible = saldoDisponible;
    }

    public Integer getSaldoDisponible() {
        return saldoDisponible;
    }
}
