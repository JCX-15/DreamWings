package com.dreamwings.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamwings.demo.DTO.Login;
import com.dreamwings.demo.Entities.Clientes;
import com.dreamwings.demo.Services.Impl.ClientesServicesImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("api/cliente")
public class ClientesController {

    @Autowired
    private ClientesServicesImpl clientesservicesimpl;

    @PostMapping("/guardar")
    public Clientes guardarCliente(@RequestBody Clientes cliente) {
        return clientesservicesimpl.guardarCliente(cliente);
    }

    @GetMapping("/login")
    public Clientes login(@RequestBody Login login) {
        return clientesservicesimpl.loginCliente(login);
    }
    
    @GetMapping("/ExisteCCF")
    public boolean obtenerClienteFreecuenteXCorreo(@RequestParam(name = "correo")String correo, 
                                                    @RequestParam(name = "codigoclientefrecuente")String codigoclientefrecuente) {
        return clientesservicesimpl.obtenerClienteFreecuenteXCorreo(correo, codigoclientefrecuente);
    }
    
}
