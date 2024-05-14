package vista;

import nodo.Nodo;

public class Vista {

    private Nodo cabeza;
    private String nombreTren;
    private int contadorVagones;

    public Vista(String nombreTren) {
        this.nombreTren = nombreTren;
        this.cabeza = null;
        this.contadorVagones = 0;
    }

    public void agregarVagon(int pasajeros) {
        contadorVagones++;
        Nodo nuevoVagon = new Nodo(nombreTren + " - Vagon " + contadorVagones, pasajeros);
        if (cabeza == null) {
            cabeza = nuevoVagon;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoVagon;
        }
    }

    public void quitarVagon(int vagonNumero) {
        if (cabeza != null) {
            if (vagonNumero == 1) {
                cabeza = cabeza.siguiente;
                System.out.println("Se quitó el primer vagon del tren " + nombreTren + ".");
                contadorVagones--;
            } else if (vagonNumero > 1 && vagonNumero <= contadorVagones) {
                Nodo anterior = cabeza;
                Nodo actual = cabeza.siguiente;
                int contador = 2;

                while (contador < vagonNumero) {
                    anterior = actual;
                    actual = actual.siguiente;
                    contador++;
                }

                anterior.siguiente = actual.siguiente;
                System.out.println("Se quitó el vagon " + vagonNumero + " del tren " + nombreTren + ".");
                contadorVagones--;
            } else {
                System.out.println("Número de vagon no válido. No se pudo quitar ningún vagon.");
            }
        } else {
            System.out.println("El tren " + nombreTren + " ya está vacío.");
        }
    }

    public void mostrarTren() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("Tren: " + actual.tren + ", Pasajeros: " + actual.pasajeros);
            actual = actual.siguiente;
        }
    }
}
