package com.dreamwings.demo.Services;

import java.util.List;

import com.dreamwings.demo.Entities.Vuelos;

public interface VuelosServices {
    
    public Vuelos obtenerVuelo(String vueloId);

    public List<Vuelos> obtenerVuelos();

    public List<Vuelos> buscarVuelosPorRuta(String origen, String destino);


}
