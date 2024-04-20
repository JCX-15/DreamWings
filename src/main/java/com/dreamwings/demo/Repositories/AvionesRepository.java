package com.dreamwings.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreamwings.demo.Entities.Aviones;

@Repository
public interface AvionesRepository extends CrudRepository<Aviones, String>{

}
