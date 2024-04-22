package com.dreamwings.demo.Services;

import com.dreamwings.demo.Entities.Asientos;


public interface AsientosServices {
    

    public Asientos seleccionarAsiento(String nombreAsiento, String  vuelo);

    public Asientos deseleccionarAsiento(String nombreAsiento, String VueloId); 

    public boolean estadoAsiento(String nombreAsiento, String VueloId);

}
