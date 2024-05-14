package com.mycompany.mavenproject1;

import controlador.Controlador;
import modelo.GestorDeMemoria;
import vista.Vista;

public class Main {

    public static void main(String[] args) {
 
        GestorDeMemoria modelo = new GestorDeMemoria();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

       
        controlador.inicio();
    }
}
