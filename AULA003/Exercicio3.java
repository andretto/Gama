import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        clearScreen();

        Scanner entrada = new Scanner(System.in);
        int cont, numero ;

        System.out.println("Informe o número: ");
        numero = entrada.nextInt();

        System.out.println("\ninicio");
        cont = 1;
        while (cont <= numero) {
            System.out.println( (cont));
            cont= cont *2;
        }
        System.out.print("\nfim");
        entrada.close();
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
