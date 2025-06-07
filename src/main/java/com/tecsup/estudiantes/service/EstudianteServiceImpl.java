package com.tecsup.estudiantes.service;

import com.tecsup.estudiantes.model.Estudiante;
import com.tecsup.estudiantes.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository repositorio;

    @Override
    public List<Estudiante> listar() {
        return repositorio.findAll();
    }

    @Override
    public Estudiante buscar(Long id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public void guardar(Estudiante estudiante) {
        repositorio.save(estudiante);
    }

    @Override
    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}