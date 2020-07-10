package AULA002;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);
        double numero;
        System.out.print("\nInforme um número: ");
        numero = entrada.nextDouble();

        if (numero > 20) {
            System.out.println("A metade de " + numero + " é " + (numero / 2));
            System.out.println("\n");
        }
        entrada.close();
        
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}