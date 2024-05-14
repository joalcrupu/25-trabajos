package modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

    private List<Estudiante> listaEstudiantes;

    public Modelo() {
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

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public static class Estudiante {

        private String nombre;
        private String id;

        public Estudiante(String nombre, String id) {
            this.nombre = nombre;
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
