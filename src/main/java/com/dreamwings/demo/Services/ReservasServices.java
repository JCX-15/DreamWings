package com.dreamwings.demo.Services;

import java.util.List;

import com.dreamwings.demo.Entities.Reservas;
import com.dreamwings.demo.Entities.Vuelos;

public interface ReservasServices {
    
    public List<Reservas> obtenerReservasPorCliente(int clienteid);

    public List<Vuelos> obtenerVuelosPorReserva(int reservaid);
}
