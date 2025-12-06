package com.mx.curso.proyectoFinal.citasMedicas.modelo;

public abstract class Persona {
    private String ID;
    private String Nombre;
    private String Contacto;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String contacto) {
        Contacto = contacto;
    }


}
