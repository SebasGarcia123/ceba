
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.Usuario;
import java.util.List;


public interface UsuarioServicio {
    public List<Usuario> listarLosUsuarios();
    
    public void guardarUsuario(Usuario usuario);
    
    public Usuario obtenerUsuarioPorIdUsuario(Long id);
    
    public void modificarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Long id);
    
    public Usuario obtenerUsuarioPorNombreUsuario(String nombre);
}
