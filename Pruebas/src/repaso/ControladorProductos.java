package repaso;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class ControladorProductos implements IControladorProductos{

    private VentanaProductos ventana;

    public ControladorProductos() {
        this.ventana = new VentanaProductos(this);

        this.ventana.setLocationRelativeTo(null);
        this.ventana.getTablaProductos().setModel(new ModeloTablaProductos());
        this.ventana.getComboTipo().setModel(new ModeloComboTipo());
        this.ventana.getComboTipo().setSelectedIndex(-1);

        this.ventana.setVisible(true);
    }

    public void btnNuevoClick(ActionEvent evt) {
        ventana.getTxtNombre().setText(null);
        ventana.getTxtCantidad().setText(null);
        ventana.getTxtCodigo().setText(null);
        ventana.getComboTipo().setSelectedIndex(-1);
        ventana.getTxtNombre().requestFocus();
    }

    public void btnGuardarClick(ActionEvent evt) {
        String nombre = ventana.getTxtNombre().getText();
        int codigo = Integer.parseInt(ventana.getTxtCodigo().getText());
        int cantidad = Integer.parseInt(ventana.getTxtCantidad().getText());
        Tipo tipo = ((ModeloComboTipo) ventana.getComboTipo().getModel()).obtenerTipo();

        GestorProductos ge = GestorProductos.crear();
        ge.nuevoProducto(nombre, codigo, cantidad, tipo);

        ModeloTablaProductos mtp = ((ModeloTablaProductos) ventana.getTablaProductos().getModel());
        mtp.actualizar();
    }

    public void btnBorrarClick(ActionEvent evt) {

        ModeloTablaProductos mtp = (ModeloTablaProductos) ventana.getTablaProductos().getModel();
        Productos p = mtp.verProducto(ventana.getTablaProductos().getSelectedRow());

        GestorProductos ge = GestorProductos.crear();
        ge.borrarProducto(p);

        mtp.actualizar();
    }

    public void txtCodigoPresionarTecla(KeyEvent evt) {
        char c = evt.getKeyChar();

        if (Character.isAlphabetic(c)) {
            evt.consume();
        }
    }

    public void txtCantidadPresionarTecla(KeyEvent evt) {
        char c = evt.getKeyChar();

        if (Character.isAlphabetic(c)) {
            evt.consume();
        }
    }

    public void cerrarWindow(WindowEvent evt) {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(null, "En realidad desea realizar cerrar la aplicacion", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }
}
