
package com.ceba.gestion.Controlador;

import com.ceba.gestion.Modelo.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ControladorAdministrador {
    
    @GetMapping("/gestionAdministrador")
    public String mostrarPanelInicioAdministrador(@ModelAttribute("usuarioSesion") Usuario usuario, Model modelo) {
        modelo.addAttribute("administrador", usuario);
        return "Administrador/administrador";
    }
}
