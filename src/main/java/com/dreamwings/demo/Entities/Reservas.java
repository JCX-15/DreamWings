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
    private String ReservaId;

    @ManyToOne
    @JoinColumn(name = "clienteid", referencedColumnName = "clienteid")
    private Clientes clienteid;

    public String origen;

    public String destino;

    @Column(name = "fechareserva")
    public Date fechaReserva;

    public int escalas;

    @JsonIgnore
    @OneToMany(mappedBy = "reserva")
    private List<Vuelos> vuelos;
}
