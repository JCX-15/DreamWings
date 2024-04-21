package com.dreamwings.demo.Services;

import java.util.List;

import com.dreamwings.demo.DTO.BoletoJson;
import com.dreamwings.demo.DTO.BoletoSinCliente;
import com.dreamwings.demo.Entities.Boletos;

public interface BoletosServices {
    
    public String crearBoleto(BoletoJson boleto);

    public String crearBoletoSinCliente(BoletoSinCliente boleto);

    public List<Boletos> boletosDeUsuario(int id);
}
