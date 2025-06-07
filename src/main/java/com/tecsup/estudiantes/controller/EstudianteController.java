package com.tecsup.estudiantes.controller;

import com.tecsup.estudiantes.model.Estudiante;
import com.tecsup.estudiantes.service.EstudianteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService servicio;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("lista", servicio.listar());
        return "listar";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid @ModelAttribute Estudiante estudiante, BindingResult result) {
        if (result.hasErrors()) return "formulario";
        servicio.guardar(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("estudiante", servicio.buscar(id));
        return "formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
        return "redirect:/estudiantes";
    }
}