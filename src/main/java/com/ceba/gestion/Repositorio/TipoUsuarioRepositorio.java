
package com.ceba.gestion.Repositorio;

import com.ceba.gestion.Modelo.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuarioRepositorio extends JpaRepository<TipoUsuario, Integer>{
    
}
