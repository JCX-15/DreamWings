package com.dreamwings.demo.Entities;

import java.sql.Date;
import java.sql.Time;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
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
@Table(name = "vuelos")
public class Vuelos {

    @Id
    @Column(name = "vueloid")
    public String vueloId;
    
    @ManyToOne
    @JoinColumn(name = "avionid", referencedColumnName = "avionid")
    private Aviones avion; 

    @ManyToOne
    @JoinColumn(name = "rutaid", referencedColumnName = "rutaid")
    private Rutas ruta; 

    @ManyToOne
    @JoinColumn(name = "reservaid", referencedColumnName = "reservaid")
    private Reservas reserva;

    @Column(name = "fechapartida")
    private Date fechaPartida;

    @Column(name = "nuemerovuelo")
    private int numeroVuelo;

    @Column(name = "horallegada")
    private Time horaLlegada;

    @Column(name = "horapartida")
    private Time horaPartida;

    @Column(name = "puertaabordaje")
    private int puertaAbordaje;

    @JsonIgnore
    @OneToMany(mappedBy = "vueloId", cascade = CascadeType.ALL)
    private List<Asientos> asientos;

}
