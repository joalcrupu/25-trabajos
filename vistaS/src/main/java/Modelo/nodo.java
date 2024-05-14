package Modelo;

import java.lang.String;

public class nodo {

    private String dato;
    nodo siguiente;

    public nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;

    }

    public String setsiguiente(String dato) {
        return dato;
    }

    public String getsiguiente(String dato) {
        return dato;
    }

    public nodo setsiguiente(nodo siguiente) {
        return siguiente;
    }

    public nodo getsiguiente(nodo siguiente) {
        return siguiente;
    }

    public boolean vacia() {
        if (siguiente == null) {
            throw new RuntimeException("pila vacia");

        }
        return true;
    }
}
