package com.dreamwings.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamwings.demo.Entities.Rutas;
import com.dreamwings.demo.Services.Impl.RutasServicesImpl;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/rutas")
public class RutasController {
    
    @Autowired
    private RutasServicesImpl rutasServicesImpl;

    @GetMapping("/obtener")
    public Optional<Rutas> getMethodName(@RequestParam(name = "rutaId") int rutaId) {
        return this.rutasServicesImpl.obtenerRuta(rutaId);
    }
    
    @GetMapping("/obetenerOrigenXDestino")
    public Rutas obtenerRutaOrigenXDestino(@RequestParam(name = "origen")String origen, @RequestParam(name= "destino")String destino) {
        return this.rutasServicesImpl.obtenerRutaOrigenXDestino(origen, destino);
    }
    
    @GetMapping("/obtenerTodas")
    public List<Rutas> obetenRutas() {
        return this.rutasServicesImpl.obtenerRutas();
    }


    @GetMapping("/obtenerOrigen")
    public List<String> obtenerOrigen() {
        return this.rutasServicesImpl.obtenerOrigenes();
    }
    
    @GetMapping("/obtenerDestino")
    public List<String> obtenerDestino(@RequestParam(name = "origen")String origen) {
        return this.rutasServicesImpl.obtenerDestinos(origen);
    }
    

}
