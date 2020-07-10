import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        clearScreen();

        Scanner entrada = new Scanner(System.in);
        int cont, numero;

        System.out.println("Informe o número: ");
        numero = entrada.nextInt();

        System.out.println("\ninicio");
        cont = 1;
        while (cont < 11) {
            System.out.println( numero + " x " + cont + " = " + (numero * cont));
            cont++;
        }
        System.out.print("\nfim");
        entrada.close();
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
