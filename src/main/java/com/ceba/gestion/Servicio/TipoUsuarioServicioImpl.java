
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.TipoUsuario;
import com.ceba.gestion.Repositorio.TipoUsuarioRepositorio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TipoUsuarioServicioImpl implements TipoUsuarioServicio{

    @Autowired
    private TipoUsuarioRepositorio repositorio;

    @Override
    public List<TipoUsuario> listarLosTipoUsuario() {
        return repositorio.findAll();
    }

    @Override
    public void guardarTipoUsuario(TipoUsuario tipoUsuario) {
        repositorio.save(tipoUsuario);
    }

    @Override
    public TipoUsuario obtenerTipoUsuarioPorIdTipoUsuario(Integer id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void modificarTipoUsuario(TipoUsuario tipoUsuario) {
        repositorio.save(tipoUsuario);
    }

    @Override
    public void eliminarTipoUsuario(Integer id) {
        repositorio.deleteById(id);
    }
}
