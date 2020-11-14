package gui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaEspacios extends AbstractTableModel {

    private ArrayList<String> nombreColumnas = new ArrayList<>();
    private ArrayList<Espacio> espacios = new ArrayList<>();

    public ModeloTablaEspacios() {
        nombreColumnas.add("Nombre");
        nombreColumnas.add("Capacidad");
        nombreColumnas.add("Tipo");

        GestorEspacios ge = GestorEspacios.crear();
        this.espacios = ge.verEspacios();
//        espacios.add(new Espacio("A1", 300, Tipo.ANFITEATRO));
//        espacios.add(new Espacio("1-3-14", 50, Tipo.AULA));
//        espacios.add(new Espacio("1-3-08", 80, Tipo.LABORATORIO));

    }
    // METODOS OBLIGATORIOS A IMPLEMENTAR

    @Override
    public int getRowCount() { // DEVUELVE LA CANTIDAD DE FILAS
        return this.espacios.size();
    }

    @Override
    public int getColumnCount() { // DEVUELVE LA CANTIDAD DE COLUMNAS
        return this.nombreColumnas.size();
    }

    @Override
    public Object getValueAt(int fila, int columna) { //ESCRIBE TODOS LOS ESPACIOS
        Espacio e = espacios.get(fila);
        switch (columna) {
            case 0: return e.getNombre();
            case 1: return e.getCapacidad();
            default: return e.getTipo();
        }
    }

    @Override
    public String getColumnName(int columna) { //PONE LOS NOMBRES DE LAS COLUMNAS
        return this.nombreColumnas.get(columna);
    }
    
    
    //METODOS PARA PODER EDITAR LAS CELDAS DE LA TABLA
    
    
    public Espacio verEspacio(int fila){ //METODO PARA DEVOLVER UN ESPACIO DEL ARRAYLIST ESPACIOS
        return this.espacios.get(fila);
    }

    
    @Override
    public boolean isCellEditable(int fila, int columna) { //METODO PARA QUE LA TABLA SEA SIEMPRE EDITABLE
        return true;
    }

    @Override
    public void setValueAt(Object valor, int fila, int columna) { // SEGUN DONDE ESTE PARADO ASGINARLE UN VALOR A LA CELDA
        Espacio e = this.espacios.get(fila);                      // EL METODO SIRVE PARA EDITAR LA TABLA
        switch(columna){
            case 0: e.setNombre((String)valor);
            break;
            case 1: e.setCapacidad((Integer)valor);
            break;
            default: e.setTipo((Tipo)valor);
            break;
        }
    }

    @Override
    public Class<?> getColumnClass(int columna) { // METODO PARA PODER EDITAR ENTEROS SIN PROBLEMAS
        switch(columna){
            case 0: return String.class;
            case 1: return Integer.class;
            default: return String.class;
        }
    }
    public void actualizar(){
        GestorEspacios ge = GestorEspacios.crear();
        this.espacios = ge.verEspacios();
        this.fireTableDataChanged();
    }

}
