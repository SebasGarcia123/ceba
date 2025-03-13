
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.Cliente;
import com.ceba.gestion.Repositorio.ClienteRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicioImpl implements ClienteServicio{
    
    @Autowired
    ClienteRepositorio repositorio;
    
    @Override
    public List<Cliente> listarLosClientes() {
        return repositorio.findAll();
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        repositorio.save(cliente);
    }

    @Override
    public Cliente obtenerClientePorIdCliente(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void modificarCliente(Cliente cliente) {
        repositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Long id) {
        repositorio.deleteById(id);
    }
    
}
