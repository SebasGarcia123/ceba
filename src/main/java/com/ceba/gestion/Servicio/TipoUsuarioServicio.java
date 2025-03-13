
package com.ceba.gestion.Servicio;

import com.ceba.gestion.Modelo.TipoUsuario;
import java.util.List;

public interface TipoUsuarioServicio {

    public List<TipoUsuario> listarLosTipoUsuario();

    public void guardarTipoUsuario(TipoUsuario tipoUsuario);

    public TipoUsuario obtenerTipoUsuarioPorIdTipoUsuario(Integer id);

    public void modificarTipoUsuario(TipoUsuario tipoUsuario);

    public void eliminarTipoUsuario(Integer id);
}
