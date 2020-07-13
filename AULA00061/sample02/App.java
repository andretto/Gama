package sample02;



public class App {

    public static void main(String[] args) {

        //Funcionario funcionario = new Funcionario("Funcionario JR", 20, 8);
        //FuncionarioSenior funcionarioSenior = new FuncionarioSenior("Funcionario SR", 20, 8, 10);

        GerenciaFunc funcionarios = new GerenciaFunc();
        funcionarios.addFuncionario("JR01", 10, 15);
        funcionarios.addFuncionario("JR02", 10, 15);
        funcionarios.addFuncionario("JR03", 10, 15);
        System.out.println("\n");
        funcionarios.addSenior("SR01", 10,10, 20);
        funcionarios.addSenior("SR02", 10,10, 20);
        funcionarios.addSenior("SR03", 10,10, 20);

        System.out.println("\n");
        System.out.println(funcionarios.listaTodos());
        System.out.println("\n");
        System.out.println(funcionarios.listaTodosSenior());


    }
    
}

