package com.dreamwings.demo.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamwings.demo.Entities.TipoAsientos;
import com.dreamwings.demo.Repositories.TipoAsientoRepository;
import com.dreamwings.demo.Services.TipoAsientosServices;

@Service
public class TipoAsientosServicesImpl implements TipoAsientosServices{

    @Autowired
    private TipoAsientoRepository tipoAsientoRepository; 
        
    @Override
    public List<TipoAsientos> obetenerTipoAsientos() {

        return (List<TipoAsientos>) this.tipoAsientoRepository.findAll();
        
    }
    
}
