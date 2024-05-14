package trabajo0;

class Nodo {

    private String tarea;
    private boolean completada;
    private Nodo siguiente;

    public Nodo(String tarea) {
        this.tarea = tarea;
        this.completada = false;
        this.siguiente = null;
    }

    public String getTarea() {
        return tarea;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void completarTarea() {
        completada = true;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}