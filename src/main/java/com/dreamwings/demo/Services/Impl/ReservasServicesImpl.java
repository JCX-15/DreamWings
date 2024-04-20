package com.dreamwings.demo.Services.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dreamwings.demo.Entities.Reservas;
import com.dreamwings.demo.Entities.Vuelos;
import com.dreamwings.demo.Services.ReservasServices;

@Service
public class ReservasServicesImpl implements ReservasServices{

    @Override
    public List<Reservas> obtenerReservasPorCliente(int clienteid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerReservasPorCliente'");
    }

    @Override
    public List<Vuelos> obtenerVuelosPorReserva(int reservaid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVuelosPorReserva'");
    }
    
}
