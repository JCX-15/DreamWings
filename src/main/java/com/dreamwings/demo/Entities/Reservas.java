package com.dreamwings.demo.Entities;

import java.sql.Date;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "reservas")
public class Reservas {
    
    @Id
    @Column(name = "reservaid")
    public String ReservaId;

    @ManyToOne
    @JoinColumn(name = "ClienteId", referencedColumnName = "ClienteId")
    private Clientes cliente;

    @Column(name = "origen")
    public String Origen;

    @Column(name = "destino")
    public String Destino;

    @Column(name = "fechareserva")
    public Date FechaReserva;

    @Column(name = "escalas")
    public int Escalas;

    @JsonIgnore
    @OneToMany(mappedBy = "reserva")
    private List<Vuelos> vuelos;
}
