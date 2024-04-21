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
    public Asientos seleccionarAsiento(String nombreAsiento, String vueloId) {
        
        List<Asientos> asientos = (List<Asientos>) this.asientosRepository.findAll();

        for(Asientos nvoAsiento:asientos ){
            if (nvoAsiento.getNombreAsiento().equals(nombreAsiento) && nvoAsiento.getVueloId().equals(vueloId)){
                if (nvoAsiento.getDisponible()=='1'){
                    nvoAsiento.setDisponible('0');
                    asientosRepository.save(nvoAsiento);
                    return nvoAsiento;
                }
            }       
        }
    
        return null;
    }

    

    @Override
    public Asientos deseleccionarAsiento(String nombreAsiento, String vueloId) {
        List<Asientos> asientos = (List<Asientos>) this.asientosRepository.findAll();
        Optional<Vuelos> vuelo = this.vuelosRepository.findById(vueloId);

        for(Asientos nvoAsiento:asientos ){
            if (nvoAsiento.getNombreAsiento().equals(nombreAsiento) && nvoAsiento.getVueloId().equals(vuelo)){
                if (nvoAsiento.getDisponible()=='0'){
                    nvoAsiento.setDisponible('1');
                    asientosRepository.save(nvoAsiento);
                    return nvoAsiento;
                }
            }       
        }
    
        return null;
    }

    @Override
    public boolean estadoAsiento(String nombreAsiento, String vueloId) {
        
        List<Asientos> asientos = (List<Asientos>) this.asientosRepository.findAll();

        for(Asientos nvoAsiento:asientos ){
            if (nvoAsiento.getNombreAsiento().equals(nombreAsiento) && nvoAsiento.getVueloId().equals(vueloId)){
                if (nvoAsiento.getDisponible()=='1'){
                    return true;
                } else{
                    return false;
                }
            }       
        }
        return false;
    }

}
