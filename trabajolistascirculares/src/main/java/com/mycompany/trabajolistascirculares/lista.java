package com.mycompany.trabajolistascirculares;

import javax.swing.JOptionPane;

public class lista {

    listasC ultimo;

    public lista() {
        ultimo = null;
    }

    // Método para saber si la lista está vacía
    public boolean estaVacia() {
        return ultimo == null;
    }

    // Método para insertar nodos en la lista circular
    public void insertar(int elemento) {
        listasC nuevo = new listasC(elemento);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
    }
    
    // Método para mostrar la lista circular
    public void mostrarLista() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "Lista vacía", "Lista Circular", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        listasC auxiliar = ultimo.siguiente;
        String cadena = "";
        do {
            cadena = cadena + "[" + auxiliar.dato + "]->";
            auxiliar = auxiliar.siguiente;
        } while (auxiliar != ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena, "Mostrando la Lista Circular", JOptionPane.INFORMATION_MESSAGE);
    }



}
