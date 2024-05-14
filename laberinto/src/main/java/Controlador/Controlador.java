package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {

    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciarJuego() {
        int[] respuestas = new int[4];

        // Nivel 1
        vista.nivel1();
        respuestas[0] = vista.getUserInput();
        if (respuestas[0] == 3) {
            // Nivel 2
            vista.nivel2();
            respuestas[1] = vista.getUserInput();
            if (respuestas[1] == 2) {
                // Nivel 3
                vista.nivel3();
                respuestas[2] = vista.getUserInput();
                if (respuestas[2] == 2) {
                    // Nivel 4
                    vista.nivel4();
                    respuestas[3] = vista.getUserInput();
                } else {
                    vista.sifalla();
                    return; // Se sale del juego si la respuesta del nivel 3 no es 2
                }
            } else {
                vista.sifalla();
                return; // Se sale del juego si la respuesta del nivel 2 no es 2
            }
        } else {
            vista.sifalla();
            vista.nivel1();
            return; // Se sale del juego si la respuesta del nivel 1 no es 3
        }

        // Muestra el resultado final
        displayResult(respuestas);
    }

    private void displayResult(int[] respuestas) {
        int respuestasCorrectas = 0;

        // Suponiendo que las respuestas correctas son 3, 2, 2, 2 para los niveles respectivos
        for (int i = 0; i < respuestas.length; i++) {
            if (respuestas[i] == (i + 2)) {
                respuestasCorrectas++;
            }
        }

        modelo.setRespuestasCorrectas(respuestasCorrectas);

        if (respuestasCorrectas == respuestas.length) {
            vista.displayMessage("¡Felicidades! ¡Has ganado!");
        } else {
            vista.displayMessage("Lo siento, has perdido. ¡Mejor suerte la próxima vez!");
        }
    }
}
