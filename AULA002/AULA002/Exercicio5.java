package AULA002;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);
        final String senha = "R10p5";
        String senhaDigitada;

        System.out.print("\nInforme a senha de acesso: ");
        senhaDigitada = entrada.next();

        if (senha.equals(senhaDigitada) == true) {
            System.out.println("Senha Correta!!!");
        } else {
            System.out.println("Senha ERRADA!!!");
        }
        System.out.println("\n");
        entrada.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
