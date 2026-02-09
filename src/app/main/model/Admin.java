package app.main.model;

public class Admin {
    private String usuario;
    private String contraseña;

    public Admin(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public boolean validar(String u, String c) {
        return usuario.equals(u) && contraseña.equals(c);
    }
}
