
package gui;

import javax.swing.JFrame;

public class Principal1 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi ventana");
        ventana.setSize(300,400); //Tamaño en pixeles
        ventana.setLocationRelativeTo(null); //Centrar ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar con la cruz
        ventana.setResizable(false); //No se pueda maximizar
        ventana.setVisible(true); //Visible
    }  
    
}
