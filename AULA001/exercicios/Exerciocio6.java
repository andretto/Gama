package exercicios;

import java.util.Scanner;
public class Exerciocio6 {
    public static void main(String[] args) {
        clearScreen();
        final float distribuidor = 1.28f;
        final float impostos = 1.45f;
        float custoFabrica, custoCarroDistribuidor, custoCarroImpostos; 

        Scanner entrada = new Scanner(System.in);
        System.out.print("\nInforme o Custo da Fábrica R$ ");
        custoFabrica = entrada.nextInt();
        custoCarroDistribuidor = custoFabrica * distribuidor;
        custoCarroImpostos = custoCarroDistribuidor * impostos;

        System.out.print("\nCusto Fábrica....................................................................... " +  custoFabrica);
        System.out.print("\nCusto Fabrica + Distribuidor........................................................ " +  custoCarroDistribuidor);
        System.out.print("\nCusto final ao Consumidor (Custo Fábrica(R$) + Distribuiidor(28%) + Impostos(45%)... " +  custoCarroImpostos);
        System.out.println("\n");
        entrada.close();
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
       }
 
}