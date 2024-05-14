package com.mycompany.ciclo;

public class MontañaRusa {
    private Nodo primerTren;
    private Nodo ultimoTren;
    private int cantidadTrenes;

    public MontañaRusa() {
        this.primerTren = null;
        this.ultimoTren = null;
        this.cantidadTrenes = 0;
    }

    public void agregarTren(String nombre) {
        Nodo nuevoTren = new Nodo(nombre);
        if (primerTren == null) {
            primerTren = nuevoTren;
            ultimoTren = nuevoTren;
            nuevoTren.siguiente = primerTren;
        } else {
            ultimoTren.siguiente = nuevoTren;
            nuevoTren.siguiente = primerTren;
            ultimoTren = nuevoTren;
        }
        cantidadTrenes++;
    }

    public void eliminarTren(int indice) {
        if (primerTren == null) {
            System.out.println("La lista de trenes está vacía.");
            return;
        }
        
        if (indice == 0) {
            primerTren = primerTren.siguiente;
            ultimoTren.siguiente = primerTren;
        } else {
            Nodo temp = primerTren;
            for (int i = 0; i < indice - 1; i++) {
                temp = temp.siguiente;
            }
            if (temp.siguiente == ultimoTren) {
                temp.siguiente = primerTren;
                ultimoTren = temp;
            } else {
                temp.siguiente = temp.siguiente.siguiente;
            }
        }
        cantidadTrenes--;
    }

    public String obtenerTrenActual() {
        if (primerTren == null) {
            return null;
        }
        return primerTren.nombre;
    }

    public void avanzarTren() {
        primerTren = primerTren.siguiente;
    }

    public int getCantidadTrenes() {
        return cantidadTrenes;
    }
}
