
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.ItemLoteProduccion;
import com.ceba.gestion.Repositorio.ItemLoteProduccionRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemLoteProduccionServicioImpl implements ItemLoteProduccionServicio {
    
    @Autowired
    ItemLoteProduccionRepositorio repositorio;
    
    @Override
    public List<ItemLoteProduccion> listarLosItemLoteProduccion() {
        return repositorio.findAll();
    }

    @Override
    public void guardarItemLoteProduccion(ItemLoteProduccion item) {
        repositorio.save(item);
    }

    @Override
    public ItemLoteProduccion obtenerItemLoteProduccionPorIdItemLoteProducciono(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void modificarItemLoteProduccion(ItemLoteProduccion item) {
        repositorio.save(item);
    }

    @Override
    public void eliminarItemLoteProduccion(Long id) {
        repositorio.deleteById(id);
    }
    
}
