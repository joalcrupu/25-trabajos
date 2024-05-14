package Controlador;

import Modelo.Modelo;
import Vista.vista;
import Vista.vista;

public class Controlador {

    private Modelo modelo;
    private vista vista;

    public Controlador(Modelo modelo, vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void verificarBalance(String expresion) {
        boolean balanceado = modelo.verificarBalance(expresion);
        vista.mostrarResultado(balanceado);
    }
}
