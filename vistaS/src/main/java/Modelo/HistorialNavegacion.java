package Modelo;

import java.util.EmptyStackException;

public class HistorialNavegacion {

    private NodoPila auxiliar;
    private NodoPila sima;

    public HistorialNavegacion() {
        this.sima = null;
    }

    public void visitarPagina(String url) {
        NodoPila nuevoNodo = new NodoPila(url);
        nuevoNodo.setSiguiente(sima);
        sima = nuevoNodo;
    }

    public void retrocedr() {
        if (sima == null) {
            System.out.print("error");
        }
        NodoPila auxiliar = sima;
        sima = null;
        sima.siguiente = null;
        auxiliar.siguiente = null;
    }

    public void avanzar() {
        if (auxiliar == null) {
            System.out.print("error");
        }
        auxiliar = sima;
        sima.siguiente = null;
        auxiliar.siguiente = null;

    }

}
