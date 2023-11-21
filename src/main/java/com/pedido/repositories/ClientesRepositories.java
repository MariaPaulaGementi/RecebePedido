package com.pedido.repositories;

import com.pedido.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepositories extends JpaRepository<Cliente, Long> {


}
