package exemplo01;

public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gerente", 100, 20);  
        Funcionario funcionario = new Funcionario("Funcionario", 100);
        //gerente.teste();      
        System.out.println("\n");
        System.out.println(gerente.exibir());
        System.out.println(gerente);
        //System.out.println(funcionario.exibir());
        //System.out.println(funcionario.toString());
        System.out.println(funcionario);
    }
}