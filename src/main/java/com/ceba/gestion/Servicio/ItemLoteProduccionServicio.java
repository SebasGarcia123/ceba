
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.ItemLoteProduccion;
import java.util.List;


public interface ItemLoteProduccionServicio {
    
    public List<ItemLoteProduccion> listarLosItemLoteProduccion();
    
    public void guardarItemLoteProduccion(ItemLoteProduccion item);
    
    public ItemLoteProduccion obtenerItemLoteProduccionPorIdItemLoteProducciono(Long id);
    
    public void modificarItemLoteProduccion(ItemLoteProduccion item);
    
    public void eliminarItemLoteProduccion(Long id);
    
}
