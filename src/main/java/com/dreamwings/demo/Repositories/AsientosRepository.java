package com.dreamwings.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Asientos;

@Repository
public interface AsientosRepository extends CrudRepository<Asientos, Integer>{
    
}
