package sample01;

import java.util.LinkedList;
import java.util.Queue;

public class Sample02 {
    
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);
        
        while (!fila.isEmpty()) {
            System.out.println(fila.remove());
        }




    }
}
