package com.dreamwings.demo.Services.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dreamwings.demo.Entities.Rutas;
import com.dreamwings.demo.Services.RutasServices;

@Service
public class RutasServicesImpl implements RutasServices{

    @Override
    public Rutas obtenerRuta(int rutaId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerRuta'");
    }

    @Override
    public Rutas obtenerRutaXDestino(String destino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerRutaXDestino'");
    }

    @Override
    public List<Rutas> obtenerRutas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerRutas'");
    }

    @Override
    public List<String> obtenerOrigenes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerOrigenes'");
    }

    @Override
    public List<String> obtenerDestinos(String origen) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerDestinos'");
    }
    
}
