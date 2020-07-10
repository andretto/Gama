public class Sample02 {
    public static void main(String[] args) {
        clearScreen();
        
        linhaPer(5,'-');
        linhaPer(7,'*');
        linhaPer(9,'&');
        linhaPer(11,'%');
        System.out.println("Oie mundo");
        linhaPer(13,'%');
        linhaPer(15,'&');
        linhaPer(17,'*');
        linhaPer(19, '-');

        

    }

    public static void linha() {
        System.out.println("----------------------------------------------------------");

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void linhaPer (int tam, char simbolo){
        for (int i = 0; i < tam; i++) {
            System.out.print("" + simbolo);
        }
        System.out.println();
    }

}

// tipoDeRetorno NOME (){

// }