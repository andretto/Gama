public class App {

    public static void main(String[] args) {
        clearScreen();

        Relogio relogio1 = new Relogio(10, 10, 9);
        
        relogio1.getExibir();
        relogio1.setZeraHoraMinutoSegundo();
     //   relogio1.setHora(11);
        //relogio1.setMinuto(11);
        
        //relogio1.setSegundo(11);
        relogio1.getExibir();
        
        
    }
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
