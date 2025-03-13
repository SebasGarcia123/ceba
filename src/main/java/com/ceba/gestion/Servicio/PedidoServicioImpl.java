
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.Pedido;
import com.ceba.gestion.Repositorio.PedidoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServicioImpl implements PedidoServicio {

    @Autowired
    PedidoRepositorio repositorio;
    
    @Override
    public List<Pedido> listarLosPedidos() {
        return repositorio.findAll();
    }

    @Override
    public void guardarPedido(Pedido pedido) {
        repositorio.save(pedido);
    }

    @Override
    public Pedido obtenerPedidoPorIdPedido(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void modificarPedido(Pedido pedido) {
        repositorio.save(pedido);
    }

    @Override
    public void eliminarPedido(Long id) {
        repositorio.deleteById(id);
    }
    
}
