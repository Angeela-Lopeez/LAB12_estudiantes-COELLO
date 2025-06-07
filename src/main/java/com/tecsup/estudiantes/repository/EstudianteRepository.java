package com.tecsup.estudiantes.repository;

import com.tecsup.estudiantes.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
