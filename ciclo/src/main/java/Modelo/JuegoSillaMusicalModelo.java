package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JuegoSillaMusicalModelo {

    private List<String> jugadores;
    private List<Boolean> sillas;

    public JuegoSillaMusicalModelo() {
        jugadores = new ArrayList<>();
        sillas = new ArrayList<>();
    }

    public void iniciarJuego(List<String> nombresJugadores, int numSillas) {
        jugadores.addAll(nombresJugadores);
        for (int i = 0; i < numSillas; i++) {
            sillas.add(false); // False representa una silla vacía
        }
    }

    public void avanzarJuego() {
        Random random = new Random();
        int pasos = random.nextInt(sillas.size());
        for (int i = 0; i < pasos; i++) {
            sillas.add(sillas.remove(0)); // Mover la primera silla al final
        }
        // Eliminar al jugador que queda fuera de la silla
        int jugadorEliminado = 0;
        while (sillas.get(jugadorEliminado)) {
            jugadorEliminado++;
        }
        sillas.remove(jugadorEliminado);
        jugadores.remove(jugadorEliminado);
    }

    public boolean juegoTerminado() {
        return sillas.size() == 1;
    }

    public String obtenerGanador() {
        return jugadores.get(0);
    }

    public List<String> obtenerJugadores() {
        return jugadores;
    }

    public List<Boolean> obtenerSillas() {
        return sillas;
    }
}
