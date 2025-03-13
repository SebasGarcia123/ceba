
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.LoteDeProduccion;
import java.util.List;


public interface LoteDeProduccionServicio {
    
    public List<LoteDeProduccion> listarLosLotesDeProduccion();
    
    public void guardarLoteDeProduccion(LoteDeProduccion lote);
    
    public LoteDeProduccion obtenerLoteDeProduccionPorIdLoteDeProduccion(Long id);
    
    public void modificarLoteDeProduccion(LoteDeProduccion lote);
    
    public void eliminarLoteDeProduccion(Long id);
    
}
