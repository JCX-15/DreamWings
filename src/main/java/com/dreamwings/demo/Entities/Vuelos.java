package com.dreamwings.demo.Entities;

import java.sql.Date;
import java.sql.Time;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    public Date fechaPartida;

    @Column(name = "nuemerovuelo")
    public int numeroVuelo;

    @Column(name = "horallegada")
    public Time horaLlegada;

    @Column(name = "horapartida")
    public Time horaPartida;

    @Column(name = "puertaabordaje")
    public int puertaAbordaje;

}
