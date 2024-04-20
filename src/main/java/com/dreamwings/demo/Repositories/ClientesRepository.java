package com.dreamwings.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Clientes;


@Repository
public interface ClientesRepository extends CrudRepository<Clientes, Integer>{
    Clientes findByCodigoClienteFrecuente(String codigoClienteFrecuente);

    Clientes findByCorreoAndContrasenia(String correo, String contrasenia);
}