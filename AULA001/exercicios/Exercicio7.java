package exercicios;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);
        double numero;
        double elevadoAoQuadrado, elevadoAoCubo, raizQuadrada, elevadoAPotencia10;

        System.out.print("\nInforme um número para calcular: ");
        numero = entrada.nextDouble();

        elevadoAoQuadrado = Math.pow(numero, 2);
        elevadoAoCubo = Math.pow(numero, 3);
        raizQuadrada = Math.sqrt(numero);
        elevadoAPotencia10 = Math.pow(numero, 10);

        System.out.println("Elevado ao Quadrado... = " + elevadoAoQuadrado);
        System.out.println("Elevado ao Cubo....... = " + elevadoAoCubo);
        System.out.println("Raiz Quadrada......... = " + raizQuadrada);
        System.out.println("Elevado a potencia 10. = " + elevadoAPotencia10);
        System.out.println("\n");

        entrada.close();


        
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
       }
 
}