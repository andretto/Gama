package sample02;

public class Funcionario {

    private String nome;
    private double horasTrabalhadas;
    private double valorPagoPorHoraTrabalhada, salarioFinal;
    
    //Construtores;
    public Funcionario() {}
    public Funcionario(String nome, int horasTrabalhadas, double valorPagoPorHoraTrabalhada) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPagoPorHoraTrabalhada = valorPagoPorHoraTrabalhada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPagoPorHoraTrabalhada() {
        return valorPagoPorHoraTrabalhada;
    }

    public void setValorPagoPorHoraTrabalhada(double valorPagoPorHoraTrabalhada) {
        this.valorPagoPorHoraTrabalhada = valorPagoPorHoraTrabalhada;
    }


    public double getSalarioFinal() {
        calcularSalario();
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public void calcularSalario(){
        double salarioFinal;
        salarioFinal = this.valorPagoPorHoraTrabalhada * this.horasTrabalhadas;
        //System.out.println("\n" + salarioFinal);
        setSalarioFinal(salarioFinal);
    }

    public String exibir(){
        calcularSalario();
        return "Nome: " + this.nome +" - Horas Trabalhas: " + this.horasTrabalhadas + " - Valor Pago por hora: " + this.valorPagoPorHoraTrabalhada +" - Salario Final: " + this.salarioFinal;

    }


}



