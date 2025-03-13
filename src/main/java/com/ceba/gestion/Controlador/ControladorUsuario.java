
package com.ceba.gestion.Controlador;

import com.ceba.gestion.Modelo.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("usuarioSesion")
public class ControladorUsuario {
    
    @GetMapping("/")
    public String mostrarLogin(Model modelo){
        Usuario usuario = new Usuario();
        modelo.addAttribute("usuario",usuario);
        return "/login";
    }

}
