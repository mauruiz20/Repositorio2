
package repaso;

public enum Tipo {
    KIOSKO("Kiosco"),
    LIBRERIA("Libreria"),
    FERRETERIA("Ferreteria"),
    FORRAJERIA("Forrajeria");
    
    private String valor;
    
    private Tipo(String valor){
        this.valor = valor;
    }
    
    public String toString(){
        return this.valor;
    }
    
}
