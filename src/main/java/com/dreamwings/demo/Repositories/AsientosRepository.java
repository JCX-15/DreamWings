package com.dreamwings.demo.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Asientos;
import com.dreamwings.demo.Entities.Vuelos;

@Repository
public interface AsientosRepository extends CrudRepository<Asientos, Integer>{
    List<Asientos> findByVueloId(Vuelos vueloId);


}
