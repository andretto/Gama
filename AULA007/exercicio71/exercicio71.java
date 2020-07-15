package exercicio71;

import java.util.Stack;

public class exercicio71 {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        String texto = "ESTE EXERCICIO E MUITO FACIL...";
        //Solução 01
        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }
         //método da String para Array
         //Solução 02
        for (Character character : texto.toCharArray()) {
            pilha.push(character);
            
        }

        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
    
    }

}
