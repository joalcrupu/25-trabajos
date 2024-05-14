package com.mycompany.laberinto;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Laberinto{

    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, modelo);

        controlador.iniciarJuego();
    }
}
