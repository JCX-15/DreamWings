package com.dreamwings.demo.Services;

import java.util.List;

import com.dreamwings.demo.Entities.Asientos;

public interface AsientosServices {
    
    public List<Asientos> asientosDeVuelo(String id);

    public Asientos seleccionarAsiento(String nombreAsiento, String VueloId);

    public Asientos deseleccionarAsiento(String nombreAsiento, String VueloId); 

    public boolean estadoAsiento(String nombreAsiento, String VueloId);

    public Asientos seleccionarAsientoNombre(String nombreAsiento, String VueloId);
}
