
package com.ceba.gestion.Controlador;

import com.ceba.gestion.Modelo.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("usuarioSesion")
public class ControladorAdministrador {
    
    @GetMapping("/gestionAdministrador")
    public String mostrarPanelInicioAdministrador(@ModelAttribute("usuarioSesion") Usuario usuario, Model modelo) {
        modelo.addAttribute("administrador", usuario);
        return "Administrador/administrador";
    }
}
