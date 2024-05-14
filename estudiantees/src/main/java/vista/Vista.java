package vista;

public class Vista {

    public VistaEstudiante getVistaEstudiante() {
        return new VistaEstudiante();
    }

    public class VistaEstudiante {

        public void mostrarMenuAdministrador() {
            System.out.println("===  Información ===");
            System.out.println("1. Agregar estudiante al principio de la lista");
                System.out.println("2. Agregar estudiante al final de la lista");
            System.out.println("2. Modificar estudiante");
            System.out.println("3. Eliminar al ultimo estudiante de la lista");
            System.out.println("4. Ver lista de estudiantes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
        }

        public void printDetallesEstudiante(String nombreEstudiante, String idEstudiante) {
            System.out.println("Detalles del Estudiante:");
            System.out.println("Nombre: " + nombreEstudiante);
            System.out.println("ID: " + idEstudiante);
            System.out.println("---------------------------");
        }
    }
}


