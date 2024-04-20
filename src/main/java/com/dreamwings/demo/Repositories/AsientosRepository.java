package com.dreamwings.demo.Repositories;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Asientos;

@Repository
public interface AsientosRepository extends CrudRepository<Asientos, Integer>{
    //List<Asientos> findByVuelo_vueloIdAsientos(String id);

    //Asientos findBynombreAsientoAndidvuelo(String nombreAsiento, String idVuelo);
}
