package javaapplication31;

import java.util.Scanner;

public class JavaApplication31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de columnas: ");
        int numColumnas = scanner.nextInt();

        int[][] matriz = new int[5][numColumnas];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los números para la fila " + (i + 1) + ":");
            for (int j = 0; j < numColumnas; j++) {
                System.out.print("Número para la columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("La matriz generada es:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
