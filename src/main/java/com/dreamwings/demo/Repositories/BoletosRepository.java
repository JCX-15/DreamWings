package com.dreamwings.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Boletos;

@Repository
public interface BoletosRepository extends CrudRepository<Boletos, Integer>{
    
}
