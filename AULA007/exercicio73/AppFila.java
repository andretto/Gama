package exercicio73;

public class AppFila {
    public static void main(String[] args) {

        Fila fila = new Fila();
        System.out.println("inicio");
        fila.adicionar("p01", "N");
        fila.adicionar("p02", "N");
        fila.adicionar("p03", "P");
        fila.adicionar("p04", "P");
        fila.adicionar("p05", "N");
        fila.adicionar("p06", "N");
        fila.adicionar("p07", "N");
        fila.adicionar("p08", "P");
        fila.adicionar("p09", "P");
        fila.adicionar("p11", "N");
        fila.adicionar("p10", "P");

        System.out.println(fila.listarTudo());

        System.out.println("Fim");


        

    }

}
