
package repaso;

public class Productos {
    private String nombre;
    private int codigo;
    private int cantidad;
    private Tipo tipo;

    public Productos(String nombre, int codigo, int cantidad, Tipo tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Tipo: " + tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
    
}
