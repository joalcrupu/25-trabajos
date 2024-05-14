package herencia;

import java.util.ArrayList;

public class ListaTareas {

    private ArrayList<String> tareas;
    private ArrayList<Boolean> completadas;

    public ListaTareas() {
        tareas = new ArrayList<>();
        completadas = new ArrayList<>();
    }

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        completadas.add(false);
        System.out.println("Tarea agregada: " + tarea);
    }

    public void completarTarea(String tarea) {
        int indice = tareas.indexOf(tarea);
        if (indice != -1) {
            completadas.set(indice, true);
            System.out.println("Tarea completada: " + tarea);
        } else {
            System.out.println("La tarea no existe en la lista.");
        }
    }

    public void listarTareas() {
        System.out.println("Lista de tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            String estado = completadas.get(i) ? "Completada" : "Pendiente";
            System.out.println((i + 1) + ". " + tareas.get(i) + " - " + estado);
        }
    }

    public void eliminarTarea(String tarea) {
        int indice = tareas.indexOf(tarea);
        if (indice != -1) {
            tareas.remove(indice);
            completadas.remove(indice);
            System.out.println("Tarea eliminada: " + tarea);
        } else {
            System.out.println("La tarea no existe en la lista.");
        }
    }

    public int contarTareasPendientes() {
        int contador = 0;
        for (boolean completada : completadas) {
            if (!completada) {
                contador++;
            }
        }
        return contador;
    }
}
