package Modelo;

import java.util.EmptyStackException;
import java.util.Stack;

public class Modelo {

    private Stack<String> historialAtras;
    private Stack<String> historialAdelante;
    private String paginaActual;
private NodoPila sima;

    public Modelo() {
        historialAtras = new Stack<>();
        historialAdelante = new Stack<>();
        paginaActual = "";
    }
 public boolean vacia() {
        if (sima == null) {
            throw new RuntimeException("pila vacia");

        }
        return true;
    }
    public void visitarPagina(String nuevaURL) {
        if (vacia()==true) {
            historialAtras.push(paginaActual);
        }
        historialAdelante.clear();
        paginaActual = nuevaURL;
    }

    public void retroceder() {
        if (!historialAtras.isEmpty()) {
            historialAdelante.push(paginaActual);
            paginaActual = historialAtras.pop();
        } else {
            System.out.println("No hay páginas para retroceder.");
        }
    }

    public void avanzar() {
        if (!historialAdelante.isEmpty()) {
            historialAtras.push(paginaActual);
            paginaActual = historialAdelante.pop();
        } else {
            System.out.println("No hay páginas para avanzar.");
        }

        throw new EmptyStackException();
    }

    public String getPaginaActual() {
        return paginaActual;
    }

    public boolean puedeRetroceder() {
        return !historialAtras.isEmpty();
    }

    public boolean puedeAvanzar() {
        return !historialAdelante.isEmpty();
    }
   

}
