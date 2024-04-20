package com.dreamwings.demo.Services.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dreamwings.demo.Entities.Asientos;
import com.dreamwings.demo.Services.AsientosServices;

@Service
public class AsientosServicesImpl implements AsientosServices{

    @Override
    public List<Asientos> asientosDeVuelo(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asientosDeVuelo'");
    }

    @Override
    public Asientos seleccionarAsiento(String nombreAsiento, String VueloId) {
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
