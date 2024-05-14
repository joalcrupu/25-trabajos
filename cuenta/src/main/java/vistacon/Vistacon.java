package vistacon;

import java.util.Scanner;

public class Vistacon {

    private Scanner scanner;

    public Vistacon() {
        this.scanner = new Scanner(System.in);
    }

    public String obtenerTipoTransaccion() {
        System.out.println("Seleccione una opción:");
        System.out.println("Depositar");
        System.out.println("Retirar");
        System.out.println("salir");

        return scanner.nextLine();
    }

    public int obtenerCantidad() {
        System.out.print("Ingrese la cantidad de dinero: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
