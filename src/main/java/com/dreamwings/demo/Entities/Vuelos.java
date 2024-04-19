package com.dreamwings.demo.Entities;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Vuelos")
public class Vuelos {

    @Id
    @Column(name = "vueloid")
    public String VueloId;
    
    @Column(name = "avionid")
    public int AvionId;

    @Column(name = "rutaid")
    public int RutaId;

    @Column(name = "reservaid")
    public String Reservaid;

    @Column(name = "fechapartida")
    public Date FechaPartida;

    @Column(name = "nuemerovuelo")
    public int NumeroVuelo;

    @Column(name = "horallegada")
    public Time HoraLlegada;

    @Column(name = "horapartida")
    public Time HoraPartida;

    @Column(name = "puertaabordaje")
    public int PuertaAbordaje;

}
