package AULA002;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(final String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);
        short nota1, nota2, nota3, nota4, faltas ;
        float media, notaExame, mediaExame ;

        System.out.print("\nInforme Nota 1: ");
        nota1 = entrada.nextShort();
        System.out.print("\nInforme Nota 2: ");
        nota2 = entrada.nextShort();
        System.out.print("\nInforme Nota 3: ");
        nota3 = entrada.nextShort();
        System.out.print("\nInforme Nota 4: ");
        nota4 = entrada.nextShort();

        media = ((nota1 + nota2 + nota3 + nota4) / 4);
        System.out.print("\nInforme a quantidade de faltas: ");
        faltas = entrada.nextShort();

        if (faltas >= 16) {
            System.out.println("Reprovado, direto por ter 16 ou mais faltas");
        } else {
            if (media >= 6) {
                System.out.println("Aluno Aprovado direto, com a média: " + media);
            } else {
                System.out.print("\nAluno, com média atual, " + media + " --> abaixo da média 6.0");
                System.out.print("\nInforme nota do Exame: ");
                notaExame = entrada.nextShort();
                mediaExame = ((media + notaExame)/2);
                if (mediaExame >=5) {
                    System.out.println("Aluno Aprovado, após o Exame, com a média: " + mediaExame);
                } else {
                    System.out.println("Aluno REPROVADO, após o Exame, com a média: " + mediaExame);
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
