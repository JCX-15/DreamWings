package com.dreamwings.demo.Services;

import java.util.List;

import com.dreamwings.demo.Entities.Rutas;

public interface RutasServices {
    
    public Rutas obtenerRuta(int rutaId);

    public Rutas obtenerRutaXDestino(String destino);

    public List<Rutas> obtenerRutas();

    public List<String> obtenerOrigenes();

    public List<String> obtenerDestinos(String origen);


}
