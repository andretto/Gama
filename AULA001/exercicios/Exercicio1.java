package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        float notaUm;
        float notaDois;
                
        System.out.println("\nDigite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite a 1º nota: ");
        notaUm = entrada.nextFloat();
        
        System.out.println("Digite a 2º nota: ");
        notaDois = entrada.nextFloat();
                
        System.out.println("Para o Aluno: " + nome + " a média é: " + ((notaUm + notaDois) / 2));

        entrada.close();

    }
    
}
    
