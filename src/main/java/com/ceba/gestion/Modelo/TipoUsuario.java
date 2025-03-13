
package com.ceba.gestion.Modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nombre_tipo_usuario")
    private String nombreTipoUsuario;

    @OneToMany(mappedBy = "tipoUsuario")
    private List<Usuario> usuarios;

    public TipoUsuario() {
    }

    public TipoUsuario(String nombreTipoUsuario, List<Usuario> usuarios) {
        this.nombreTipoUsuario = nombreTipoUsuario;
        this.usuarios = usuarios;
    }

    public TipoUsuario(Integer id, String nombreTipoUsuario, List<Usuario> usuarios) {
        this.id = id;
        this.nombreTipoUsuario = nombreTipoUsuario;
        this.usuarios = usuarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreTipoUsuario() {
        return nombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
}