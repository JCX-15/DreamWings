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
    public int AsientoId;

    /*@ManyToOne
    @JoinColumn(name = "TipoAsientoId")
    @Column(name = "tipoasientoid")
    public TipoAsientos TipoAsientoId;
*/
    @Column(name = "vueloid")
    public String VueloId;

    @Column(name = "nombreasiento")
    public String NombreAsiento;

    @Column(name = "disponible")
    public char Disponible;

}
