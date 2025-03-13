
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.Producto;
import com.ceba.gestion.Repositorio.ProductoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicioImpl implements ProductoServicio {

    @Autowired
    ProductoRepositorio repositorio;
    
    @Override
    public List<Producto> listarLosProductos() {
        return repositorio.findAll();
    }

    @Override
    public void guardarProducto(Producto producto) {
        repositorio.save(producto);
    }

    @Override
    public Producto obtenerProductoPorIdProducto(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void modificarProducto(Producto producto) {
        repositorio.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        repositorio.deleteById(id);
    }
    
}
