package AULA002;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);
        double valor1, valor2 ;

        System.out.print("\nInforme Valor 1: ");
        valor1 = entrada.nextDouble();

        System.out.print("\nInforme Valor 2: ");
        valor2 = entrada.nextDouble();

      
        if (valor1 >= valor2 ) {
            System.out.println(valor1 + "-" + valor2);
        }else {
            System.out.println(valor2 + "-" + valor1);
        }

        System.out.println("\n");
        entrada.close();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
