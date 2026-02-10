package pacientes;

public class Paciente {
    private String nombre;
    private String telefono;

    public Paciente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
