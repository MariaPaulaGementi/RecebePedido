package com.pedido.RecebePedido.repositories;

import com.pedido.RecebePedido.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepositories extends JpaRepository<Cliente, Long> {


}
