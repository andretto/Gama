package appplacar;

public class App {
    public static void main(String[] args) {
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("São Paulo", "Corinthians");
        Placar placar3 = new Placar("São Paulo", 1, "Corinthians",6);

        System.out.println(placar1.exibir());
        System.out.println(placar2.exibir());
        System.out.println(placar3.exibir());




    }
    
}
