/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;

public class GestorEspacios {
    private ArrayList<Espacio> espacios = new ArrayList<>();
    private static GestorEspacios instancia;
    
    private GestorEspacios(){
        
    }
    public static GestorEspacios crear(){
        if(instancia == null)
            instancia = new GestorEspacios();
        return instancia;
    }
    public void nuevoEspacio(String nombre, int capacidad, Tipo tipo) {
        Espacio e = new Espacio(nombre, capacidad, tipo);
        if(!this.espacios.contains(e))
            this.espacios.add(e);
    }
    public ArrayList<Espacio> verEspacios(){
        return espacios;
    }
    public void borrarEspacio(Espacio e){
        this.espacios.remove(e);
    }
}
