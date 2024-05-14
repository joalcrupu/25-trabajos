package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.JFT_Anterior.addActionListener(this);
        this.vista.JFT_Siguiente.addActionListener(this);
        this.vista.JFT_Guardar.addActionListener(this);
    }

    public void iniciarVista() {
        vista.setTitle("TIENDA DE COSMETICOS");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.JFT_Guardar) {
            String nuevaURL = vista.JFT_URL.getText();
            modelo.visitarPagina(nuevaURL);
        } else if (e.getSource() == vista.JFT_Anterior) {
            modelo.retroceder();
        } else if (e.getSource() == vista.JFT_Siguiente) {
            modelo.avanzar();
        }
    }
}
