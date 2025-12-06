package com.mx.curso.proyectoFinal.citasMedicas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Time;

public class SistemaCitas {

    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Cita> citas;

    public SistemaCitas() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.citas = new ArrayList<>();
    }

    public void agregarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public void agregarMedico(Medico m) {
        medicos.add(m);
    }


    public Cita agendarCita(String idCita, Date fechaHora, Paciente paciente, Medico medico) {
        Cita cita = new Cita(idCita, fechaHora, "Agendada", paciente, medico);
        citas.add(cita);
        paciente.getHistorialCitas().add(cita);
        return cita;
    }


    public void modificarCita(Cita cita, Date nuevaFecha) {
        cita.setEstadoCita("Modificada");


    }


    public void cancelarCita(Cita cita) {
        cita.setEstadoCita("Cancelada");
    }

    public List<Medico> buscarMedicoPorEspecialidad(String especialidadBuscada) {
        List<Medico> resultado = new ArrayList<>();

        for (Medico m : medicos) {
            for (Especialidad e : m.getEspecialidades()) {
                if (e.getNombre().equalsIgnoreCase(especialidadBuscada)) {
                    resultado.add(m);
                }
            }
        }



        return resultado;
    }


    public static void main(String[] args) {

        SistemaCitas sistema = new SistemaCitas();

        // Crear Paciente
        Paciente p1 = new Paciente("P001", "Carlos López", "carlos@gmail.com");
        sistema.agregarPaciente(p1);

        // Crear Médico
        Medico m1 = new Medico("M001", "Dra. Ana Torres", "ana@clinica.com");

        // Agregar especialidad
        Especialidad esp = new Especialidad("Cardiología",
                "Especialista en corazón");
        m1.getEspecialidades().add(esp);

        Medico m2 = new Medico("M001", "Dr. Alan Perez", "alanPrez@clinica.com");

        Especialidad pediatria = new Especialidad("pediatria",
                "cuidado de salud en ninios");
        m1.getEspecialidades().add(pediatria);

        // Agregar horario disponible
        Date fecha = new Date(2025 - 1900, 0, 10); // 10 Enero 2025
        Time inicio = Time.valueOf("09:00:00");
        Time fin = Time.valueOf("10:00:00");

        Horario h1 = new Horario(fecha, inicio, fin, "Disponible");
        m1.getHorariosDisponibles().add(h1);

        sistema.agregarMedico(m1);

        // Buscar médico por especialidad
        System.out.println("Buscando médicos de Cardiología...");
        List<Medico> encontrados = sistema.buscarMedicoPorEspecialidad("Cardiología");
        for (Medico m : encontrados) {
            m.mostrarInformacionDetallada();
        }

        System.out.println("Buscando médicos de Pediatria...");
        List<Medico> pediatra = sistema.buscarMedicoPorEspecialidad("pediatria");

        for (Medico p:pediatra){
            p.mostrarInformacionDetallada();
        }



        // Agendar una cita con un medico
        System.out.println("\n Agendando cita...");
        Date fechaCita = new Date(2025 - 1900, 0, 10, 9, 0);
        Cita cita1 = sistema.agendarCita("C001", fechaCita, p1, m1);

        System.out.println(" ID Cita: " + cita1.getID());
        System.out.println("Estado: " + cita1.getEstadoCita());
        System.out.println("Paciente: " + cita1.getPaciente().getNombre());
        System.out.println("Médico: " + cita1.getMedico().getNombre());
    }
}

