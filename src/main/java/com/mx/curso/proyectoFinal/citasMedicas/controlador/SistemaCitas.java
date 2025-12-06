package com.mx.curso.proyectoFinal.citasMedicas.controlador;

import com.mx.curso.proyectoFinal.citasMedicas.modelo.*;

import java.time.LocalDateTime;
import java.util.List;

public class SistemaCitas {
   static List<Paciente> pacientes;
    static List<Medico> medicos;
    static List<Cita> citas;

    public  void agendarCita(){

        //registro de pacientes

        pacientes.add(new Paciente("dalia", "003", "contacto",
                citas.add(new Cita(LocalDateTime.now(), "002", EstadoCita.AGENDADA)));



    }

    public void modificarCita(){

    }

    public void cancelarCita(){


    }

    public void buscarMedicoPorEspecialidad(){

    }



    public static void main(String[] args) {

        //registro de medicos y especialidades
        Especialidad cardiologia = new Especialidad();
        cardiologia.registraEspecialidad("cardiologia", "problemas del corazon");

        Especialidad pediatria = new Especialidad();
        pediatria.registraEspecialidad("pediatria ", "cuidado en niños");

        Especialidad traumatologo = new Especialidad();
        traumatologo.registraEspecialidad("traumatologia", "trata de lesiones musculares");


        medicos.add(new Medico("Dr Juan Perez", "001", (List<Especialidad>) cardiologia),
                new Horario(LocalDateTime.now(), EstadoHorario.DISPONIBLE);
        medicos.add(new Medico("Dra Ana Lopez","002", (List<Especialidad>) pediatria),
                new Horario(LocalDateTime.now(), EstadoHorario.RESERVADO);
        medicos.add(new Medico("Dra Ana Lopez","002", (List<Especialidad>) traumatologo),
                new Horario(LocalDateTime.now(), EstadoHorario.RESERVADO);







    }





}
