package Modelo;

public class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }
    public int suma() {
        int suma = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            suma += temp.getDato();
            temp = temp.getSiguiente(); 
        }
        return suma;
    }

    public int multiplicacion() {
        int multiplicacion = 1;
        Nodo temp = cabeza;
        while (temp != null) {
            multiplicacion *= temp.getDato();
            temp = temp.getSiguiente(); 
        }
        return multiplicacion;
    }

    public double division() {
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return 0;
        }
        double division = cabeza.getDato();
        Nodo temp = cabeza.getSiguiente();
        while (temp != null) {
            division /= temp.getDato();
            temp = temp.getSiguiente(); 
        }
        return division;
    }

    public int resta() {
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return 0;
        }
        int resta = cabeza.getDato();
        Nodo temp = cabeza.getSiguiente();
        while (temp != null) {
            resta -= temp.getDato();
            temp = temp.getSiguiente();
        }
        return resta;
    }

    public void cambiarPosicion(int pos1, int pos2) {
        if (pos1 == pos2 || cabeza == null || cabeza.getSiguiente() == null) {
            return;
        }
        Nodo nodoAnterior1 = null, nodo1 = cabeza;
        for (int i = 0; i < pos1 && nodo1 != null; i++) {
            nodoAnterior1 = nodo1;
            nodo1 = nodo1.getSiguiente();
        }
        Nodo nodoAnterior2 = null, nodo2 = cabeza;
        for (int i = 0; i < pos2 && nodo2 != null; i++) {
            nodoAnterior2 = nodo2;
            nodo2 = nodo2.getSiguiente();
        }
        if (nodo1 == null || nodo2 == null) {
            return;
        }
        if (nodoAnterior1 != null) {
            nodoAnterior1.setSiguiente(nodo2);
        } else {
            cabeza = nodo2;
        }
        if (nodoAnterior2 != null) {
            nodoAnterior2.setSiguiente(nodo1);
        } else {
            cabeza = nodo1;
        }

        Nodo temp = nodo1.getSiguiente();
        nodo1.setSiguiente(nodo2.getSiguiente());
        nodo2.setSiguiente(temp);
    }

    public void imprimirLista() {
        Nodo temp = cabeza;
        System.out.println("Lista:");
        while (temp != null) {
            System.out.print(temp.getDato() + " ");
            temp = temp.getSiguiente();
        }
        System.out.println();
    }
}
