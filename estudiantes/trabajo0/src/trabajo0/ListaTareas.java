package trabajo0;

public class ListaTareas {

    private Nodo inicio;

    public ListaTareas() {
        this.inicio = null;
    }

    public void agregarTarea(String tarea) {
        Nodo nuevoNodo = new Nodo(tarea);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
        System.out.println("Tarea agregada: " + tarea);
    }

    public void completarTarea(String tarea) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.getTarea().equals(tarea)) {
                temp.completarTarea();
                System.out.println("Tarea completada: " + tarea);
                return;
            }
            temp = temp.getSiguiente();
        }
        System.out.println("La tarea no existe en la lista.");
    }

    public void listarTareas() {
        System.out.println("Lista de tareas:");
        Nodo temp = inicio;
        while (temp != null) {
            String estado = temp.isCompletada() ? "Completada" : "Pendiente";
            System.out.println(temp.getTarea() + " - " + estado);
            temp = temp.getSiguiente();
        }
    }

    public void eliminarTarea(String tarea) {
        if (inicio == null) {
            System.out.println("La lista de tareas está vacía.");
            return;
        }

        if (inicio.getTarea().equals(tarea)) {
            inicio = inicio.getSiguiente();
            System.out.println("Tarea eliminada: " + tarea);
            return;
        }

        Nodo temp = inicio;
        while (temp.getSiguiente() != null && !temp.getSiguiente().getTarea().equals(tarea)) {
            temp = temp.getSiguiente();
        }

        if (temp.getSiguiente() != null) {
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            System.out.println("Tarea eliminada: " + tarea);
        } else {
            System.out.println("La tarea no existe en la lista.");
        }
    }

    public int contarTareasPendientes() {
        int contador = 0;
        Nodo temp = inicio;
        while (temp != null) {
            if (!temp.isCompletada()) {
                contador++;
            }
            temp = temp.getSiguiente();
        }
        return contador;
    }
}
