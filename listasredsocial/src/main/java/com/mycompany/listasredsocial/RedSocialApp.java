package com.mycompany.listasredsocial;

import controlador.ControladorEventos;
import vista.Vista;

public class RedSocialApp {

    public static void main(String[] args) {
        ControladorEventos controlador = new ControladorEventos();
        Vista vista = new Vista(controlador);
        vista.mostrarMenu();
    }
}
