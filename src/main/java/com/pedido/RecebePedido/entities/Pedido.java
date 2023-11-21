package com.pedido.RecebePedido.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="tb_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numeroControle;
    private Date dataCadastro;
    private String nomeProduto;
    private Long valorUniProduto;
    private Long quantidadeProd;
    private String codCliente;

    private String valortotal;

    public Pedido(){

    }

    public String getValortotal() {
        return valortotal;
    }

    public void setValortotal(String valortotal) {
        this.valortotal = valortotal;
    }
    public Long getNumeroControle() {
        return numeroControle;
    }

    public void setNumeroControle(Long numeroControle) {
        this.numeroControle = numeroControle;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Long getValorUniProduto() {
        return valorUniProduto;
    }

    public void setValorUniProduto(Long valorUniProduto) {
        this.valorUniProduto = valorUniProduto;
    }

    public Long getQuantidadeProd() {
        return quantidadeProd;
    }

    public void setQuantidadeProd(Long quantidadeProd) {
        this.quantidadeProd = quantidadeProd;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
