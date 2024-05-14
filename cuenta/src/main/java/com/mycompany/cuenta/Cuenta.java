package com.mycompany.cuenta;

import controladorban.Controladorban;
import modeloban.Modelocon;
import vistacon.Vistacon;

public class Cuenta {

    public static void main(String[] args) {
        Vistacon vista = new Vistacon();
        Modelocon modelo = new Modelocon(8000); 
        Controladorban controlador = new Controladorban(modelo, vista);

        controlador.realizarTransaccion(); 

        vista.cerrarScanner(); 
    }
}
