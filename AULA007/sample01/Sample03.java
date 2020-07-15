package sample01;

import java.util.TreeSet;

public class Sample03 {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();
        int [] vetor = {2,4,1,6,3,9,5,9,5};
        for (int i : vetor) {
            arvore.add(i);
        }
        for (Integer ii : arvore) {
            System.out.print(ii + " ");
            
        }
    }
}