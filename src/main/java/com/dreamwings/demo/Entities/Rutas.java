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

    private String origen;

    private String destino;

    private boolean distancia;

    @JsonIgnore
    @OneToMany(mappedBy = "ruta")
    private List<Vuelos> vuelos;

}
