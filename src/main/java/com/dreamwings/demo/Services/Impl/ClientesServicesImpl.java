package com.dreamwings.demo.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamwings.demo.DTO.Login;
import com.dreamwings.demo.Entities.Clientes;
import com.dreamwings.demo.Repositories.ClientesRepository;
import com.dreamwings.demo.Services.ClientesServices;

@Service
public class ClientesServicesImpl implements ClientesServices{

    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    public Clientes guardarCliente(Clientes cliente) {
        if (existsByCorreo(cliente.getCorreo())) {
            throw new IllegalArgumentException("Ya existe un cliente con este correo");
        }
        clientesRepository.save(cliente);
        
        return cliente; 
    }

    public boolean existsByCorreo(String correo) {
        return clientesRepository.existsByCorreo(correo);
    }

    @Override
    public Clientes loginCliente(Login login) {
        Clientes clienteEncontrado = clientesRepository.findByCorreoAndContrasenia(login.getCorreo(), login.getContrasenia());
        if (clienteEncontrado != null) {
            return clienteEncontrado;
        } 
        return null;
    }

    @Override
    public boolean obtenerClienteFreecuenteXCorreo(String correo ,String codigoclientefrecuente) {
        if (clientesRepository.findByCorreoAndCodigoClienteFrecuente(correo, codigoclientefrecuente)){
            return clientesRepository.findByCorreoAndCodigoClienteFrecuente(correo, codigoclientefrecuente);
        }
        return false;
    }
}
