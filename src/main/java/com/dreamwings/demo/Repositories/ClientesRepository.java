package com.dreamwings.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Clientes;


@Repository
public interface ClientesRepository extends CrudRepository<Clientes, Integer>{
    Clientes findByCorreo(String correo);

    Clientes findByContrasenia(String contrasenia);

    Clientes findByCodigoClienteFrecuente(String codigoClienteFrecuente);

    Clientes findByCorreoAndContrasenia(String correo, String contrasenia);

    boolean existsByCorreo(String correo);

    boolean existsByCorreoAndCodigoClienteFrecuente(String correo, String codigoClienteFrecuente);

    boolean existsByCorreoAndContrasenia(String correo, String contrasenia);
}