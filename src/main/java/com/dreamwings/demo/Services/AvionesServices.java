package com.dreamwings.demo.Services;

import java.util.Optional;

import com.dreamwings.demo.Entities.Aviones;

public interface AvionesServices {
    
    public Optional<Aviones> obtenerAvion(String avionId);
}
