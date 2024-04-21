package com.dreamwings.demo.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamwings.demo.Entities.Rutas;
import com.dreamwings.demo.Entities.Vuelos;
import com.dreamwings.demo.Repositories.RutasRepository;
import com.dreamwings.demo.Repositories.VuelosRepository;
import com.dreamwings.demo.Services.VuelosServices;

@Service
public class VuelosServicesImpl implements VuelosServices{


    @Autowired
    private VuelosRepository vuelosRepository; 

    @Autowired
    private RutasRepository rutasRepository;

    @Override
    public Optional<Vuelos> obtenerVuelo(String vueloId) {
        return this.vuelosRepository.findById(vueloId);
    }

    @Override
    public List<Vuelos> obtenerVuelos() {
        return (List<Vuelos>) this.vuelosRepository.findAll();
    }

    @Override
    public List<Vuelos> buscarVuelosPorRuta(String origen, String destino) {
        Rutas ruta = this.rutasRepository.findByOrigenAndDestino(origen, destino);
    
        if (ruta != null) {
            List<Vuelos> vuelos = ruta.getVuelos();
            return vuelos;
        } 
        return null;
    }
    
}
