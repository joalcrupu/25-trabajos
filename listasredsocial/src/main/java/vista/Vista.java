package vista;

import controlador.ControladorEventos;

import java.util.Scanner;
import modelo.NodoEvento;

public class Vista {

    private final ControladorEventos controlador;

    public Vista(ControladorEventos controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("1. Agregar evento al principio");
            System.out.println("2. Agregar evento al final");
            System.out.println("3. Eliminar primer evento");
            System.out.println("4. Eliminar último evento");
            System.out.println("5. Modificar evento por ID");
            System.out.println("6. Ver lista de eventos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    agregarEventoAlPrincipio();
                    break;
                case 2:
                    agregarEventoAlFinal();
                    break;
                case 3:
                    eliminarPrimerEvento();
                    break;
                case 4:
                    eliminarUltimoEvento();
                    break;
                case 5:
                    modificarEventoPorId();
                    break;
                case 6:
                    verListaEventos();
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public void agregarEventoAlPrincipio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo del evento (publicación, comentario, reacción): ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese el ID del usuario: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Ingrese el año del evento: ");
        int año = scanner.nextInt();
        System.out.print("Ingrese el mes del evento: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el día del evento: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese la hora del evento: ");
        int hora = scanner.nextInt();
        System.out.print("Ingrese el minuto del evento: ");
        int minuto = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Ingrese el contenido del evento: ");
        String contenido = scanner.nextLine();
        controlador.agregarEventoPrimero(tipo, idUsuario, año, mes, dia, hora, minuto, contenido);
    }

    public void agregarEventoAlFinal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo del evento (publicación, comentario, reacción): ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese el ID del usuario: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Ingrese el año del evento: ");
        int año = scanner.nextInt();
        System.out.print("Ingrese el mes del evento: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el día del evento: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese la hora del evento: ");
        int hora = scanner.nextInt();
        System.out.print("Ingrese el minuto del evento: ");
        int minuto = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Ingrese el contenido del evento: ");
        String contenido = scanner.nextLine();
        controlador.agregarEventoUltimo(tipo, idUsuario, año, mes, dia, hora, minuto, contenido);
    }

    public void eliminarPrimerEvento() {
        controlador.eliminarPrimerEvento();
        System.out.println("Primer evento eliminado correctamente.");
    }

    public void eliminarUltimoEvento() {
        controlador.eliminarUltimoEvento();
        System.out.println("Último evento eliminado correctamente.");
    }

    public void modificarEventoPorId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del evento a modificar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el tipo del evento (publicación, comentario, reacción): ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese el ID del usuario: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Ingrese el año del evento: ");
        int año = scanner.nextInt();
        System.out.print("Ingrese el mes del evento: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el día del evento: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese la hora del evento: ");
        int hora = scanner.nextInt();
        System.out.print("Ingrese el minuto del evento: ");
        int minuto = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Ingrese el contenido del evento: ");
        String contenido = scanner.nextLine();
        controlador.modificarEventoPorId(id, tipo, idUsuario, año, mes, dia, hora, minuto, contenido);
        System.out.println("Evento modificado correctamente.");
    }

    public void verListaEventos() {
        NodoEvento temp = controlador.getInicio();
        if (temp == null) {
            System.out.println("No hay eventos en la lista.");
        } else {
            System.out.println("Lista de Eventos:");
            while (temp != null) {
                System.out.println("ID: " + temp.getEvento().getId());
                System.out.println("Tipo: " + temp.getEvento().getTipo());
                System.out.println("ID de Usuario: " + temp.getEvento().getIdUsuario());
                System.out.println("Fecha y Hora: " + temp.getEvento().getFechaHora());
                System.out.println("Contenido: " + temp.getEvento().getContenido());
                System.out.println("----------------------------------");
                temp = temp.getSiguiente();
            }
        }
    }
}
