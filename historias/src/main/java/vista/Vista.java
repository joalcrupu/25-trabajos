
package vista;

public class Vista {

    public VistaEstudiante getVistaEstudiante() {
        return new VistaEstudiante();
    }

    public void mostrarMenuAdministrador() {
        System.out.println("=== Menú Principal ===");
        System.out.println("1. Agregar Estudiante al Inicio");
        System.out.println("2. Agregar Estudiante al Final");
        System.out.println("3. Modificar Estudiante");
        System.out.println("4. Eliminar Último Estudiante");
        System.out.println("5. Eliminar Primer Estudiante");
        System.out.println("6. Ver Lista de Estudiantes");
        System.out.println("0. Salir");
    }

    public class VistaEstudiante {

        public void printDetallesEstudiante(String nombreEstudiante, String idEstudiante) {
            System.out.println("Detalles del Estudiante:");
            System.out.println("Nombre: " + nombreEstudiante);
            System.out.println("ID: " + idEstudiante);
            System.out.println("---------------------------");
        }
    }
}
