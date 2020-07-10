import java.util.Scanner;

public class Exercico5 {
    public static void main(String[] args) {
        clearScreen();

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a palavra ou frase: ");
        int vogs = 0;

        vogs = contaVogais(entrada.next());
        System.out.println("Tot de Vogais: " + vogs);
        entrada.close();

    }

    static int contaVogais(String palavra) {
        int contVogais = 0;
        String copia = palavra.toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {
            if (copia.charAt(i) == 'a' || copia.charAt(i) == 'e' || copia.charAt(i) == 'i'
                    || copia.charAt(i) == 'o' || copia.charAt(i) == 'u') {
                        contVogais++; 
            }

        }
        return contVogais;
      

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}