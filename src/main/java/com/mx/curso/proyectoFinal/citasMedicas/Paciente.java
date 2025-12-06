package com.mx.curso.proyectoFinal.citasMedicas;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private List<Cita> historialCitas;

    public Paciente() {
        this.historialCitas = new ArrayList<>();
    }

    public Paciente(String ID, String Nombre, String Contacto) {
        super(ID, Nombre, Contacto);
        this.historialCitas = new ArrayList<>();
    }

    public List<Cita> getHistorialCitas() {
        return historialCitas;
    }

    @Override
    public void mostrarInformacionDetallada() {
        System.out.println("Paciente: " + Nombre + " | ID: " + ID);
        System.out.println("Contacto: " + Contacto);
        System.out.println("Historial de Citas: " + historialCitas.size());
    }
}
