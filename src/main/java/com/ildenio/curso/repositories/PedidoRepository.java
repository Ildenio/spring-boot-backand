package com.ildenio.curso.repositories;


import com.ildenio.curso.domain.Cliente;
import com.ildenio.curso.domain.Pedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    @Transactional(readOnly = true)
    Page<Pedido>findByCliente(Cliente cliente, Pageable pageRequest);
}
