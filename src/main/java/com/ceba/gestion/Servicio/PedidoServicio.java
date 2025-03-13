
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.Pedido;
import java.util.List;


public interface PedidoServicio {
    
    public List<Pedido> listarLosPedidos();
    
    public void guardarPedido(Pedido pedido);
    
    public Pedido obtenerPedidoPorIdPedido(Long id);
    
    public void modificarPedido(Pedido pedido);
    
    public void eliminarPedido(Long id);
    
}
