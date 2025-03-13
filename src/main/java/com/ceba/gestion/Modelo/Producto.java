
package com.ceba.gestion.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "producto")
public class Producto {
    
    @Id
    @Column(name = "id_producto")
    private Long idProducto;
    
    private String descripcion;
    private int bolsonesPorPallet;
    
    @ManyToMany(mappedBy = "productos")
    private List<Pedido> pedidos;

    public Producto() {
    }

    public Producto(String descripcion, int bolsonesPorPallet) {
        this.descripcion = descripcion;
        this.bolsonesPorPallet = bolsonesPorPallet;
    }

    public Producto(Long idProducto, String descripcion, int bolsonesPorPallet) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.bolsonesPorPallet = bolsonesPorPallet;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getBolsonesPorPallet() {
        return bolsonesPorPallet;
    }

    public void setBolsonesPorPallet(int bolsonesPorPallet) {
        this.bolsonesPorPallet = bolsonesPorPallet;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    
}
