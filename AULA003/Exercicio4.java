import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        clearScreen();

        Scanner entrada = new Scanner(System.in);
        int cont, numero, par = 0, impar = 0;

        System.out.println("\ninicio");
        cont = 1;
        while (cont < 11) {
            System.out.print("\nInforme o número " + cont + ": ");
            numero = entrada.nextInt();
            if (numero % 2 == 0) { // par
                par++;
            } else { // impar
                impar++;
            }
            System.out.print("....................... Parcial --> Qtde Pares: " + par + " - Qtde Impares: " + impar);

            cont++;
        }
        System.out.println("...................................................................");
        System.out.println("\n....................... Final ----> Qtde Pares: " + par + " - Qtde Impares: " + impar);

        System.out.print("\nfim");
        entrada.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
