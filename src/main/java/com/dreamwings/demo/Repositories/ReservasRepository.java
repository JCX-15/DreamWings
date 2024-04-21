package com.dreamwings.demo.Repositories;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Reservas;

@Repository
public interface ReservasRepository extends CrudRepository <Reservas, String>{


    @Query(value = "SELECT destinos, COUNT(destinos) AS repeticiones FROM reservas GROUP BY destinos ORDER BY repeticiones DESC LIMIT 1", nativeQuery = true)
    String findMostFrequentDestino();

    @Query(value = "SELECT fechareserva, COUNT(fechareserva) AS repeticiones FROM reservas GROUP BY fechareserva ORDER BY repeticiones DESC LIMIT 1", nativeQuery = true)
    Date findMostFrequentDate();

}
