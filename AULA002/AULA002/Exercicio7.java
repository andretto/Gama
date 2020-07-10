package AULA002;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);
        short salario;

        System.out.print("\nInforme Valor do Salario ");
        salario = entrada.nextShort();

        if (salario < 600) {
            System.out.println("Isento de Imposto");
        } else {
            if (salario >= 600 && salario <= 1200) {
                System.out.println("Desconto de 20%");
            } else {
                if (salario > 1200 && salario <= 2000) {
                    System.out.println("Desconto de 25%");
                } else {
                    System.out.println("Desconto de 30%");
                }

            }
        }
        System.out.println("\n");
        entrada.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
