package com.dreamwings.demo.Services.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamwings.demo.Entities.Rutas;
import com.dreamwings.demo.Repositories.RutasRepository;
import com.dreamwings.demo.Services.RutasServices;

@Service
public class RutasServicesImpl implements RutasServices{

    @Autowired
    private RutasRepository rutasRepository;

    @Override
    public Optional<Rutas> obtenerRuta(int rutaId) {
        return this.rutasRepository.findById(rutaId);
    }

    @Override
    public Rutas obtenerRutaOrigenXDestino(String origen, String destino) {
        List<Rutas> rutas = (List<Rutas>) this.rutasRepository.findAll();

        for (Rutas ruta : rutas) {
            if(ruta.getDestino().equals(destino) && ruta.getOrigen().equals(origen)){
                return ruta;
            }
        }

        return null;
    }

    @Override
    public List<Rutas> obtenerRutas() {
        return (List<Rutas>) this.rutasRepository.findAll();

    }

    @Override
    public List<String> obtenerOrigenes() {
        List<Rutas> lstrutas = (List<Rutas>) this.rutasRepository.findAll();

        List<String> origenes = new ArrayList<>();

        for (Rutas ruta : lstrutas) {
            String origen = ruta.getOrigen();
            if (!origenes.contains(origen)) {
                origenes.add(origen);
            }
        }
        return origenes;
    }

    @Override
    public List<String> obtenerDestinos(String origen) {
        List<Rutas> rutas = (List<Rutas>) this.rutasRepository.findAll();
        List<String> destinos = new ArrayList<>();
        for (Rutas ruta : rutas) {
            if(ruta.getOrigen().equals(origen)){
                destinos.add(ruta.getDestino());
            }
        }

        return destinos;
    }

    
    
}
