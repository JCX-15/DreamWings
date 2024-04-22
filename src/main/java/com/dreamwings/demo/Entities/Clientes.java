package com.dreamwings.demo.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "clientes")
public class Clientes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "clienteid")
    private int clienteId;

    private String nombre;

    private String apellido;

    private String correo;

    private String contrasenia;

    private String telefono;

    @Column(name = "codigoclientefrecuente")
    private String codigoClienteFrecuente;

    @OneToMany(mappedBy = "clienteid", cascade = CascadeType.ALL)
    private List<Reservas> reservas;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Boletos> boletos;

}
