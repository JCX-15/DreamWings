package com.dreamwings.demo.Services.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamwings.demo.Entities.Aviones;
import com.dreamwings.demo.Repositories.AvionesRepository;
import com.dreamwings.demo.Services.AvionesServices;

@Service
public class AvionesServicesImpl implements AvionesServices{

    @Autowired
    private AvionesRepository avionesRepository;

    @Override
    public Optional<Aviones> obtenerAvion(String avionId) {
        return this.avionesRepository.findById(avionId);
        
    }
    
    
}
