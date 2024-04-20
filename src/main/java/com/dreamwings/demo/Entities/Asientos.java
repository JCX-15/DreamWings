package com.dreamwings.demo.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "asientos")
public class Asientos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asientoid")
    private int AsientoId;

    @ManyToOne
    @JoinColumn(name = "TipoAsientoId", referencedColumnName = "TipoAsientoId")
    private TipoAsientos tipoasientoid;

    @Column(name = "vueloid")
    private String VueloId;

    @Column(name = "nombreasiento")
    private String NombreAsiento;

    @Column(name = "disponible")
    private char Disponible;

}
