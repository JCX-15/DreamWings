package com.dreamwings.demo.Services.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dreamwings.demo.Entities.Vuelos;
import com.dreamwings.demo.Services.VuelosServices;

@Service
public class VuelosServicesImpl implements VuelosServices{

    @Override
    public Vuelos obtenerVuelo(String vueloId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVuelo'");
    }

    @Override
    public List<Vuelos> obtenerVuelos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVuelos'");
    }

    @Override
    public List<Vuelos> buscarVuelosPorRuta(String origen, String destino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarVuelosPorRuta'");
    }
    
}
