package com.dreamwings.demo.Services;

import com.dreamwings.demo.DTO.Login;
import com.dreamwings.demo.Entities.Clientes;

public interface ClientesServices {
    public Clientes guardarCliente(Clientes cliente);

    public Clientes loginCliente(Login login);
}
