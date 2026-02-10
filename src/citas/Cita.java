package citas;

import pacientes.Paciente;
import doctores.Doctor;
import horarios.Horario;

public class Cita {
    private Paciente paciente;
    private Doctor doctor;
    private Horario horario;

    public Cita(Paciente paciente, Doctor doctor, Horario horario) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.horario = horario;
    }

    public void mostrarCita() {
        System.out.println("CITA MÉDICA");
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Doctor: " + doctor.getNombre() + " (" + doctor.getEspecialidad() + ")");
        System.out.println("Horario: " + horario.getHorarioCompleto());
    }
}