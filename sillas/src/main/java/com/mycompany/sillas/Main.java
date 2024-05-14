package com.mycompany.sillas;

import modelo.JuegoSillaMusicalModelo;
import vista.JuegoSillaMusicalVista;
import controlador.JuegoSillaMusicalControlador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de la silla musical!");

        System.out.print("Ingrese la cantidad de jugadores: ");
        int numJugadores = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] nombresJugadores = new String[numJugadores];
        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
            nombresJugadores[i] = scanner.nextLine();
        }

        scanner.close();

        JuegoSillaMusicalModelo modelo = new JuegoSillaMusicalModelo(nombresJugadores.length, nombresJugadores);
        JuegoSillaMusicalVista vista = new JuegoSillaMusicalVista();
        JuegoSillaMusicalControlador controlador = new JuegoSillaMusicalControlador(modelo, vista);
        controlador.iniciarJuego();
    }
}