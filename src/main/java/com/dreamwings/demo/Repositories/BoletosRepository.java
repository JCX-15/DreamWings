package com.dreamwings.demo.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Boletos;
import com.dreamwings.demo.Entities.Clientes;

@Repository
public interface BoletosRepository extends CrudRepository<Boletos, Integer>{
    
    List<Boletos> findByCliente(Optional<Clientes> cliente);
}
