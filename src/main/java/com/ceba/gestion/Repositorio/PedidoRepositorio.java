
package com.ceba.gestion.Repositorio;

import com.ceba.gestion.Modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {
    
}
