package com.company.MicaelaPerez;


import com.company.MicaelaPerez.Pagador;
import com.company.MicaelaPerez.Tarjetas;

public class PagadorCredito extends Pagador{

    @Override
    public String estaAutorizada(Tarjetas tarjeta, Integer gasto) {
            String mensaje = "La tarjeta de credito no esta autorizada";
            Boolean autorizacion;
            if (tarjeta instanceof TarjetaCredito && (((TarjetaCredito) tarjeta).getLimite()-((TarjetaCredito) tarjeta).getSaldoUtilizado())>gasto){
                autorizacion = true;
                mensaje = "La tarjeta de credito esta autorizada, "+ autorizacion;
            } return mensaje;
    }
}
