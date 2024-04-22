package com.dreamwings.demo.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dreamwings.demo.Entities.Aviones;
import com.dreamwings.demo.Services.Impl.AvionesServicesImpl;

@RestController
@RequestMapping("/api/avion")
public class AvionesController {

    @Autowired
    private AvionesServicesImpl avionesServicesImpl;
    
    @GetMapping("/obtener")
    public Optional<Aviones> getMethodName(@RequestParam(name = "avionId") String avionId) {
        return this.avionesServicesImpl.obtenerAvion(avionId);
    }
}
