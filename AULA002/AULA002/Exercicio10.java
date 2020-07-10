package AULA002;

import java.util.Scanner;

public class Exercicio10 {

    /**
     * Criar um programa que leia um entrada de 1 a 7 e retorne se este numero é dia
     * útil ou fim de semana Considere Seg = 1 e Dom = 7
     * 
     */
    public static void main(String[] args) {
        clearScreen();
        Scanner entradaNumero = new Scanner(System.in);

        short numero;
        String NomeDoDiaDaSemana = "", util = "";
        

        System.out.print("\ninforme um numero de 1 a 7: ");
        numero = entradaNumero.nextShort();

        switch (numero) {
            case 1:
                NomeDoDiaDaSemana = "Segunda";
                util = "dia útil";
                break;
            case 2:
                NomeDoDiaDaSemana = "Terça";
                util = "dia útil";
                break;
            case 3:
                NomeDoDiaDaSemana = "Quarta";
                util = "dia útil";
                break;
            case 4:
                NomeDoDiaDaSemana = "Quinta";
                util = "dia útil";
                break;
            case 5:
                NomeDoDiaDaSemana = "Sexta";
                util = "dia útil";
                break;
            case 6:
                NomeDoDiaDaSemana = "Sábado";
                util = "fim de semana";
                break;
            case 7:
                NomeDoDiaDaSemana = "Domingo";
                util = "fim de semana";
                break;
            default:
                System.out.println("Número Inválido!!!");
                break;
        }
        System.out.println("o número informado, é referente ao dia da semana " + NomeDoDiaDaSemana + " e é: "  + util);
        
entradaNumero.close();
        
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
