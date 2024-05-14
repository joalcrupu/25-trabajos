package com.mycompany.jjs;

import Vista.vista;
import Modelo.Modelo;
import Controlador.Controlador;

public class Jjs {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        vista vista = new vista();
        Controlador controlador = new Controlador(modelo, vista);

        String expresion = "((a+b)*c)";
        controlador.verificarBalance(expresion);

        expresion = "(a+b))";
        controlador.verificarBalance(expresion);
    }
}
