
package gui;

public class Espacio {
    private String nombre;
    private int capacidad;
    private Tipo tipo;

    public Espacio(String nombre, int capacidad, Tipo tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + nombre + "\nCapacidad: " + capacidad + "\nTipo: " + tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
