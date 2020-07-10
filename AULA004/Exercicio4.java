public class Exercicio4 {
    public static void main(String[] args) {
        clearScreen();
        menorDeTres(30, 202, 118);
    }
    
static void menorDeTres(int n1, int n2, int n3){
 int menor;
    if ((n1 < n2) && (n1 < n3)) {
        menor = n1;
    } else { 
        if ((n2 < n1) && (n2 < n3)) {
            menor = n2;
        } else {
            menor = n3;
        }
    }
    System.out.println("menor: " + menor);
}

public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
}


}