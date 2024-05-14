package com.mycompany.ciclo;

import java.util.Scanner;

public class MontañaRusaController {
    private MontañaRusa montañaRusa;

    public MontañaRusaController(MontañaRusa montañaRusa) {
        this.montañaRusa = montañaRusa;
    }

    public void simularMontañaRusa() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("¡Prepárate para la montaña rusa!");

        while (continuar) {
            String tren = montañaRusa.obtenerTrenActual();

            System.out.println("===== Tren =====");
            System.out.println("Nombre: " + tren);
            System.out.println("================");

            System.out.println("Presione 'a' para avanzar al siguiente tren, 's' para salir,");
            System.out.println("'e' para eliminar un tren, 'n' para agregar un nuevo tren.");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("s")) {
                continuar = false;
            } else if (input.equalsIgnoreCase("a")) {
                montañaRusa.avanzarTren();
            } else if (input.equalsIgnoreCase("e")) {
                System.out.println("Ingrese el índice del tren que desea eliminar:");
                int indiceEliminar = Integer.parseInt(scanner.nextLine());
                montañaRusa.eliminarTren(indiceEliminar);
            } else if (input.equalsIgnoreCase("n")) {
                System.out.println("Ingrese el nombre del tren: ");
                String nombre = scanner.nextLine();
                montañaRusa.agregarTren(nombre);
            } else {
                System.out.println("Entrada no válida. Inténtelo de nuevo.");
            }
        }

        System.out.println("¡Esperamos que hayas disfrutado de la montaña rusa!");
    }
}
