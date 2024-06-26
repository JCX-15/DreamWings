package com.dreamwings.demo.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "aviones")
public class Aviones {
    
    @Id
    @Column(name = "avionid")
    private String avionId;

    private int capacidad;

    private String modelo;

    @JsonIgnore
    @OneToMany(mappedBy = "avion")
    private List<Vuelos> vuelos;
}
