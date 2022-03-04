package com.company.MicaelaPerez;

public class PagadorDebito extends Pagador {
    @Override
    public String estaAutorizada(Tarjetas tarjeta, Integer gasto) {
        String mensaje = "La tarjeta de debito no esta autorizada";
        Boolean autorizacion;
        if (tarjeta instanceof TarjetaDebito && ((TarjetaDebito) tarjeta).getSaldoDisponible()>gasto){
            autorizacion = true;
            mensaje = "La tarjeta de debito esta autorizada, "+ autorizacion;
        } return mensaje;
    }
}
