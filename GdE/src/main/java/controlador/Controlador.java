package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Modelo;
import modelo.Modelo.Estudiante;
import vista.Vista;
import vista.Vista.VistaEstudiante;

public class Controlador {

    private VistaEstudiante vistaEstudiante;
    private Modelo modelo;
    private List<Estudiante> listaEstudiantes;

    public Controlador(Modelo modelo, Vista vista) {
        this.vistaEstudiante = vista.getVistaEstudiante();
        this.modelo = modelo;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre, String id) {
        Estudiante estudiante = new Estudiante(nombre, id);
        listaEstudiantes.add(estudiante);
    }

    public void modificarEstudiante(String id, String nuevoNombre) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getId().equals(id)) {
                estudiante.setNombre(nuevoNombre);
                break;
            }
        }
    }

    public void eliminarEstudiante(String id) {
        listaEstudiantes.removeIf(estudiante -> estudiante.getId().equals(id));
    }

    public void verListaEstudiantes() {
        for (Estudiante estudiante : listaEstudiantes) {
            vistaEstudiante.printDetallesEstudiante(estudiante.getNombre(), estudiante.getId());
        }
    }

}
