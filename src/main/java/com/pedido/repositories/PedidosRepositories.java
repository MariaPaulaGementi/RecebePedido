package com.pedido.repositories;

import com.pedido.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PedidosRepositories extends JpaRepository<Pedido, Long> {

}
