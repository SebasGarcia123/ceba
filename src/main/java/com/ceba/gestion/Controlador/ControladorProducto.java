
package com.ceba.gestion.Controlador;

import com.ceba.gestion.Modelo.Producto;
import com.ceba.gestion.Modelo.Usuario;
import com.ceba.gestion.Servicio.ProductoServicio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@SessionAttributes("usuarioSesion")
public class ControladorProducto {

    @Autowired
    private ProductoServicio servicio;

    @GetMapping("/listarABM_producto")
    public String listarLosProductos(@ModelAttribute("usuarioSesion") Usuario usuario, Model modelo) {
        modelo.addAttribute("productos", servicio.listarLosProductos());
        return "Administrador/ABM/Producto/ABM_producto";
    }

    @GetMapping("/nuevoProducto")
    public String nuevoProductoFormulario(@ModelAttribute("usuarioSesion") Usuario usuario, Model modelo, @ModelAttribute("mensaje") String mensaje) {
        Producto producto = new Producto();
        modelo.addAttribute("producto", producto);
        return "Administrador/ABM/Producto/nuevo_producto";
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(@ModelAttribute("producto") Producto producto, RedirectAttributes redirectAttributes) {
        List<Producto> productos = servicio.listarLosProductos();
        for (Producto p : productos) {
            if (p.getDescripcion().equalsIgnoreCase(producto.getDescripcion())) {
                redirectAttributes.addFlashAttribute("mensaje", "El producto que ingresaste ya existe");
                return "redirect:/nuevoProducto";
            }
        }
        servicio.guardarProducto(producto);
        return "redirect:/listarABM_producto";
    }

    @GetMapping("/formularioProducto/{id}")
    public String modificarProductoFormulario(@ModelAttribute("usuarioSesion") Usuario usuario, @PathVariable Long id, Model modelo, @ModelAttribute("mensaje") String mensaje) {
        Producto producto = servicio.obtenerProductoPorIdProducto(id);
        String descripcionAnterior = producto.getDescripcion();
        modelo.addAttribute("producto", producto);
        modelo.addAttribute("descripcionAnterior", descripcionAnterior);
        return "Administrador/ABM/Producto/modificar_producto";
    }

    @PostMapping("/actualizarProducto/{id}")
    public String actualizarProducto(@PathVariable Long id, @ModelAttribute("producto") Producto producto, RedirectAttributes redirectAttributes) {
        Producto productoModificado = servicio.obtenerProductoPorIdProducto(id);
        List<Producto> productos = servicio.listarLosProductos();
        for (Producto p : productos) {
            if (p.getDescripcion().equalsIgnoreCase(producto.getDescripcion())) {
                redirectAttributes.addFlashAttribute("mensaje", "El estado que ingresaste ya existe");
                return "redirect:/formularioProducto/" + id;
            }
        }
        productoModificado.setDescripcion(producto.getDescripcion());
        servicio.modificarProducto(productoModificado);
        return "redirect:/listarABM_producto";
    }

    @GetMapping("/eliminarProducto/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        servicio.eliminarProducto(id);
        return "redirect:/listarABM_producto";
    }
}
