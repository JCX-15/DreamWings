package com.dreamwings.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Rutas;

@Repository
public interface RutasRepository extends CrudRepository <Rutas,Integer> {

    Rutas findByOrigenAndDestino(String origen, String destino);
    
}
