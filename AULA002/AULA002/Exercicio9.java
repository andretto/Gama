package AULA002;

import java.util.Scanner;

public class Exercicio9 {

    /**
     * Calculadora Que tenha as funções + - * / 
     * Entrada deve ter: 2 numeros - Float
     * 1 operação - char ao final apresentar o resultado
     * 
     * Condições Se o sinal digitado não corresponder a nenhuma das operações, então
     * apresntar uma mensagem "Sinal Inválido" Na operação de / verificar se o
     * divisor é válido, e maior que zero e caso seja menor que zero informar a
     * mensagem "Impossivel divdir!"
     */
    public static void main(String[] args) {
        clearScreen();
        Scanner entradaNumeros = new Scanner(System.in);
        Scanner entradaOperacao = new Scanner(System.in);

        float numero1, numero2, resultado = 0;
        String entrada, tipoDeOperacao = "";
        char operacao;

        System.out.print("\ninforme o 1º número: ");
        numero1 = entradaNumeros.nextFloat();
        System.out.print("\ninforme o 2º número: ");
        numero2 = entradaNumeros.nextFloat();

        System.out.print("\ninforme a operação que deseja fazer ( + - * ou / ): ");
        entrada = entradaOperacao.nextLine();
        operacao = entrada.charAt(0);
        // Validando a entrada da operação e executando a operação
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                tipoDeOperacao = "Adição";
                break;
            case '-':
                resultado = numero1 - numero2;
                tipoDeOperacao = "Subtração";
                break;
            case '*':
                resultado = numero1 * numero2;
                tipoDeOperacao = "Multiplicação";
                break;
            case '/':
                if (numero2 <= 0) {
                    System.out.print("\nImpossível Dividir!!");
                } else {
                    resultado = numero1 / numero2;
                    tipoDeOperacao = "Divisão";
                }
                break;
            default:
                System.out.println("Sinal Inválido");
                break;
        }
        if (tipoDeOperacao != "") {
            System.out.print("\nResultado da " + tipoDeOperacao + " entre os números: " + numero1 + " " + operacao + " " + numero2
                    + " = " + resultado);
            System.out.println("\n");
        }

        entradaNumeros.close();
        entradaOperacao.close();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
