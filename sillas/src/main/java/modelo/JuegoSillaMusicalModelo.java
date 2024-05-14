package modelo;

import java.util.Random;

public class JuegoSillaMusicalModelo {
    private ListaCircular sillas;
    private String[] nombresJugadores;
    private int indiceJugadorActual;

    public JuegoSillaMusicalModelo(int numSillas, String[] nombresJugadores) {
        if (numSillas <= 0 || nombresJugadores == null || nombresJugadores.length == 0) {
            throw new IllegalArgumentException("El número de sillas y la lista de nombres de jugadores no pueden ser nulos o vacíos.");
        }
        if (numSillas < nombresJugadores.length) {
            throw new IllegalArgumentException("El número de sillas no puede ser menor que el número de jugadores.");
        }

        this.nombresJugadores = nombresJugadores;
        this.sillas = new ListaCircular(numSillas, nombresJugadores);
        this.indiceJugadorActual = 0;
    }

    public boolean juegoTerminado() {
        return sillas.size() == 1;
    }

    public int obtenerNumeroSillasRestantes() {
        return sillas.size();
    }

    public String[] obtenerNombresJugadores() {
        return nombresJugadores;
    }

    public void siguienteMovimiento() {
        Random random = new Random();
        int pasos = random.nextInt(sillas.size());
        sillas.move(pasos);
        sillas.removeCurrent();
        indiceJugadorActual = (indiceJugadorActual + pasos) % nombresJugadores.length;
    }

    public String obtenerJugadorEliminado() {
        return nombresJugadores[indiceJugadorActual];
    }

    public String obtenerGanador() {
        return sillas.getCurrentPlayer();
    }
}
