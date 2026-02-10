package horarios;

public class Horario {
    private String dia;
    private String hora;

    public Horario(String dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public String getHorarioCompleto() {
        return dia + " a las " + hora;
    }
}