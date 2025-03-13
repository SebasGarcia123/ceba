
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.Estado;
import java.util.List;


public interface EstadoServicio {
    
    public List<Estado> listarLosEstados();
    
    public void guardarEstado(Estado estado);
    
    public Estado obtenerEstadoPorIdEstado(Long id);
    
    public void modificarEstado(Estado estado);
    
    public void eliminarEstado(Long id);
    
}
