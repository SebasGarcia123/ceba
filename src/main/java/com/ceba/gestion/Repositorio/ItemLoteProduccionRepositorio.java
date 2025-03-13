
package com.ceba.gestion.Repositorio;

import com.ceba.gestion.Modelo.ItemLoteProduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemLoteProduccionRepositorio extends JpaRepository<ItemLoteProduccion,Long>{
    
}
