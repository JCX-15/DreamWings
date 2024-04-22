package com.dreamwings.demo.Services.Impl;


import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamwings.demo.Entities.Asientos;
import com.dreamwings.demo.Entities.Vuelos;
import com.dreamwings.demo.Repositories.AsientosRepository;
import com.dreamwings.demo.Repositories.VuelosRepository;
import com.dreamwings.demo.Services.AsientosServices;

@Service
public class AsientosServicesImpl implements AsientosServices{

    @Autowired
    private AsientosRepository asientosRepository;

    @Autowired
    private VuelosRepository vuelosRepository;


    @Override
    public Asientos seleccionarAsiento(String nombreAsiento, String vuelo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seleccionarAsiento'");
    }

    @Override
    public Asientos deseleccionarAsiento(String nombreAsiento, String VueloId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deseleccionarAsiento'");
    }

    @Override
    public boolean estadoAsiento(String nombreAsiento, String VueloId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estadoAsiento'");
    }

}
