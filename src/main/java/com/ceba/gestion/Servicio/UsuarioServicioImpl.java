
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.Usuario;
import com.ceba.gestion.Repositorio.UsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

    @Autowired
    UsuarioRepositorio repositorio;
    
    @Override
    public List<Usuario> listarLosUsuarios() {
        return repositorio.findAll();
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        repositorio.save(usuario);
    }

    @Override
    public Usuario obtenerUsuarioPorIdUsuario(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        repositorio.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        repositorio.deleteById(id);
    }

    @Override
    public Usuario obtenerUsuarioPorNombreUsuario(String nombre) {
        return repositorio.findByNombreUsuario(nombre);
    }
    
}
