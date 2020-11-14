package pruebas;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Principal {

    public static void main(String args[]) {
        
        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(1);
        enteros.add(5);
        enteros.add(8);
        
        Principal p = new Principal();
        
        p.unMetodo(enteros);
        
        for(int r: enteros){
            System.out.println(r);
        }
        
    }
    public void unMetodo(ArrayList<Integer> e){
        e.clear();
    }
}
