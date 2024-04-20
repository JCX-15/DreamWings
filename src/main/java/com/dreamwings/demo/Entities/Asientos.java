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
@Table(name = "Asientos")
public class Asientos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asientoid")
    private int AsientoId;

    @Column(name = "tipoasientoid")
    private int TipoAsientoId;

    @Column(name = "vueloid")
    private String VueloId;

    @Column(name = "nombreasiento")
    private String NombreAsiento;

    @Column(name = "disponible")
    private char Disponible;

}
