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
    private int ClienteId;

    @Column(name="nombre")
    private String Nombre;

    @Column(name = "apellido")
    private String Apellido;

    @Column(name = "correo")
    private String Correo;

    @Column(name ="contrasenia")
    private String Contrasenia;

    @Column(name = "telefono")
    private String Telefono;

    @Column(name = "codigoclientefrecuente")
    private String CodigoClienteFrecuente;

    @OneToMany(mappedBy = "ClienteId", cascade = CascadeType.ALL)
    private List<Reservas> reservas;
}
