package exemplo01;

public class Gerente extends Funcionario {
    int numFuncionarios;
    public Gerente(String nome, double salario, int numFuncionarios) {
        super(nome, salario);
        this.numFuncionarios = numFuncionarios;
    }
    @Override
    public String toString() {
        return  super.exibir() +": "+ numFuncionarios;
    }
    
}