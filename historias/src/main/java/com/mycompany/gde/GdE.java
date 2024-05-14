// GdE.java
package com.mycompany.gde;

import controlador.Controlador;
import vista.Vista;

import java.util.Scanner;

public class GdE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);

        int opcion;

        do {
            vista.mostrarMenuAdministrador();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    controlador.agregarEstudianteAlInicio();
                    break;
                case 2:
                    controlador.agregarEstudianteAlFinal();
                    break;
                case 3:
                    controlador.modificarEstudiante();
                    break;
                case 4:
                    controlador.eliminarEstudianteAlFinal();
                    break;
                case 5:
                    controlador.eliminarEstudianteAlInicio();
                    break;
                case 6:
                    controlador.verListaEstudiantes();
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija nuevamente.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
