package com.pedido.RecebePedido.controllers;

import com.pedido.RecebePedido.entities.Pedido;
import com.pedido.RecebePedido.repositories.PedidosRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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
    @GetMapping(value = "/id/{id}")
    public Pedido findById(@PathVariable Long id){
        Pedido pedidoId =  repository.findById(id).get();
        return pedidoId;
    }

    //insere pedido
    @PostMapping
    public Pedido insert(@RequestBody Pedido pedido) {
        Long valorTotal = (long) 0;
        if (pedido.getDataCadastro() == null)
            pedido.setDataCadastro(new Date());

        if (pedido.getQuantidadeProd() == null)
            pedido.setQuantidadeProd((long) 1);


        if (pedido.getQuantidadeProd() > 5 && pedido.getQuantidadeProd() < 10){
            valorTotal = (pedido.getValorUniProduto() * pedido.getQuantidadeProd());
            valorTotal = valorTotal + ((long) 0.05 * valorTotal);
       }
       else if ( pedido.getQuantidadeProd() > 10 ) {
            valorTotal = (pedido.getValorUniProduto() * pedido.getQuantidadeProd());
            valorTotal = valorTotal + ((long) 0.10 * valorTotal);
        }
       else {
            valorTotal = (pedido.getValorUniProduto() * pedido.getQuantidadeProd());
        }

        pedido.setValortotal(valorTotal);
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
