
package gui;

import javax.swing.DefaultComboBoxModel;

public class ModeloComboTipos extends DefaultComboBoxModel{
    
    public ModeloComboTipos() {
        for(Tipo tipo: Tipo.values())
            this.addElement(tipo);
    }
    public Tipo obtenerTipo() {
        return (Tipo)this.getSelectedItem();
    }
    public void seleccionarTipo(Tipo tipo){
        this.setSelectedItem(tipo);
    }
}
