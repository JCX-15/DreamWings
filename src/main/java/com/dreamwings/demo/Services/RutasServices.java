package com.dreamwings.demo.Services;

import java.util.List;
import java.util.Optional;

import com.dreamwings.demo.Entities.Rutas;

public interface RutasServices {
    
    public Optional<Rutas> obtenerRuta(int rutaId);

    public Rutas obtenerRutaOrigenXDestino(String origen, String destino);

    public List<Rutas> obtenerRutas();

    public List<String> obtenerOrigenes();

    public List<String> obtenerDestinos(String origen);


}
