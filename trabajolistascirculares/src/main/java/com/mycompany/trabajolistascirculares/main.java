package com.mycompany.trabajolistascirculares;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        lista listaCircular = new lista();
        
        boolean continuar = true;
        while (continuar) {
            String opcion = JOptionPane.showInputDialog(
                "Seleccione una opción:\n" +
                "1. Agregar Numero\n" +
                "2. Mostrar lista\n" +
                "3. Salir"
            );
            
            switch (opcion) {
                case "1":
                    String entrada = JOptionPane.showInputDialog("Ingrese un número:");
                    try {
                        int numero = Integer.parseInt(entrada);
                        listaCircular.insertar(numero);
                        JOptionPane.showMessageDialog(null, "Elemento agregado correctamente.");
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                    
                case "2":
                    listaCircular.mostrarLista();
                    break;
                    
                case "3":
                    continuar = false;
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una opción válida.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "¡Hasta luego!");
    }
}
