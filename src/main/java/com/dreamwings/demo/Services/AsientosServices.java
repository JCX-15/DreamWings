package com.dreamwings.demo.Services;

import java.util.List;

import com.dreamwings.demo.Entities.Asientos;

public interface AsientosServices {
    
    public List<Asientos> asientosDeVuelo(String id);

    public Asientos seleccionarAsiento(String nombreAsiento, String idVuelo);

    public Asientos deseleccionarAsiento(String nombreAsiento, String idVuelo); 

    public boolean estadoAsiento(String nombreAsiento, String idVuelo);
}
