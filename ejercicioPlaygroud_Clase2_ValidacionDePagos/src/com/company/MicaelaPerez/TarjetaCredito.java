package com.company.MicaelaPerez;

public class TarjetaCredito extends Tarjetas{
    private Integer limite;
    private Integer saldoUtilizado;

    public TarjetaCredito(Integer numeroFrente, Integer codigoSeguridad, Double fechaExpiracion, Integer limite, Integer saldoUtilizado) {
        super(numeroFrente, codigoSeguridad, fechaExpiracion);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public Integer getLimite() {
        return limite;
    }

    public Integer getSaldoUtilizado() {
        return saldoUtilizado;
    }
}
