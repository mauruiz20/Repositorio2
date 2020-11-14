
package repaso;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaProductos extends AbstractTableModel{

    ArrayList<String> nombreColumnas = new ArrayList<>();
    ArrayList<Productos> productos = new ArrayList<>();

    public ModeloTablaProductos() {
        nombreColumnas.add("Nombre");
        nombreColumnas.add("Codigo");
        nombreColumnas.add("Cantidad");
        nombreColumnas.add("Tipo");
    }
    
    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.size();
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Productos p = productos.get(fila);
        switch(columna){
            case 0: return p.getNombre();
            case 1: return p.getCodigo();
            case 2: return p.getCantidad();
            default: return p.getTipo();
        }
    }

    @Override
    public String getColumnName(int column) {
        return nombreColumnas.get(column);
    }
    public void actualizar(){
        GestorProductos ge = GestorProductos.crear();
        this.productos = ge.verProductos();
        this.fireTableDataChanged();
    }
    public Productos verProducto(int fila){
        return productos.get(fila);
    }
    
}
