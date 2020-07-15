package exercicio72;

import java.util.Stack;

public class Exercicio72 {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        // ...LICAF OTIUM E OICICREXE ETSE

        String texto = "ESTE EXERCICIO E MUITO FACIL";

        //Checa se tem espaco na última palavra..
        if (texto.charAt(texto.length()-1) != ' ') {
            texto = texto + " ";
        }

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ') {
                pilha.push(texto.charAt(i));
            } else {
                while (!pilha.isEmpty()) {
                    System.out.print(pilha.pop());
                }
                System.out.print(" ");

            }

        }

    }
}
