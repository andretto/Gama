package AULA002;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);
        short lado1, lado2, lado3;

        System.out.print("\nInforme 1º Lado ");
        lado1 = entrada.nextShort();
        System.out.print("\nInforme 2º Lado ");
        lado2 = entrada.nextShort();
        System.out.print("\nInforme 3º Lado ");
        lado3 = entrada.nextShort();

        if ((lado1 > lado2 + lado3) || (lado2 > lado1 + lado3) || (lado3 > lado1 + lado2)) { // não é triangulo
            System.out.println("Não é triangulo algum!!");
        } else {
            if (lado1 == lado2 && lado2 == lado3 ) { // é triangulo
                System.out.println("É triangulo Equilátero!!");
            } else {
                if (lado1 == lado2 ||  lado2 == lado3  || lado1 == lado3) { // é triangulo isósceles
                    System.out.println("É triangulo isósceles");
                } else {
                    System.out.println("É triangulo escaleno");
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
