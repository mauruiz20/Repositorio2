
package gui;

import javax.swing.DefaultComboBoxModel;

public class ModeloComboCargo extends DefaultComboBoxModel{
    
    public ModeloComboCargo(){
        for(Cargo cargo: Cargo.values())
            this.addElement(cargo);              //ESTE CONTRUCTOR LLENA AL COMBO CON LOS DATOS DE LA ENUMERACION
    }
    public Cargo obtenerCargo(){
        return (Cargo)this.getSelectedItem(); // OBTENER UN CARGO SELECCIONADO
    }
    public void seleccionarCargo(Cargo cargo){ // SELECCIONAR UN CARGO ESPECIFICO
        this.setSelectedItem(cargo);
    }
}
