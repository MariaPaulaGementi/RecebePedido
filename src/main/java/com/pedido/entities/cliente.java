package com.pedido.entities;

import jakarta.persistence.*;

@Entity
@Table(name="tb_cliente")
public class cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codCliente;

    public cliente(){

    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
}
