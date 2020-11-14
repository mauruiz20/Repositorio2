
package gui;

public enum Tipo {
    ANFITEATRO("Anfiteatro"),
    AULA("Aula"),
    LABORATORIO("Laboratorio"),
    SALA("Sala");
    
    private String valor;
    
    private Tipo(String valor){
        this.valor = valor;
    }
    
    public String toString(){
        return this.valor;
    }
}
