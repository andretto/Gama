package exercicios;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        clearScreen();
        String nome;
        double salarioAtual; 
        double salatioComAumento;

        System.out.print("\nDigite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite o Salario Atual: ");
        salarioAtual = entrada.nextDouble();

        salatioComAumento = (salarioAtual * 1.25);

         System.out.print("\nO Salário do " + nome + " teve 25% de aumento e passou de R$ " + salarioAtual + " Para R$ " + salatioComAumento );
         System.out.println();

         entrada.close();

    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
       }
}