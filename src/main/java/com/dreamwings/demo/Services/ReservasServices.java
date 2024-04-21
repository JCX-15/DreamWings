package com.dreamwings.demo.Services;

import java.util.Date;
import java.util.List;

import com.dreamwings.demo.Entities.Vuelos;


public interface ReservasServices {
    
    public List<Vuelos> obtenerVuelosPorReserva(String reservaId);

    public String ReporteDestinosFrecuentes();
    
    public Date ReporteFechaFrecuente();

}
