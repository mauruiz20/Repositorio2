
package repaso;

import javax.swing.DefaultComboBoxModel;

public class ModeloComboTipo extends DefaultComboBoxModel{
    
    public ModeloComboTipo(){
        for(Tipo t: Tipo.values())
            this.addElement(t);
    }
    public Tipo obtenerTipo(){
        return (Tipo)this.getSelectedItem();
    }
    public void seleccionarTipo(Tipo tipo){
        this.setSelectedItem(tipo);
    }
}
