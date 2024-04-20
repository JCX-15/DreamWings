package com.dreamwings.demo.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Reservas;

@Repository
public interface ReservasRepository extends CrudRepository <Reservas, String>{
    @Query(value = "SELECT fechareserva, COUNT(fechareserva) AS repeticiones FROM reservas GROUP BY fechareserva ORDER BY repeticiones DESC LIMIT 1", nativeQuery = true)
    Reservas findMostFrequentDate();
}
