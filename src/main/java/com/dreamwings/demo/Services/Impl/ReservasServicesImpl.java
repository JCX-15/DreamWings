package com.dreamwings.demo.Services.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamwings.demo.Entities.Vuelos;
import com.dreamwings.demo.Repositories.ReservasRepository;
import com.dreamwings.demo.Repositories.VuelosRepository;
import com.dreamwings.demo.Services.ReservasServices;

@Service
public class ReservasServicesImpl implements ReservasServices{

    @Autowired
    private ReservasRepository reservasRepository;

    @Autowired
    private VuelosRepository vuelosRepository;

    @Override
    public String ReporteDestinosFrecuentes() {
        return this.reservasRepository.findMostFrequentDestino();
    }

    @Override
    public Date ReporteFechaFrecuente() {
        return this.reservasRepository.findMostFrequentDate();
    }

    @Override
    public List<Vuelos> obtenerVuelosPorReserva(String reservaId) {
        List<Vuelos> vuelos = (List<Vuelos>) this.vuelosRepository.findAll();
        List<Vuelos> vuelosfiltros = new ArrayList<Vuelos>();
        for(Vuelos vuelo:vuelos){
            if(vuelo.getReserva().equals(reservaId)){
                vuelosfiltros.add(vuelo);
            }
        }
        return (List<Vuelos>) vuelosfiltros;
        }
    
}
