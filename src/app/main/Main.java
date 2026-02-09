package app.main;

import app.main.model.Admin;
import app.main.util.Teclado;

public class Main {
    public static void main(String[] args) {

        Admin admin = new Admin("admin", "1234");

        System.out.print("Usuario: ");
        String user = Teclado.sc.nextLine();

        System.out.print("Contraseña: ");
        String pass = Teclado.sc.nextLine();

        if (admin.validar(user, pass)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
