package Modelo;

public class Modelo {

    public boolean verificarBalance(String expresion) {
        int contador = 0;
        char[] caracteres = expresion.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            if (c == '(') {
                contador++;
            } else if (c == ')') {
                contador--;
                if (contador < 0) {
                    return false;
                }
            }
        }

        return contador == 0;
    }
}
