
package com.ceba.gestion.Controlador;

import com.ceba.gestion.Modelo.Usuario;
import com.ceba.gestion.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("usuarioSesion")
public class ControladorUsuario {
    
    @Autowired
    private UsuarioServicio servicio;
    
    @GetMapping("/")
    public String mostrarLogin(Model modelo, @ModelAttribute("mensaje") String mensaje){
        Usuario usuario = new Usuario();
        modelo.addAttribute("user",usuario);
        modelo.addAttribute("mensaje", mensaje);
        return "/login";
    }
    
    @PostMapping("/login")
    public String validarUsuario(@ModelAttribute("user") Usuario usuario, Model modelo, RedirectAttributes redirectAttributes){
        Usuario usuarioBD = new Usuario();
        usuarioBD = servicio.obtenerUsuarioPorNombreUsuario(usuario.getNombreUsuario());
        //System.out.println(usuarioBD.toString());
        if (usuarioBD != null && usuarioBD.getPass().equals(usuario.getPass())) {
            if(usuarioBD.getTipoUsuario().getId() == 1){
                redirectAttributes.addFlashAttribute("usuarioSesion", usuarioBD);
                return "redirect:/gestionAdministrador";
            }
            if (usuarioBD.getTipoUsuario().getId() == 2) {
                redirectAttributes.addFlashAttribute("usuarioSesion", usuarioBD);
                return "redirect:/gestionProduccion";
            }
            if (usuarioBD.getTipoUsuario().getId() == 3) {
                redirectAttributes.addFlashAttribute("usuarioSesion", usuarioBD);
                return "redirect:/gestionLogistica";
            }
            if (usuarioBD.getTipoUsuario().getId() == 4) {
                redirectAttributes.addFlashAttribute("usuarioSesion", usuarioBD);
                return "redirect:/gestionVentas";
            }
        }
            redirectAttributes.addFlashAttribute("mensaje", "Usuario o contraseña incorrectos");
            return "redirect:/";    
    }
    
    @GetMapping("/gestionAdministrador")
    public String mostrarPanelInicioAdministrador(@ModelAttribute("usuarioSesion") Usuario usuario, Model modelo) {
        modelo.addAttribute("administrador", usuario);
        return "Administrador/administrador";
    }
    

}
