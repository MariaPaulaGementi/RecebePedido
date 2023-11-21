package com.pedido.controllers;

import com.pedido.entities.Cliente;
import com.pedido.entities.Pedido;
import com.pedido.repositories.ClientesRepositories;
import com.pedido.repositories.PedidosRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidosController {

    @Autowired
    private PedidosRepositories repository;

    @GetMapping
    public List<Pedido> findAll(){
        List<Pedido> listPedidos =  repository.findAll();
        return listPedidos;
    }

    @GetMapping(value = "/{id}")
    public Pedido findById(@PathVariable Long id){
        Pedido pedidoId =  repository.findById(id).get();
        return pedidoId;
    }

    @PostMapping
    public Pedido insert(@RequestBody Pedido pedido){
        Pedido savePedido =  repository.save(pedido);
        return savePedido;
    }
}
