package AULA002;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, notaFinal;
        double peso1 = 0.4;
        double peso2 = 0.6;


        System.out.print("\nInforme Nota 1: ");
        nota1 = entrada.nextDouble();

        System.out.print("\nInforme Nota 2: ");
        nota2 = entrada.nextDouble();

        notaFinal = (nota1 * peso1) + (nota2* peso2);
        System.out.println((nota1 * peso1));
        System.out.println((nota2 * peso2));


        if (notaFinal >=6 ) {
            System.out.println("Aluno aprovado, com a nota final de: " + notaFinal);
        }else {
            System.out.println("Aluno REPROVADO, com a nota final de: " + notaFinal);
        }

        System.out.println("\n");
        entrada.close();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
