package com.dreamwings.demo.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamwings.demo.DTO.BoletoJson;
import com.dreamwings.demo.DTO.BoletoSinCliente;
import com.dreamwings.demo.Entities.Boletos;
import com.dreamwings.demo.Entities.Clientes;
import com.dreamwings.demo.Repositories.BoletosRepository;
import com.dreamwings.demo.Repositories.ClientesRepository;
import com.dreamwings.demo.Services.BoletosServices;


@Service
public class BoletosServicesImpl implements BoletosServices{

    @Autowired
    private BoletosRepository boletosRepository;

    @Autowired
    private ClientesRepository clientesRepository;


    @Override
    public String crearBoleto(BoletoJson boleto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearBoleto'");
    }

    @Override
    public List<Boletos> boletosDeUsuario(int id) {
        Optional<Clientes> cliente = this.clientesRepository.findById(id);
        List<Boletos> boletos = this.boletosRepository.findByCliente(cliente);
        return boletos;
    }

    @Override
    public String crearBoletoSinCliente(BoletoSinCliente boleto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearBoletoSinCliente'");
    }
    
    
}
