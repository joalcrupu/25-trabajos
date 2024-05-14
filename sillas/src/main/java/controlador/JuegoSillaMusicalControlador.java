package controlador;


import modelo.JuegoSillaMusicalModelo;
import vista.JuegoSillaMusicalVista;
import java.util.Scanner;

public class JuegoSillaMusicalControlador {
    private JuegoSillaMusicalModelo modelo;
    private JuegoSillaMusicalVista vista;

    public JuegoSillaMusicalControlador(JuegoSillaMusicalModelo modelo, JuegoSillaMusicalVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarJuego() {
        vista.mostrarMensajeBienvenida();

        while (!modelo.juegoTerminado()) {
            int sillasRestantes = modelo.obtenerNumeroSillasRestantes();
            vista.mostrarEstadoJuego(sillasRestantes, modelo.obtenerNombresJugadores());

            modelo.siguienteMovimiento();

            String jugadorEliminado = modelo.obtenerJugadorEliminado();
            if (jugadorEliminado != null) {
                vista.mostrarJugadorEliminado(jugadorEliminado);
            }
        }

        String ganador = modelo.obtenerGanador();
        vista.mostrarMensajeGanador(ganador);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de jugadores: ");
        int numJugadores = scanner.nextInt();

        String[] nombresJugadores = new String[numJugadores];
        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
            nombresJugadores[i] = scanner.next();
        }

        System.out.print("Ingrese la cantidad de sillas: ");
        int numSillas = scanner.nextInt();

        scanner.close();

        JuegoSillaMusicalModelo modelo = new JuegoSillaMusicalModelo(numSillas, nombresJugadores);
        JuegoSillaMusicalVista vista = new JuegoSillaMusicalVista();
        JuegoSillaMusicalControlador controlador = new JuegoSillaMusicalControlador(modelo, vista);

        controlador.iniciarJuego();
    }
}
