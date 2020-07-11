package appplacar;

public class Placar {
    // atributos
    String time1, time2;
    int placar1, placar2;

    Placar() {
        time1 = "Time da casa";
        time2 = "Visitante";

    }

    Placar(String time1, String time2) {
        this.time1 = time1;
        this.placar1 = 0;
        this.time2 = time2;
        this.placar2 = 0;
    }

    Placar(String time1, int placar1, String time2, int placar2) {
        this.time1 = time1;
        this.placar1 = placar1;
        this.time2 = time2;
        this.placar2 = placar2;
    }

    String exibir() {
        return time1 + " x " + placar1  + " x " + time2  + " x " + placar2;

    }

}
