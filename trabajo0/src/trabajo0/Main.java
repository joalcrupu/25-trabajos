package trabajo0;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ListaTareas listaTareas = new ListaTareas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1.Agregar tarea");
            System.out.println("2.Completar tarea");
            System.out.println("3.Listar tareas");
            System.out.println("4.Eliminar tarea");
            System.out.println("5.Contar tareas pendientes");
            System.out.println("6.Eliminar duplicados");
            System.out.println("7.Salir");
            System.out.print("Selecciona una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea a agregar: ");
                    String tareaAgregar = scanner.nextLine();
                    listaTareas.agregarTarea(tareaAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese la tarea a completar: ");
                    String tareaCompletar = scanner.nextLine();
                    listaTareas.completarTarea(tareaCompletar);
                    break;
                case 3:
                    listaTareas.listarTareas();
                    break;
                case 4:
                    System.out.print("Ingrese la tarea a eliminar: ");
                    String tareaEliminar = scanner.nextLine();
                    listaTareas.eliminarTarea(tareaEliminar);
                    break;
                case 5:
                    int tareasPendientes = listaTareas.contarTareasPendientes();
                    System.out.println("Tareas pendientes: " + tareasPendientes);
                    break;
                case 6:
                    listaTareas.eliminarDuplicados();
                    break;
                case 7:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}