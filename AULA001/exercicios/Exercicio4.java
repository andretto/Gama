package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);
        float kmEntrada;
        final int pePolegadas  = 12;
        final int jardaPes  = 3;
        final int milhaJardas  = 1760;
        final float kmMihas = 0.62137f;

        float milhas, jardas, polegadas, pes;

        System.out.print("\nInforme uma medida em Km: ");
        kmEntrada = entrada.nextFloat();

        milhas = kmEntrada * kmMihas;
        jardas = milhas * milhaJardas;
        pes = jardas * jardaPes;
        polegadas = pes * pePolegadas;
        
        System.out.print( "\n" + kmEntrada + " km em milhas    = " +  milhas  );
        System.out.print( "\n" + kmEntrada + " km em jardas    = " +  jardas  );
        System.out.print( "\n" + kmEntrada + " km em pes       = " +  pes );
        System.out.print( "\n" + kmEntrada + " km em polegadas = " +  polegadas  +"\n");
        System.out.println();
        entrada.close();
      
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
       }


}