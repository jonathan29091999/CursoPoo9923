package com.mx.curso.proyectoFinal.citasMedicas;

import java.util.Date;

public class Cita {
    private String ID;
    private Date FechaHora;
    private String EstadoCita; // Agendada / Cancelada / Completada

    private Paciente paciente;
    private Medico medico;

    public Cita(String ID, Date FechaHora, String EstadoCita, Paciente paciente, Medico medico) {
        this.ID = ID;
        this.FechaHora = FechaHora;
        this.EstadoCita = EstadoCita;
        this.paciente = paciente;
        this.medico = medico;
    }

    public String getID() {
        return ID;
    }
    public Date getFechaHora() {
        return FechaHora;
    }
    public String getEstadoCita() {
        return EstadoCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public Medico getMedico() {
        return medico;
    }

    public void setEstadoCita(String EstadoCita) {
        this.EstadoCita = EstadoCita;
    }
}

