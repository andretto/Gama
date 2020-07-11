
/**
 * Relogio
 */
public class Relogio {
    // atributos
    private int hora = 99, minuto = 99, segundo = 99;

    // metodo construtor
    protected Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // metodos
    // SETs
    public void setHoraMinudoSegundo(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            hora = 0;
            System.out.print("\nO valor da hora deve ser entre 00 e 23");
        } else {
            this.hora = hora;
        }

    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            minuto = 0;
            System.out.print("\nO valor do Minuto deve ser entre 00 e 59");
        } else {
            this.minuto = minuto;
        }

    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            segundo = 0;
            System.out.print("\nO valor do segundo deve ser entre 00 e 59");
        } else {
            this.segundo = segundo;
        }
    }

    public void setZeraHoraMinutoSegundo() {
        this.hora = 99;
        this.minuto = 99;
        this.segundo = 99;
    }

    // GETs
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void getExibir() {
        if (hora == 99 && minuto == 99 && segundo == 99) {
            System.out.print(
                    "\n!!Setar nos metodos Relogio.setHora();Relogio.setMinuto(); Relogio.setSegundo() ou setHoraMinudoSegundo() a hora desejada!!!");
        } else {
            System.out.format("\n%02d:%02d:%02d", hora, minuto, segundo);
        }
    }
}