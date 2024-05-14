package nodo;

public class Nodo {
    public String tren;
    public int pasajeros;
    public Nodo siguiente;

    public Nodo(String tren, int pasajeros) {
        this.tren = tren;
        this.pasajeros = pasajeros;
        this.siguiente = null;
    }
}
