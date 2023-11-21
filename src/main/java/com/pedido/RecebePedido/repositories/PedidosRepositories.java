package com.pedido.RecebePedido.repositories;

import com.pedido.RecebePedido.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PedidosRepositories extends JpaRepository<Pedido, Long> {

}
