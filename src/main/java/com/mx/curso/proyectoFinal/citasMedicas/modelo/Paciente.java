package com.mx.curso.proyectoFinal.citasMedicas.modelo;

import java.util.List;

public class Paciente extends Persona {
    List<Cita> HistorialCitas;

    public void mostrarInformacionDetallada(){

    }


    public Paciente(String nombre, String id, String contacto ,
                    Cita historialCitas) {
        this.setNombre(nombre);
        this.setID(id);
        this.setContacto(contacto);
        this.setHistorialCitas((List<Cita>) historialCitas);

    }


    public List<Cita> getHistorialCitas() {
        return HistorialCitas;
    }

    public void setHistorialCitas(List<Cita> historialCitas) {
        HistorialCitas = historialCitas;
    }



}
