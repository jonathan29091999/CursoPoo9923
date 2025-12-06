package com.mx.curso.proyectoFinal.citasMedicas;
import java.sql.Time;
import java.util.Date;

public class Horario {
    private Date Fecha;
    private Time HoraInicio;
    private Time HoraFin;
    private String Estado; // Disponible / Reservado

    public Horario(Date Fecha, Time HoraInicio, Time HoraFin, String Estado) {
        this.Fecha = Fecha;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
        this.Estado = Estado;
    }

    public Date getFecha() {
        return Fecha;
    }
    public Time getHoraInicio() { return HoraInicio;
    }
    public Time getHoraFin() {
        return HoraFin;
    }
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
