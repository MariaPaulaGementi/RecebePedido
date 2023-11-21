package com.pedido.controllers;

import com.pedido.entities.Cliente;
import com.pedido.repositories.ClientesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
