
package repaso;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

public interface IControladorProductos {
    
    public void btnNuevoClick(ActionEvent evt);
    public void btnGuardarClick(ActionEvent evt);
    public void btnBorrarClick(ActionEvent evt);
    public void cerrarWindow(WindowEvent evt);
    public void txtCodigoPresionarTecla(KeyEvent evt);
    public void txtCantidadPresionarTecla(KeyEvent evt);
}
