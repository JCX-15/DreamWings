package com.dreamwings.demo.Controllers;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamwings.demo.Entities.Vuelos;
import com.dreamwings.demo.Services.Impl.VuelosServicesImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/vuelo")
public class VuelosController {
    
    @Autowired
    private VuelosServicesImpl vueloservicesimpl;

    @GetMapping("/obtenervueloId")
    public Optional<Vuelos> obtenerVuelo(@RequestParam(name = "vueloId") int vueloId) {
        return this.vueloservicesimpl.obtenerVuelo(vueloId);
    }
    
    @GetMapping("/obtenerTodos")
    public List<Vuelos> obtenerVuelos() {
        return this.vueloservicesimpl.obtenerVuelos();
    }
    
}
