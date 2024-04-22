package com.dreamwings.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamwings.demo.Entities.TipoAsientos;
import com.dreamwings.demo.Services.Impl.TipoAsientosServicesImpl;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/tipoasiento")
public class TipoAsientosController {
    
    @Autowired
    private TipoAsientosServicesImpl TipoAsientosServicesImpl;

    @GetMapping("/obtener")
    public List<TipoAsientos> obetenerTipoAsientos() {
        return this.TipoAsientosServicesImpl.obetenerTipoAsientos();
    }
    

}
