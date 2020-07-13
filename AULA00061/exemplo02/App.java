package exemplo02;

public class App {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Funcionario JR", 20, 8);
        FuncionarioSenior funcionarioSenior = new FuncionarioSenior("Funcionario SR", 20, 8, 10);

        System.out.println("\n");

        System.out.println(funcionario.exibir());
        System.out.println(funcionarioSenior.exibir());

    }
    
}