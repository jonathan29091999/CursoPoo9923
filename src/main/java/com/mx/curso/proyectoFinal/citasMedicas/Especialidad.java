package com.mx.curso.proyectoFinal.citasMedicas;
public class Especialidad {
    private String Nombre;
    private String Descripcion;

    public Especialidad(String Nombre, String Descripcion) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public String getNombre() {
        return Nombre;
    }
    public String getDescripcion() {
        return Descripcion;
    }
}
