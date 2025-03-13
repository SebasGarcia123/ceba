
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.Cliente;
import java.util.List;


public interface ClienteServicio {
    
    public List<Cliente> listarLosClientes();
    
    public void guardarCliente(Cliente cliente);
    
    public Cliente obtenerClientePorIdCliente(Long id);
    
    public void modificarCliente(Cliente cliente);
    
    public void eliminarCliente(Long id);
    
}
