package com.dreamwings.demo.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Rutas;

@Repository
public interface RutasRepository extends CrudRepository <Rutas,Integer> {
    @Query(value = "SELECT destinos, COUNT(destinos) AS repeticiones FROM rutas GROUP BY destinos ORDER BY repeticiones DESC LIMIT 1", nativeQuery = true)
    Rutas findMostFrequentDestino();
}
