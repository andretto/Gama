import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        clearScreen();

        Scanner entrada = new Scanner(System.in);
        int qtdeNumeros;
        Random random = new Random();
        int lado1 =0, lado2=0, lado3=0, lado4=0, lado5=0, lado6=0;

        // int[] valores, numeros; // ambos são vetores
        // int valores1[], numeros1; // valores1 é vetor e numeros1 é int
        int[] numerosRandom;
        System.out.print("\nInforme a quantidade de Numeros: ");
        qtdeNumeros = entrada.nextInt();
        numerosRandom = new int[qtdeNumeros];

        // Carrando o Vetor
        System.out.println("Carregando o Vetor randomicamente com números de 1 a 6");
        for (int i = 0; i < numerosRandom.length; i++) {
            numerosRandom[i] = 1 + random.nextInt(6);
            switch (numerosRandom[i]) {
                case 1:
                    lado1++;
                    break;
                case 2:
                    lado2++;
                    break;
                case 3:
                    lado3++;
                    break;
                case 4:
                    lado4++;
                    break;
                case 5:
                    lado5++;
                    break;
                case 6:
                    lado6++;
                    break;
                default:
                    break;
            }
            //System.out.println(numerosRandom[i]);
        }
        entrada.close();
        System.out.println("Lado 1 teve: " + lado1 + " repetições ");
        System.out.println("Lado 2 teve: " + lado2 + " repetições ");
        System.out.println("Lado 3 teve: " + lado3 + " repetições ");
        System.out.println("Lado 4 teve: " + lado4 + " repetições ");
        System.out.println("Lado 5 teve: " + lado5 + " repetições ");
        System.out.println("Lado 6 teve: " + lado6 + " repetições ");
        System.out.println("Conferindo a soma: " + (lado1 + lado2 + lado3 +lado4 +lado5 +lado6));
        // fim
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}