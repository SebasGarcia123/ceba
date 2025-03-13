
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.LoteDeProduccion;
import com.ceba.gestion.Repositorio.LoteDeProduccionRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoteDeProduccionServicioImpl implements LoteDeProduccionServicio{

    @Autowired
    LoteDeProduccionRepositorio repositorio;
    
    @Override
    public List<LoteDeProduccion> listarLosLotesDeProduccion() {
        return repositorio.findAll();
    }

    @Override
    public void guardarLoteDeProduccion(LoteDeProduccion lote) {
        repositorio.save(lote);
    }

    @Override
    public LoteDeProduccion obtenerLoteDeProduccionPorIdLoteDeProduccion(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void modificarLoteDeProduccion(LoteDeProduccion lote) {
        repositorio.save(lote);
    }

    @Override
    public void eliminarLoteDeProduccion(Long id) {
        repositorio.deleteById(id);
    }
    
}
