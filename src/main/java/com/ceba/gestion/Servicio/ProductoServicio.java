
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.Producto;
import java.util.List;


public interface ProductoServicio {
    
    public List<Producto> listarLosProductos();
    
    public void guardarProducto(Producto producto);
    
    public Producto obtenerProductoPorIdProducto(Long id);
    
    public void modificarProducto(Producto producto);
    
    public void eliminarProducto(Long id);
    
}
