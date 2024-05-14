package com.mycompany.vistas;

import Modelo.Modelo;
import Controlador.Controlador;
import Vista.Vista;

public class main {

  public static void main(String[] args) {
    // Crear instancias de los componentes MVC
    Modelo modelo = new Modelo(); // Crear una instancia de Modelo
    Vista vista = new Vista();
    Controlador controlador = new Controlador(modelo, vista); // Pasar el modelo al constructor del controlador

    // Iniciar la aplicación desde el controlador
    controlador.iniciarVista();
}
}