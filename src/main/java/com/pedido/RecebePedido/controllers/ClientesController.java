package com.pedido.RecebePedido.controllers;

import com.pedido.RecebePedido.entities.Cliente;
import com.pedido.RecebePedido.repositories.ClientesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClientesController {

    @Autowired
    private ClientesRepositories repository;

    @GetMapping
    public List<Cliente> findAll(){
        List<Cliente> listClientes =  repository.findAll();
        return listClientes;
    }

    @GetMapping(value = "/{id}")
    public Cliente findById(@PathVariable Long id){
        Cliente clienteId =  repository.findById(id).get();
        return clienteId;
    }

    @PostMapping
    public Cliente insert(@RequestBody Cliente clientes){
        Cliente saveCliente =  repository.save(clientes);
        return saveCliente;
    }
}
