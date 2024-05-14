package com.mycompany.gde;

import controlador.Controlador;
import java.util.Scanner;
import modelo.Modelo;
import vista.Vista;

public class GdE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        int opcion;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Modificar Estudiante");
            System.out.println("3. Eliminar Estudiante");
            System.out.println("4. Ver Lista de Estudiantes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("=== Agregar Estudiante ===");
                    System.out.print("Ingrese el nombre del estudiante: ");
                    scanner.nextLine(); 
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el ID del estudiante: ");
                    String id = scanner.nextLine();
                    controlador.agregarEstudiante(nombre, id);
                    break;
                case 2:
                    System.out.println("=== Modificar Estudiante ===");
                    System.out.print("Ingrese el ID del estudiante a modificar: ");
                    scanner.nextLine(); 
                    String idModificar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre del estudiante: ");
                    String nuevoNombre = scanner.nextLine();
                    controlador.modificarEstudiante(idModificar, nuevoNombre);
                    break;
                case 3:
                    System.out.println("=== Eliminar Estudiante ===");
                    System.out.print("Ingrese el ID del estudiante a eliminar: ");
                    scanner.nextLine(); 
                    String idEliminar = scanner.nextLine();
                    controlador.eliminarEstudiante(idEliminar);
                    break;
                case 4:
                    System.out.println("=== Lista de Estudiantes ===");
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
