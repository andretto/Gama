import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        clearScreen();

        Scanner entrada = new Scanner(System.in);
        Scanner nomes1  = new Scanner(System.in);
        int qtdeNomes;
        

        // int[] valores, numeros; // ambos são vetores
        // int valores1[], numeros1; // valores1 é vetor e numeros1 é int
        String[] nomes;
        System.out.print("\nInforme a quantidade de Nomes: ");
        qtdeNomes = entrada.nextInt();
        nomes = new String[qtdeNomes];
        

        // Entrada dos Nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("\ndigite o " + (i + 1) + "o. Nome: ");
            nomes[i] = nomes1.nextLine();
        }
        entrada.close();
        nomes1.close();
        
        // Motra todas as notas e soma as notas para calcular a média.
        System.out.println("Tamanho do Vetor: " + nomes.length);
        System.out.print("Motrando todos os nomes na ordem inversa: ");
        for (int i = nomes.length -1; i != -1 ; i--) {
            
            System.out.print("["+ i + "]: " + nomes[i] + " ");
            
        }
        //fim
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}