
package repaso;

import java.util.ArrayList;

public class GestorProductos{
    ArrayList<Productos> productos = new ArrayList<>();
    private static GestorProductos instancia;

    private GestorProductos() {
    }
    
    public static GestorProductos crear(){
        if(instancia == null)
            instancia = new GestorProductos();
        return instancia;
    }
    
    public void nuevoProducto(String nombre, int codigo, int cantidad, Tipo tipo){
        Productos p = new Productos(nombre, codigo, cantidad, tipo);
        if(!productos.contains(p))
            productos.add(p);
    }
    public ArrayList<Productos> verProductos(){
        return productos;
    } 
    public void borrarProducto(Productos p){
        productos.remove(p);
    }
}
