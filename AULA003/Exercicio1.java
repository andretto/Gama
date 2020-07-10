public class Exercicio1 {

    public static void main(String[] args) {
        clearScreen();
        System.out.println("\ninicio");
        int cont,pulaLinha ;
        cont = 100;
        pulaLinha = 1;
        while (cont < 201) {
            if (pulaLinha == 11) {
                System.out.print("\n");
                pulaLinha =1;
            }
            System.out.print(cont + " " );
            cont ++;
            pulaLinha ++;

        }
        System.out.println("\nfim");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}


