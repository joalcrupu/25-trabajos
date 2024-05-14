package controlador;

import modelo.GestorDeMemoria;
import vista.Vista;

public class Controlador {
    private GestorDeMemoria modelo;
    private Vista vista;

    public Controlador(GestorDeMemoria modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    
    }
  

    public void procesarExpresion() {
    
        String expresion = vista.solicitarExpresion();
        
        try {

            double resultado = modelo.evaluarExpresion(expresion);
            
        
            vista.mostrarResultado(resultado);
        } catch (Exception e) {
         
            vista.mostrarError(e.getMessage());
        }
    }

    public void procesarExpresiones() {
        String expresiones = vista.solicitarExpresiones();
        String[] expresionesArray = expresiones.split("\\s+"); 

        for (String expresion : expresionesArray) {
            try {
                double resultado = modelo.evaluarExpresion(expresion);
                vista.mostrarResultado(resultado);
            } catch (Exception e) {
                vista.mostrarError(e.getMessage());
            }
            
        }
    }

    public void inicio() {
          
        vista.setTitle("TIENDA DE COSMETICOS");
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
      }
}
