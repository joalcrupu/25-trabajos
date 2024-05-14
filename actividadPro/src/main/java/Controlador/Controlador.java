// Controlador/Controlador.java
package Controlador;

import Modelo.ListaEnlazada;
import Vista.Vista;
import java.util.Scanner;

public class Controlador {
    private ListaEnlazada lista;
    private Vista vista;
    private Scanner scanner;

    public Controlador() {
        lista = new ListaEnlazada();
        vista = new Vista();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    int numero = scanner.nextInt();
                    lista.agregar(numero);
                    break;
                case 2:
                    int suma = lista.suma();
                    vista.mostrarResultado("la suma", suma);
                    break;
                case 3:
                    int producto = lista.multiplicacion();
                    vista.mostrarResultado("el producto", producto);
                    break;
                case 4:
                    int resta = lista.resta();
                    vista.mostrarResultado("la resta", resta);
                    break;
                case 5:
                    double division = lista.division();
                    vista.mostrarResultado("la división", (int) division);
                    break;
                case 6:
                    System.out.print("Ingrese la posición del primer número: ");
                    int pos1 = scanner.nextInt();
                    System.out.print("Ingrese la posición del segundo número: ");
                    int pos2 = scanner.nextInt();
                    lista.cambiarPosicion(pos1, pos2);
                    break;
                case 7:
                    lista.imprimirLista();
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}
