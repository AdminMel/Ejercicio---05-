package com.upiiz.restaurant.repositories;

import com.upiiz.restaurant.entities.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {
}
