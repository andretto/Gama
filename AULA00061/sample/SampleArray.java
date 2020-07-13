package sample;

import java.util.ArrayList;

public class SampleArray {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Marcelo");
        lista.add("Teste");
        lista.add("Edna");
        lista.add("Eduardo");
        lista.add(2,"Dois");
        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).charAt(0)=='M' ) {
                System.out.println("Marcelo Andretto");
            } else {
                System.out.println(lista.get(i));
            }
        }

        
            
            
        

    }
    
}