package com.mx.curso.proyectoFinal.citasMedicas.modelo;

public class Especialidad {
    private String nombre;
    String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




    public void registraEspecialidad(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }




}
