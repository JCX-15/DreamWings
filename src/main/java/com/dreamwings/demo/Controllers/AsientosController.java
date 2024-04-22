package com.dreamwings.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamwings.demo.Entities.Asientos;
import com.dreamwings.demo.Services.Impl.AsientosServicesImpl;

@RestController
@RequestMapping("/api/asiento")
public class AsientosController {
    
    @Autowired
    private AsientosServicesImpl asientosservicesimpl;

    @PutMapping("/seleccionarAsiento/{nombreAsiento}/{vueloId}")
    public Asientos seleccionarAsiento(
            @PathVariable(name = "nombreAsiento") String nombreAsiento,
            @PathVariable(name = "vueloId") String vueloId) {
        return this.asientosservicesimpl.seleccionarAsiento(nombreAsiento, vueloId);
    }

    @GetMapping("/estado-asiento/{nombreAsiento}/{vueloId}")
    public boolean estadoAsiento(@PathVariable String nombreAsiento, @PathVariable String vueloId) {
        return asientosservicesimpl.estadoAsiento(nombreAsiento, vueloId);
    }
}
