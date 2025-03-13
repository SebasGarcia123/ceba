
package com.ceba.gestion.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_prod")
public class ItemLoteProduccion {
    
    @Id
    @Column(name = "id_item_prod")
    private Long idItemProd;
    private int cantidad;
    
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
    
    @ManyToOne
    @JoinColumn(name = "id_lote")
    private LoteDeProduccion lote;

    public ItemLoteProduccion() {
    }

    public ItemLoteProduccion(int cantidad, Producto producto, LoteDeProduccion lote) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.lote = lote;
    }

    public ItemLoteProduccion(Long idItemProd, int cantidad, Producto producto, LoteDeProduccion lote) {
        this.idItemProd = idItemProd;
        this.cantidad = cantidad;
        this.producto = producto;
        this.lote = lote;
    }

    public Long getIdItemProd() {
        return idItemProd;
    }

    public void setIdItemProd(Long idItemProd) {
        this.idItemProd = idItemProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public LoteDeProduccion getLote() {
        return lote;
    }

    public void setLote(LoteDeProduccion lote) {
        this.lote = lote;
    }
    
}
