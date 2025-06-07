package com.tecsup.estudiantes.service;

import com.tecsup.estudiantes.model.Estudiante;
import java.util.List;

public interface EstudianteService {
    List<Estudiante> listar();
    Estudiante buscar(Long id);
    void guardar(Estudiante estudiante);
    void eliminar(Long id);
}