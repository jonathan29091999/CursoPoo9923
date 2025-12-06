package com.mx.curso.proyectoFinal.citasMedicas;

public abstract class Persona {
    protected String ID;
    protected String Nombre;
    protected String Contacto;

    public Persona() {

    }

    public Persona(String ID, String Nombre, String Contacto) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Contacto = Contacto;
    }

    public String getID() {
        return ID;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getContacto() {
        return Contacto;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public abstract void mostrarInformacionDetallada();
}
