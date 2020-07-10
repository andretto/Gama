import java.util.Scanner;


public class Sample01 {

    public static void main(String[] args) {
        clearScreen();
        
        Scanner entrada = new Scanner(System.in);
        int tamanho;

        // int[] valores, numeros; // ambos são vetores
        // int valores1[], numeros1; // valores1 é vetor e numeros1 é int
        int[] valores;
        System.out.print("\nInf qrde de valores serão digitados: ");
        tamanho = entrada.nextInt();
        valores = new int[tamanho];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("\ndigite o " + (i + 1) + "o. numero: ");
            valores[i] = entrada.nextInt();

        }

        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");

        }
        entrada.close();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}