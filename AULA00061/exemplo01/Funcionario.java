package exemplo01;

//Classe implicita chamada ==> Object
public class Funcionario {
    private String nome;
    private double salario;
    // Construtores
    public Funcionario() {}
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String exibir() {
        return nome + ": " + salario;
    }
    @Override
    public String toString() {
        //return super.toString();
        return nome + ": " + salario;
    }

    


}