import java.util.ArrayList;
import java.util.List;

public class EjemploList {
    public static void main(String[] args) {
    
        List<String> nombres = new ArrayList<>();
        
   
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beatriz");
        nombres.add("Daniel");
        
 
        System.out.println("Elementos en la lista: " + nombres);
        
       
        String nombreEnIndiceDos = nombres.get(2);
        System.out.println("Elemento en el índice 2: " + nombreEnIndiceDos);
        
      
        nombres.set(1, "Carla");
        System.out.println("Lista después de modificar el elemento en el índice 1: " + nombres);
        
    
        nombres.add(2, "Pedro");
        System.out.println("Lista después de insertar 'Pedro' en el índice 2: " + nombres);
        
    
        nombres.remove(3);
        System.out.println("Lista después de eliminar el elemento en el índice 3: " + nombres);
        
       
        int indiceDeAna = nombres.indexOf("Ana");
        System.out.println("Índice de 'Ana' en la lista: " + indiceDeAna);
        

        List<String> subLista = nombres.subList(1, 3);
        System.out.println("Sublista de la lista original: " + subLista);
    }
}

