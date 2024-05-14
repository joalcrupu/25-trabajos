package Vista;

import Controlador.Controlador;

public class vista {

    public void mostrarResultado(boolean balanceado) {
        if (balanceado) {
            System.out.println("Los paréntesis están correctamente balanceados.");
        } else {
            System.out.println("Los paréntesis no están correctamente balanceados.");
        }
    }
}
