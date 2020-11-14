
package gui;

import javax.swing.JOptionPane;

public class Principal3 {
    public static void main(String[] args) {
        int opcion = JOptionPane.showConfirmDialog(null, "Desea borrar la palabra clave especificada?", "Repositorios",JOptionPane.YES_NO_OPTION);
        
        if(opcion == JOptionPane.YES_OPTION)
            System.out.println("Se eligio Si");
        else
            System.out.println("Se eligio No");
    }
}
