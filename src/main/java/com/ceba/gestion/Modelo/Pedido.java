
package com.ceba.gestion.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Entity
public class Pedido {
    
    @Id
    @Column(name = "nro_pedido")
    private Long nroPedido;
    private Date fechaCarga;
    private Date fechaPrometido;
    
    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @ManyToMany
    @JoinTable(name = "productos_por_pedido", joinColumns = @JoinColumn (name = "nro_pedido", 
            referencedColumnName = "nro_pedido"),
            inverseJoinColumns = @JoinColumn (name = "id_producto", referencedColumnName = "id_producto"))
    private List<Producto> productos;

    public Pedido() {
    }

    public Pedido(Date fechaCarga, Date fechaPrometido, Estado estado, Cliente cliente) {
        this.fechaCarga = fechaCarga;
        this.fechaPrometido = fechaPrometido;
        this.estado = estado;
        this.cliente = cliente;
        this.productos = productos;
    }

    public Pedido(Long nroPedido, Date fechaCarga, Date fechaPrometido, Estado estado, Cliente cliente) {
        this.nroPedido = nroPedido;
        this.fechaCarga = fechaCarga;
        this.fechaPrometido = fechaPrometido;
        this.estado = estado;
        this.cliente = cliente;
        this.productos = productos;
    }
    
    
    
}
