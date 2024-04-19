package com.dreamwings.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.TipoAsientos;

@Repository
public interface TipoAsientoRepository extends CrudRepository<TipoAsientos, Integer>{
    
}
