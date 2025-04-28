
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

    private String codigoProducto;
    private String descripcion;
    private int bolsonesPorPallet;
    private Double pesoPorBolson;

    @ManyToMany(mappedBy = "productos")
    private List<Pedido> pedidos;

    public Producto(Long idProducto, String codigoProducto, String descripcion, int bolsonesPorPallet,
            Double pesoPorBolson, List<Pedido> pedidos) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.bolsonesPorPallet = bolsonesPorPallet;
        this.pesoPorBolson = pesoPorBolson;
        this.pedidos = pedidos;
    }

    public Producto(String codigoProducto, String descripcion, int bolsonesPorPallet, Double pesoPorBolson,
            List<Pedido> pedidos) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.bolsonesPorPallet = bolsonesPorPallet;
        this.pesoPorBolson = pesoPorBolson;
        this.pedidos = pedidos;
    }

    public Producto() {
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
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

    public Double getPesoPorBolson() {
        return pesoPorBolson;
    }

    public void setPesoPorBolson(Double pesoPorBolson) {
        this.pesoPorBolson = pesoPorBolson;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
