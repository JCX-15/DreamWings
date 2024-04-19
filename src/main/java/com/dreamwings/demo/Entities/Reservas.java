package com.dreamwings.demo.Entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "Reservas")
public class Reservas {
    
    @Id
    @Column(name = "reservaid")
    public String ReservaId;

    /*public int Clienteid;*/

    @Column(name = "origen")
    public String Origen;

    @Column(name = "destino")
    public String Destino;

    @Column(name = "fechareserva")
    public Date FechaReserva;

    @Column(name = "escalas")
    public int Escalas;
}
