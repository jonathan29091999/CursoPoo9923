package com.mx.curso.proyectoFinal.citasMedicas.modelo;

import java.util.List;

public class Medico extends Persona{
    List<Especialidad> especialidad;

    List<Horario> horariosDisponibles;


    public Medico(List<Horario> horariosDisponibles, List<Especialidad> especialidad) {
        horariosDisponibles = horariosDisponibles;
        especialidad = especialidad;
    }

    public Medico() {

    }

    public Medico( String nombre, String id, List<Especialidad> especialidad) {
        this.setNombre(nombre);
        this.setID(id);
        this.setEspecialidad(especialidad);
    }

    public List<Especialidad> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(List<Especialidad> especialidad) {
        especialidad = especialidad;
    }

    public List<Horario> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void setHorariosDisponibles(List<Horario> horariosDisponibles) {
        horariosDisponibles = horariosDisponibles;
    }

    public void mostrarInformacionDetallada(){

   }

   public  void definirDisponibilidad(){

   }

   public void agregarMedicoEspecialidad(Especialidad e){
        especialidad.add(e);
   }


















}
