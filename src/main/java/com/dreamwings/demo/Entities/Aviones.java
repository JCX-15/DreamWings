package com.dreamwings.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Aviones")
public class Aviones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "avionid")
    public int AvionId;

    @Column(name = "capacidad")
    public int Capacidad;

    @Column(name = "modelo")
    public String Modelo;
}
