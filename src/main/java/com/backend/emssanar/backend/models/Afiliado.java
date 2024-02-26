package com.backend.emssanar.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Afiliado {
    //Identificador para la base H2
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    
    private String fechaNacimiento;
    private String direccion;
    private String telefono;
    private String genero;
    // Constructor sin argumentos necesario para JPA utilizar base de H2
    public Afiliado() {
    }

    // Constructor con todos los campos
    public Afiliado(String nombre, String  fechaNacimiento, String direccion, String telefono, String genero) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.genero = genero;
    }
    // Getters y Setters necerarios para inserrtar o visualizar datos

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String  getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String  fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
}

