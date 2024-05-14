package pila;

import nodo.Nodo;

public class Pila {
    public Nodo cabeza;

    public void push(char valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    public char pop() {
        if (cabeza == null) {
            throw new IllegalStateException("La pila está vacía");
        }
        char valor = cabeza.valor;
        cabeza = cabeza.siguiente;
        return valor;
    }

    public boolean isEmpty() {
        return cabeza == null;
    }
}
