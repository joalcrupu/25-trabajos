package controlador;

import modelo.Modelo;
import vista.Vista;

import java.util.List;
import java.util.Scanner;

public class Controlador {

    private Vista.VistaEstudiante vistaEstudiante;
    private Modelo modelo;

    public Controlador(Vista vista) {
        this.vistaEstudiante = vista.getVistaEstudiante();
        this.modelo = new Modelo();
    }

    public void agregarEstudianteAlInicio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el ID del estudiante: ");
        String id = scanner.nextLine();
        modelo.agregarAlInicio(nombre, id);
    }

    public void agregarEstudianteAlFinal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el ID del estudiante: ");
        String id = scanner.nextLine();
        modelo.agregarAlFinal(nombre, id);
    }

    public void modificarEstudiante() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del estudiante a modificar: ");
        String idModificar = scanner.nextLine();
        System.out.print("Ingrese el nuevo nombre del estudiante: ");
        String nuevoNombre = scanner.nextLine();
        modelo.modificarEstudiante(idModificar, nuevoNombre);
    }

    public void eliminarEstudianteAlFinal() {
        modelo.eliminarEstudiante(false);
    }

    public void eliminarEstudianteAlInicio() {
        modelo.eliminarEstudiante(true);
    }

    public void verListaEstudiantes() {
        List<Modelo.Estudiante> estudiantes = modelo.getListaEstudiantes();
        for (Modelo.Estudiante estudiante : estudiantes) {
            vistaEstudiante.printDetallesEstudiante(estudiante.getNombre(), estudiante.getId());
        }
    }
}
