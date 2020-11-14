
package gui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Profesor {
    
    private String nombre;
    private String apellido;
    private int dni;
    private Cargo cargo;
    private LocalDate fechaNacimiento;

    public Profesor(String nombre, String apellido, int dni, Cargo cargo, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cargo = cargo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void mostrar(){
        
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni + "\nCargo: " + cargo);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    
    }
}
