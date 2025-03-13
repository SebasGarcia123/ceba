
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.Estado;
import com.ceba.gestion.Repositorio.EstadoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoServicioImpl implements EstadoServicio{
    
    @Autowired
    EstadoRepositorio repositorio;
    
    @Override
    public List<Estado> listarLosEstados() {
        return repositorio.findAll();
    }

    @Override
    public void guardarEstado(Estado estado) {
        repositorio.save(estado);
    }

    @Override
    public Estado obtenerEstadoPorIdEstado(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void modificarEstado(Estado estado) {
        repositorio.save(estado);
    }

    @Override
    public void eliminarEstado(Long id) {
        repositorio.deleteById(id);
    }
}
