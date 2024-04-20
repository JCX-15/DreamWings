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
@Table(name = "boletos")
public class Boletos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boletoid")
    public int BoletoId;

    @Column(name = "clienteid")
    public int ClienteId;

    @Column(name = "asientoid")
    public int AsientoId;

    @Column(name = "precio")
    public double Precio;
}
