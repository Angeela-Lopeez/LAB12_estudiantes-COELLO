package com.tecsup.estudiantes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre es obligatorio")
    private String nombre;

    @NotEmpty(message = "El apellido es obligatorio")
    private String apellido;

    @Email(message = "Debe ser un correo válido")
    @NotEmpty(message = "El correo es obligatorio")
    private String correo;

    @NotEmpty(message = "La carrera es obligatoria")
    private String carrera;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
}
