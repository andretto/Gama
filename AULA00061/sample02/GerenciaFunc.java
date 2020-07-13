package sample02;

import java.util.ArrayList;

public class GerenciaFunc {
    private ArrayList<Funcionario> arrayFuncionarios;

    public GerenciaFunc(){
        arrayFuncionarios = new ArrayList<>();
    }

    public void addFuncionario(String nome, int horasTrabalhadas, double valorPagoPorHoraTrabalhada){
        Funcionario func = new Funcionario(nome, horasTrabalhadas, valorPagoPorHoraTrabalhada);
        arrayFuncionarios.add(func);
    }

    public void addSenior(String nome, int horasTrabalhadas, double valorPagoPorHoraTrabalhada, double bonus) {
        FuncionarioSenior senior = new FuncionarioSenior(nome, horasTrabalhadas, valorPagoPorHoraTrabalhada, bonus);
        arrayFuncionarios.add(senior);

    }

    public boolean removerFuncionario(String nome){
        for (Funcionario funcionario : arrayFuncionarios) {
            if (funcionario.getNome().equals(nome)){
                arrayFuncionarios.remove(funcionario);
                return true;
            }
        }
        return false;
        



    }
    public String listaTodos(){
        String saida ="";
        for (Funcionario funcionario : arrayFuncionarios) {
            saida += funcionario.exibir() +"\n";
        }
        return saida;
    }

    public String listaTodosSenior(){
        String saida ="";
        for (Funcionario funcionario : arrayFuncionarios) {
            if (funcionario instanceof FuncionarioSenior ) {
                saida += funcionario.exibir() +"\n";
            }
        }
        return saida;

    }





    
}