package vista;

import java.util.List;

public class JuegoSillaMusicalVista {
    public void mostrarMensajeBienvenida() {
        System.out.println("¡Bienvenido al juego de la silla musical!");
    }

    public void mostrarEstadoJuego(int sillasRestantes, String[] nombresJugadores) {
        System.out.println("Número de sillas restantes: " + sillasRestantes);
        System.out.println("Jugadores:");
        for (String jugador : nombresJugadores) {
            System.out.print(jugador + " ");
        }
        System.out.println();
    }

    public void mostrarJugadorEliminado(String jugador) {
        System.out.println("Jugador eliminado: " + jugador);
    }

    public void mostrarMensajeGanador(String ganador) {
        System.out.println("¡El ganador es " + ganador + "!");
    }
}
