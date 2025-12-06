package com.mx.curso.proyectoFinal.citasMedicas.modelo;



import java.time.LocalDateTime;
import java.util.Date;

public class Horario {

    private final LocalDateTime FechaHoraInicio;
    private EstadoHorario estado;

    public Horario(LocalDateTime fechaHoraInicio, EstadoHorario estado) {
        FechaHoraInicio = fechaHoraInicio;
        this.estado = estado.DISPONIBLE;
    }

    public void reservar(){
        this.estado= EstadoHorario.RESERVADO;
    }

    public void liberar(){
        this.estado = EstadoHorario.DISPONIBLE;
    }



    public LocalDateTime getFechaHoraInicio() {
        return FechaHoraInicio;
    }

    public EstadoHorario getEstado() {
        return estado;
    }

    public void setEstado(EstadoHorario estado) {
        this.estado = estado;
    }






}
