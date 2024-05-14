package nodo;

public class Nodo {

    public String salon;
    public int estudiantes;
    public Nodo siguiente;

    public Nodo(String salon, int estudiantes) {
        this.salon = salon;
        this.estudiantes = estudiantes;
        this.siguiente = null;
    }
}
