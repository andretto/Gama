package exercicio74;
import java.util.TreeSet;
import java.util.Random;
public class AppRemoveDuplicados {
    public static void main(String[] args) {
        clearScreen();
        TreeSet<Integer> arvore = new TreeSet<>();
        Random random = new Random();
        int[] numerosRandom;
        int cont=1;
        numerosRandom = new int[1000];
        // Carrando o Vetor
        System.out.println("Carregando o Vetor randomicamente com números de 1 a 500");
        for (int i = 0; i < numerosRandom.length; i++) {
            arvore.add(1 + random.nextInt(500));
        }

        for (Integer ii : arvore) {
            System.out.format("[%03d]%03d - ",cont,ii );
            cont ++;
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}