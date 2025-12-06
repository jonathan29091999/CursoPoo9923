package com.mx.curso.proyectoFinal.citasMedicas.modelo;

import java.time.LocalDateTime;


public class Cita {
    private final LocalDateTime FechaHoraInicio;
    private String id;
    private EstadoCita estado;


    public Cita(LocalDateTime fechaHoraInicio, String id, EstadoCita estado) {
        this.FechaHoraInicio = fechaHoraInicio;
        this.id = id;
        this.estado = estado;

    }



    public void reservar(){
        this.estado = EstadoCita.AGENDADA;
    }

    public void liberar(){
        this.estado = EstadoCita.CANCELADA;
    }

    public LocalDateTime getFechaHoraInicio() {
        return FechaHoraInicio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }
}
