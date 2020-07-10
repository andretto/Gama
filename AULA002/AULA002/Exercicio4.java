package AULA002;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, valorPrestacao, valorMaximoParcela ;

        System.out.print("\nInforme o Salario Bruto: ");
        salarioBruto = entrada.nextDouble();

        System.out.print("\nInforme o Valor da Prestação: ");
        valorPrestacao = entrada.nextDouble();

        valorMaximoParcela = salarioBruto * 0.3f;
        System.out.println(valorMaximoParcela);
        
      
        if (valorPrestacao <= valorMaximoParcela ) {
            System.out.println("Emprestimo aprovado!");
        }else {
            System.out.println("Emprestimo REPROVADO!!!!");
        }

        System.out.println("\n");
        entrada.close();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
