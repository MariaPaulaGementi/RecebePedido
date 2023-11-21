package com.pedido.RecebePedido.controllers;

import com.pedido.RecebePedido.entities.Pedido;
import com.pedido.RecebePedido.repositories.PedidosRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    @Autowired
    private PedidosRepositories repository;

    //busca todos
    @GetMapping
    public List<Pedido> findAll(){
        List<Pedido> listPedidos =  repository.findAll();
        return listPedidos;
    }

    //busca pelo ID
    @GetMapping(value = "/{id}")
    public Pedido findById(@PathVariable Long id){
        Pedido pedidoId =  repository.findById(id).get();
        return pedidoId;
    }

    //insere pedido
    @PostMapping
    public Pedido insert(@RequestBody Pedido pedido){
        Pedido savePedido =  repository.save(pedido);
        return savePedido;
    }

    //busca pelo numero do pedido
    @GetMapping(value = "/cliente/{codCliente}")
    public List<Pedido> getPedido(@PathVariable String codCliente){
        List<Pedido> pedidos =  findAll();
        return pedidos.stream().filter(pedido -> pedido.getCodCliente().equals(codCliente)).toList();
    }
}
