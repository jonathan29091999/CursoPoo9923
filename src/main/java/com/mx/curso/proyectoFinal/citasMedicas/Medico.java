package com.mx.curso.proyectoFinal.citasMedicas;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Persona {
    private List<Especialidad> especialidades;
    private List<Horario> horariosDisponibles;

    public Medico(String ID, String Nombre, String Contacto) {
        super(ID, Nombre, Contacto);
        this.especialidades = new ArrayList<>();
        this.horariosDisponibles = new ArrayList<>();
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public List<Horario> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    @Override
    public void mostrarInformacionDetallada() {
        System.out.println("Médico: " + Nombre + " | ID: " + ID);
        System.out.println("Contacto: " + Contacto);
        System.out.println("Especialidades:");
        for (Especialidad e : especialidades) {
            System.out.println("- " + e.getNombre());
        }
    }

    public void definirDisponibilidad(Horario h) {
        horariosDisponibles.add(h);
    }
}
