package app.main;

import pacientes.Paciente;
import doctores.Doctor;
import horarios.Horario;
import citas.Cita;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente("Juan Pérez", "8123456789");
        Doctor doctor = new Doctor("Dra. Ana López", "Medicina General");
        Horario horario = new Horario("Lunes", "10:00 AM");

        Cita cita = new Cita(paciente, doctor, horario);
        cita.mostrarCita();
    }
}
