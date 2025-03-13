
package com.ceba.gestion.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "lote_prod")
public class LoteDeProduccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lote")
    private Long idLoteProd;
    
    @Column(name = "fecha_lote_prod")
    private Date fechaLoteProd;

    public LoteDeProduccion() {
    }

    public LoteDeProduccion(Date fechaLoteProd) {
        this.fechaLoteProd = fechaLoteProd;
    }

    public LoteDeProduccion(Long idLoteProd, Date fechaLoteProd) {
        this.idLoteProd = idLoteProd;
        this.fechaLoteProd = fechaLoteProd;
    }

    public Long getIdLoteProd() {
        return idLoteProd;
    }

    public void setIdLoteProd(Long idLoteProd) {
        this.idLoteProd = idLoteProd;
    }

    public Date getFechaLoteProd() {
        return fechaLoteProd;
    }

    public void setFechaLoteProd(Date fechaLoteProd) {
        this.fechaLoteProd = fechaLoteProd;
    }
            
    
}
