package sample0.sample1;

public class App {
 
    public static void main(String[] args) {
        clearScreen();
        Livro livro1 = new Livro("A volta dos que não foram","Autor desconhecido" ,171);
        Livro livro2 = new Livro("O Trem que furou o pneu","Autor desconhecido",80 );


        System.out.println(livro1.exibir());
        System.out.println(livro2.exibir());
        
    }
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}
