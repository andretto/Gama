package exercicios;

import java.util.Scanner;
public class Exarcicio5 {
    public static void main(String[] args) {
        clearScreen();
        int base, altura;


        Scanner entrada = new Scanner(System.in);
        System.out.print("\nInforme a altura: ");
        base = entrada.nextInt();

        System.out.print("Informe a base: ");
        altura = entrada.nextInt();

        System.out.print("\nÁrea do Triângulo = " + (altura * base)  );
        System.out.println("\n");

        entrada.close();

    }
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
       }


}