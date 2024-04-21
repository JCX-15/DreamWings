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
    private int asientoId;

    @ManyToOne
    @JoinColumn(name = "TipoAsientoId", referencedColumnName = "TipoAsientoId")
    private TipoAsientos tipoasientoid;

    @ManyToOne
    @JoinColumn(name = "VueloId", referencedColumnName = "VueloId")
    private Vuelos vueloId;

    @Column(name = "nombreasiento")
    private String nombreAsiento;

    private char disponible;

}
