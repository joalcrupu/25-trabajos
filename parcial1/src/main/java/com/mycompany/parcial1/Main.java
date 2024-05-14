package com.mycompany.parcial1;

import java.util.Scanner;
import vista.Vista;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del tren: ");
        String nombreTren = scanner.next();

        Vista miTren = new Vista(nombreTren);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar vagon");
            System.out.println("2. Quitar vagon");
            System.out.println("3. Mostrar tren");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de pasajeros: ");
                    int nuevosPasajeros = scanner.nextInt();
                    miTren.agregarVagon(nuevosPasajeros);
                    System.out.println("Se agregó un nuevo vagon al tren " + nombreTren + ".");
                    break;
                case 2:
                    System.out.print("Ingrese el número del vagon que desea quitar: ");
                    int numeroVagon = scanner.nextInt();
                    miTren.quitarVagon(numeroVagon);
                    break;
                case 3:
                    System.out.println("\nEstado actual del tren " + nombreTren + ":");
                    miTren.mostrarTren();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);
    }
}