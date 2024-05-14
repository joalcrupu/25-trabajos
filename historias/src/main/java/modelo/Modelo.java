package modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

    private Nodo primerNodo;
    private Nodo ultimoNodo;

    public Modelo() {
        this.primerNodo = null;
        this.ultimoNodo = null;
    }

    public void agregarAlInicio(String nombre, String id) {
        Nodo nuevoNodo = new Nodo(nombre, id);

        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primerNodo;
            primerNodo.anterior = nuevoNodo;
            primerNodo = nuevoNodo;
        }
    }

    public void agregarAlFinal(String nombre, String id) {
        Nodo nuevoNodo = new Nodo(nombre, id);
        if (ultimoNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            nuevoNodo.anterior = ultimoNodo;
            ultimoNodo.siguiente = nuevoNodo;
            ultimoNodo = nuevoNodo;
        }
    }

    public void modificarEstudiante(String id, String nuevoNombre) {
        Nodo actual = primerNodo;
        while (actual != null) {
            if (actual.estudiante.getId().equals(id)) {
                actual.estudiante.setNombre(nuevoNombre);
                break;
            }
            actual = actual.siguiente;
        }
    }

    public void eliminarEstudiante(boolean eliminarAlInicio) {
        if (eliminarAlInicio) {
            if (primerNodo != null) {
                primerNodo = primerNodo.siguiente;
                if (primerNodo != null) {
                    primerNodo.anterior = null;
                } else {
                    ultimoNodo = null;
                }
            }
        } else {
            if (ultimoNodo != null) {
                ultimoNodo = ultimoNodo.anterior;
                if (ultimoNodo != null) {
                    ultimoNodo.siguiente = null;
                } else {
                    primerNodo = null;
                }
            }
        }
    }

    public List<Estudiante> getListaEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        Nodo actual = primerNodo;
        while (actual != null) {
            estudiantes.add(actual.estudiante);
            actual = actual.siguiente;
        }
        return estudiantes;
    }

    public static class Nodo {

        private Estudiante estudiante;
        private Nodo anterior;
        private Nodo siguiente;

        public Nodo(String nombre, String id) {
            this.estudiante = new Estudiante(nombre, id);
            this.anterior = null;
            this.siguiente = null;
        }
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

