package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Vista extends JFrame {
    public JTextField JFT_Ingresar;
    public JButton Button_Guardar;
    public JTextArea JFT_mostrarLista;
    public JTextArea JFT_mostrarpaginasPila;
    public JButton Button_Borrar;
    public JButton Button_Actualizar;
    
    public Vista() {
        this.setTitle("Gestor de Memoria");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel label1 = new JLabel("Expresión:");
        label1.setBounds(20, 20, 100, 30);
        panel.add(label1);
        
        JFT_Ingresar = new JTextField();
        JFT_Ingresar.setBounds(120, 20, 200, 30);
        panel.add(JFT_Ingresar);
        
        Button_Guardar = new JButton("Guardar");
        Button_Guardar.setBounds(340, 20, 100, 30);
        panel.add(Button_Guardar);
        
        JLabel label2 = new JLabel("Variables en Memoria:");
        label2.setBounds(20, 70, 200, 30);
        panel.add(label2);
        
        JFT_mostrarLista = new JTextArea();
        JFT_mostrarLista.setBounds(20, 100, 200, 200);
        panel.add(JFT_mostrarLista);
        
        JLabel label3 = new JLabel("Variables en Pila:");
        label3.setBounds(240, 70, 200, 30);
        panel.add(label3);
        
        JFT_mostrarpaginasPila = new JTextArea();
        JFT_mostrarpaginasPila.setBounds(240, 100, 200, 200);
        panel.add(JFT_mostrarpaginasPila);
        
        Button_Borrar = new JButton("Borrar");
        Button_Borrar.setBounds(120, 320, 100, 30);
        panel.add(Button_Borrar);
        
        Button_Actualizar = new JButton("Actualizar");
        Button_Actualizar.setBounds(240, 320, 100, 30);
        panel.add(Button_Actualizar);
        
        this.add(panel);
    }

    public String solicitarExpresiones() {
        return JFT_Ingresar.getText();
    }

    public void mostrarResultado(double resultado) {
        JFT_mostrarLista.append("Resultado: " + resultado + "\n");
    }

    public void mostrarError(String message) {
        JFT_mostrarLista.append("Error: " + message + "\n");
    }

    public String solicitarExpresion() {
    return JFT_Ingresar.getText();
}

    }

