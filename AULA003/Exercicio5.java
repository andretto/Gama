import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        clearScreen();

        Scanner entrada = new Scanner(System.in);
        int cont, numero, par = 0, impar = 0, soma= 0;
        double media, percentPositivos;

        System.out.println("\ninicio");
        cont = 1;
        
        for (cont = 1; cont <= 10; cont++) {
            System.out.print("\nInforme o número " + cont + ": ");
            numero = entrada.nextInt();
            if (numero % 2 == 0) { // par
                par++;
            } else { // impar
                impar++;
            }
            soma = soma + numero;
            System.out.print("....................... Parcial --> Soma = " + soma + " Qtde Pares: " + par + " - Qtde Impares: " + impar);
       
        }
        media = soma / 10;
        percentPositivos = par / 10;
        System.out.println("...................................................................");
        System.out.println("\n....................... Final ----> Qtde Pares: " + par + " - Qtde Impares: " + impar);
        System.out.print("\n....................... Final ----> Soma = " + soma);
        System.out.print("\n....................... Final ----> Média = " + media);
        System.out.print("\n....................... Final ----> % nro positivos = " + percentPositivos + "%");


        System.out.print("\nfim");
        entrada.close();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
