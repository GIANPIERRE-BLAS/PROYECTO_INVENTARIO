package com.security.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.crud.proveedor.servicio.IProveedorServicio;

@Controller
public class RegistroControlador {

    @Autowired
    private IProveedorServicio servicio;

    @GetMapping("/index")
    public String index() {
        return "index"; // Redirige al index
    }

    @GetMapping("/login")
    public String iniciarSesion() {
        return "login"; // Luego redirige al login
    }

    @GetMapping("/bienvenida")
    public String bienvenida() {
        return "bienvenida"; // Redirige a la página de bienvenida después del login
    }

    @GetMapping("/proveedores")
    public String verProveedores(Model modelo) {
        modelo.addAttribute("proveedores", servicio.listarProveedores());
        return "proveedores"; // Y finalmente muestra la vista de proveedores
    }
}
