package com.dreamwings.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Vuelos;

@Repository
public interface VuelosRepository extends CrudRepository<Vuelos, String>{
    
}
