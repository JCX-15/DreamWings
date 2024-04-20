package com.dreamwings.demo.Entities;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "rutas")
public class Rutas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rutaid")
    private int rutaId;

    @Column(name = "origen")
    private String Origen;

    @Column(name = "destino")
    private String Destino;

    @Column(name="distancia")
    private boolean Distancia;

    @JsonIgnore
    @OneToMany(mappedBy = "ruta")
    private List<Vuelos> vuelos;

}
