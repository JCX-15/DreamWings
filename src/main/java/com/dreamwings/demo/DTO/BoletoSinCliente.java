package com.dreamwings.demo.DTO;

import lombok.Data;

@Data
public class BoletoSinCliente {
    private String nombreCliente;
    private String apellidoCliente;
    private String telefonoCliente;
    private Integer asientoId;
}
