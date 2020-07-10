package exercicio7;

public class App {
    public static void main(String[] args) {
        clearScreen();

        Veiculo carro1 = new Veiculo("Sentra", "Nissan", 14);
        Veiculo carro2 = new Veiculo("Freemont", "Fiat", 10);

        System.out.println(carro1.exibirModeloMarca() + " - " + carro1.exibirConsumo());
        System.out.println(carro2.exibirModeloMarca() + " - " + carro2.exibirConsumo());
        System.out.println("\n");


        
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
