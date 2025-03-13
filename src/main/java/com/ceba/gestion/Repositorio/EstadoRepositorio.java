
package com.ceba.gestion.Repositorio;

import com.ceba.gestion.Modelo.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepositorio extends JpaRepository<Estado,Long> {
    
}
