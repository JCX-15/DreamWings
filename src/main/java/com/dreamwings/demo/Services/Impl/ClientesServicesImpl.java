package com.dreamwings.demo.Services.Impl;

import java.util.Optional;

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
        if (clientesRepository.existsByCorreo(cliente.getCorreo())) {
            throw new IllegalArgumentException("Ya existe un cliente con este correo");
        }
        Clientes nvoCliente = new Clientes();
        nvoCliente.setNombre(cliente.getNombre());
        nvoCliente.setApellido(cliente.getApellido());
        nvoCliente.setCorreo(cliente.getCorreo());
        nvoCliente.setContrasenia(cliente.getContrasenia());
        nvoCliente.setTelefono(cliente.getTelefono());
        nvoCliente.setCodigoClienteFrecuente(cliente.getCodigoClienteFrecuente());
        clientesRepository.save(nvoCliente);
        
        return nvoCliente; 
    }

    @Override
    public Clientes loginCliente(Login login) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loginCliente'");
    }
    
    @Override
    public boolean obtenerClienteFreecuenteXCorreo(String correo ,String codigoclientefrecuente) {
        if (clientesRepository.existsByCorreoAndCodigoClienteFrecuente(correo, codigoclientefrecuente)){
            return clientesRepository.existsByCorreoAndCodigoClienteFrecuente(correo, codigoclientefrecuente);
        }
        return false;
    }


    
}
